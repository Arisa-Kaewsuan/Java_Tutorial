package Extra1_Ifelse;
public class Extra1_2_3
{
    /* PV = nRT
     * P = 1 atm
     * V = 22.414 L
     * T = 273.15 K
     * n = 1 mol
     * # R = P*V / n*T 
     */
	public static void main(String[] args)
	{
		double  P , T , R , V , n ;
		n = 1 ;
		P = 1 ;
		V = 22.414 ;
		T = 273.15 ;
		R = (P*V) / (n*T) ;
		System.out.println("R = " +R);
		
		
		

	}

}
