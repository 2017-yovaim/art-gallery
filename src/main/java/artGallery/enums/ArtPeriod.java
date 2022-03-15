package artGallery.enums;

public enum ArtPeriod 
{
	//to-do: add more periods if necessary
	DEFAULT_ART_PERIOD(0),
	EUROPEAN_MODERNISM(1),
	EUROPEAN_CONTEMPORARY_ART(2),
	EUROPEAN_CLASSIC_ART(4);
	
	private int value;
	
	private ArtPeriod(int value)
	{
		this.value = value;
	}
	
	public int getValue()
	{
		return value;
	}
	
	public static ArtPeriod of(int value) 
	{
		for (ArtPeriod period : values()) 
		{
			if (period.value == value) 
			{
				return period;
			}
		}
		
		return ArtPeriod.DEFAULT_ART_PERIOD; //maybe replace that with throwing an exception so there are no data mistakes
	}
	
}
