package worldcitiespop;

public class City
{
    // Country , City , AccentCity , Region , Population , Latitude , Longitude 
	String Country ;
	String City ;
	String AccentCity ;
	String Region ;
	long Population ;
	double  Latitude , Longitude ;
	
	public String toString()
	{
		return String.format("%s\t %s\t %\t%s\t%s\t%d\t%f\t%f", Country , City , AccentCity , Region , Population , Latitude , Longitude);
	}
}
