package artGallery.models;

import artGallery.enums.ArtPeriod;

public class Painting 
{
	//to-do: data validation if necessary
	private Long id;
	private String name;
	private int year;
	private ArtPeriod artPeriod;
	private Long painterId;
	private String additionalInformation;
	
	public Long getId() 
	{
		return id;
	}
	
	public void setId(Long id) 
	{
		this.id = id;
	}
	
	public String getName() 
	{
		return name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public int getYear() 
	{
		return year;
	}
	
	public void setYear(int year) 
	{
		this.year = year;
	}
	
	public ArtPeriod getArtPeriod() 
	{
		return artPeriod;
	}
	
	public void setArtPeriod(ArtPeriod artPeriod) 
	{
		this.artPeriod = artPeriod;
	}
	
	public Long getPainterId() 
	{
		return painterId;
	}
	
	public void setPainterId(Long painterId) 
	{
		this.painterId = painterId;
	}
	
	public String getAdditionalInformation()
	{
		return this.additionalInformation;
	}
	
	public void setAdditionalInformation(String additionalInformation)
	{
		this.additionalInformation = additionalInformation;
	}
	
	//set-all constructor
	public Painting(Long id, String name, int year, ArtPeriod artPeriod, Long painterId, String additionalInformation)
	{
		this.setId(id);
		this.setName(name);
		this.setYear(year);
		this.setArtPeriod(artPeriod);
		this.setPainterId(painterId);
		this.setAdditionalInformation(additionalInformation);
	}
	
	//no-id constructor
	public Painting(String name, int year, ArtPeriod artPeriod, Long painterId, String additionalInformation)
	{
		this.setName(name);
		this.setYear(year);
		this.setArtPeriod(artPeriod);
		this.setPainterId(painterId);
		this.setAdditionalInformation(additionalInformation);
	}
	
	//no-art-period constructor
	public Painting(Long id, String name, int year, Long painterId, String additionalInformation)
	{
		this.setId(id);
		this.setName(name);
		this.setYear(year);
		this.setPainterId(painterId);
		this.setAdditionalInformation(additionalInformation);
	}
	
	//no-id and no-art-period constructor
	public Painting(String name, int year,  Long painterId, String additionalInformation)
	{
		this.setName(name);
		this.setYear(year);
		this.setPainterId(painterId);
		this.setAdditionalInformation(additionalInformation);
	}
	
	//default constructor
	public Painting()
	{
		this(0L, "Default Painting Name", 0, ArtPeriod.DEFAULT_ART_PERIOD, 0L, "Default Additional Information");
	}
	
	
	@Override
	public String toString()
	{
		return String.format("ID: %d, \"%s\" by %d, Year: %d", this.getId(), this.getName(), this.getPainterId(), this.getYear());
	}
}
