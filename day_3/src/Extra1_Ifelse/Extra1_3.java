package Extra1_Ifelse;

public class Extra1_3
{

	public static void main(String[] args)
	{
		double g , G , m2 , R ;
		R = 6371e3 ;
		m2 = 5.974e24 ;
		G = 6.67e-11 ;
		g = (G*m2) / (R*R) ;
        System.out.println("g = "+g);
	}

}
