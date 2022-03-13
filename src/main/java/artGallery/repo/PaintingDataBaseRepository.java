package artGallery.repo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import artGallery.enums.ArtPeriod;
import artGallery.models.Painting;

@Repository("PaintingDataBaseRepo")
public class PaintingDataBaseRepository implements IPaintingRepo
{
	
	//to-do: turn enum id into enum "object"
	//to-do: addPainting method

	private JdbcTemplate connection;
	
	@Override
	public List<Painting> getAll() 
	{
		return new ArrayList<Painting>(connection.query("SELECT * FROM Paintings", new RowMapper<Painting>() {

			@Override
			public Painting mapRow(ResultSet rs, int rowNum) throws SQLException 
			{
				Painting toReturn = new Painting();
				toReturn.setId(rs.getLong("ID"));
				toReturn.setName(rs.getString("PaintingName"));
				toReturn.setYear(rs.getInt("Year"));
				//toReturn.setArtPeriod(new ArtPeriod(rs.getInt("ArtPeriodID")));
				toReturn.setPainterId(rs.getLong("PainterID"));
				toReturn.setAdditionalInformation(rs.getString("AdditionalInformation"));
				return toReturn;
			}
			
		}));
	}

	@Override
	public Painting getByID(Long id) {
		List<Painting> allPaintings = getAll();
		for(Painting painting : allPaintings)
		{
			if(painting.getId() == id)
				return painting;
		}
		return null;
		
	}

	@Override
	public void addPainting(Painting painting) 
	{
		// TODO Auto-generated method stub
		
	}

}
