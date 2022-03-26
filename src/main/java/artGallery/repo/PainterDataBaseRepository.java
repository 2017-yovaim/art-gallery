package artGallery.repo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import artGallery.models.Painter;

@Repository("painterDataBaseRepo")
public class PainterDataBaseRepository implements IPainterRepo
{
	
	//to-do: addPainter method

	@Autowired
	private JdbcTemplate connection;
	
	@Override
	public List<Painter> getAll() 
	{
		return new ArrayList<Painter>(connection.query("SELECT * FROM Painters", new RowMapper<Painter>() {

			@Override
			public Painter mapRow(ResultSet rs, int rowNum) throws SQLException 
			{
				Painter toReturn = new Painter();
				toReturn.setId(rs.getLong("ID"));
				toReturn.setFirstName(rs.getString("FirstName"));
				toReturn.setLastName(rs.getString("LastName"));
				toReturn.setBirthYear(rs.getInt("BirthYear"));
				toReturn.setYearOfDeath(rs.getInt("YearOfDeath"));
				toReturn.setPlaceOfBirth(rs.getString("PlaceOfBirth"));
				toReturn.setCountry(rs.getString("Country"));
				toReturn.setAdditionalInformation(rs.getString("AdditionalInformation"));
				return toReturn;
			}
			
		}));
	}

	@Override
	public Painter getByID(Long id) 
	{
		List<Painter> painters = getAll();
		for(Painter p : painters)
		{
			if(p.getId() == id)
				return p;
		}
		return null;
	}

	@Override
	public void addPainter(Painter painter) 
	{
		connection.update("INTO INTO Painters(FirstName, LastName, BirthYear, YearOfDeath, PlaceOfBirth, Country, AdditionalInformation) VALUES(?, ?, ?, ?, ?, ?, ?)", 
				painter.getFirstName(), painter.getLastName(), painter.getBirthYear(), painter.getYearOfDeath(),
				painter.getPlaceOfBirth(), painter.getCountry(), painter.getAdditionalInformation());
		
	}

}
