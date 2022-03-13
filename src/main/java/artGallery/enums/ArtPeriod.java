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
	
}
