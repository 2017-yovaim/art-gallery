package artGallery.models;

public class Painter 
{
	//to-do: data validation if necessary
	private Long id;
	private String firstName;
	private String lastName;
	private int birthYear;
	private int yearOfDeath;
	private String placeOfBirth;
	private String country;
	private String additionalInformation;
	
	public Long getId() 
	{
		return id;
	}
	
	public void setId(Long id) 
	{
		this.id = id;
	}
	
	public String getFirstName() 
	{
		return firstName;
	}
	
	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}
	
	public String getLastName() 
	{
		return lastName;
	}
	
	public void setLastName(String lastName) 
	{
		this.lastName = lastName;
	}
	
	public int getBirthYear() 
	{
		return birthYear;
	}
	
	public void setBirthYear(int birthYear) 
	{
		this.birthYear = birthYear;
	}
	
	public int getYearOfDeath() 
	{
		return yearOfDeath;
	}
	
	public void setYearOfDeath(int yearOfDeath) 
	{
		this.yearOfDeath = yearOfDeath;
	}
	
	public String getPlaceOfBirth() 
	{
		return placeOfBirth;
	}
	
	public void setPlaceOfBirth(String placeOfBirth) 
	{
		this.placeOfBirth = placeOfBirth;
	}
	
	public String getCountry() 
	{
		return country;
	}
	
	public void setCountry(String country) 
	{
		this.country = country;
	}
	
	public String getAdditionalInformation() 
	{
		return additionalInformation;
	}
	
	public void setAdditionalInformation(String additionalInformation) 
	{
		this.additionalInformation = additionalInformation;
	}
	
	//set-all constructor
	public Painter(Long id, String firstName, String lastName, int birthYear, int yearOfDeath, String placeOfBirth, 
			String country, String additionalInformation)
	{
		this.setId(id);
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setBirthYear(birthYear);
		this.setYearOfDeath(yearOfDeath);
		this.setPlaceOfBirth(placeOfBirth);
		this.setCountry(country);
		this.setAdditionalInformation(additionalInformation);
	}
	
	//no-year-of-death constructor
	public Painter(Long id, String firstName, String lastName, int birthYear, String placeOfBirth, 
			String country, String additionalInformation)
	{
		this.setId(id);
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setBirthYear(birthYear);
		this.setPlaceOfBirth(placeOfBirth);
		this.setCountry(country);
		this.setAdditionalInformation(additionalInformation);
	}
	
	//no-id constructor
	public Painter(String firstName, String lastName, int birthYear, int yearOfDeath, String placeOfBirth, 
			String country, String additionalInformation)
	{
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setBirthYear(birthYear);
		this.setYearOfDeath(yearOfDeath);
		this.setPlaceOfBirth(placeOfBirth);
		this.setCountry(country);
		this.setAdditionalInformation(additionalInformation);
	}
	
	//no-id and no year-of-death constructor
	public Painter(String firstName, String lastName, int birthYear, String placeOfBirth, 
			String country, String additionalInformation)
	{
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setBirthYear(birthYear);
		this.setPlaceOfBirth(placeOfBirth);
		this.setCountry(country);
		this.setAdditionalInformation(additionalInformation);
	}
	
	//default constructor
	public Painter()
	{
		this(0L, "Default Painter First Name", "Default Painter Last Name", 0, 0, "Default Place of Birth", 
				"Default Country", "Default Additional Painter Information");
	}
	
	public String toString()
	{
		return String.format("ID: %d. %s %s, born in %d in %s, %s. %s", this.getId(), this.getFirstName(),
				this.getLastName(), this.getBirthYear(), this.getPlaceOfBirth(), this.getCountry(), 
				this.getAdditionalInformation());
	}
}
