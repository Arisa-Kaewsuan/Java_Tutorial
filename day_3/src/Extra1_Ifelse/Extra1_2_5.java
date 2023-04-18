package Extra1_Ifelse;

import java.util.Scanner;

public class Extra1_2_5
{
    /* R = (p*l) / A
     * psil = 1.59e-8
     */
	public static void main(String[] args)
	{   
		double R , l , A , p ;
		Scanner x = new Scanner(System.in);
		
		System.out.print("Input Area & Lenght : ");
		A = x.nextDouble();
		l = x.nextDouble();
		
		p = 1.59E-8 ;
		R = (p*l) / A ;
		System.out.println("R = " +R);
        x.close();
	}

}
