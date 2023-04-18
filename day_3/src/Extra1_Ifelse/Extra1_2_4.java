package Extra1_Ifelse;

public class Extra1_2_4
{
    /* l = 2.7 m
     * T = 3.298 s
     * T = 2Pi Sqrt(l/g)
     */
	public static void main(String[] args)
	{
		double T , l , g ;
		l = 2.7 ;
		T = 3.298 ;
		g = (4*Math.pow(Math.PI,2)*l) / (T*T) ;
		System.out.println("g = " +g);

	}

}
