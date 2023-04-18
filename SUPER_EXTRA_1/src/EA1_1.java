/*input : no input*/
/*output : Print 1-100*/
/*Example : 1 2 3 4 5 ... 100*/

import java.util.Scanner;

public class EA1_1
{
	/*public static void main(String[] args)
	{
	    Scanner sc = new Scanner (System.in);
	    double m1 = sc.nextDouble();
	    double m2 = sc.nextDouble();
	    double r = sc.nextDouble();
	    double f = (6.6e-11*m1*m2) / Math.pow(r, 2);
	    System.out.println(f);

	}*/
	
	public static void main(String[] args)
	{
		Scanner p = new Scanner (System.in);
		double R , m1 , m2 , F ;
		
		m1 = p.nextDouble();
		m2 = p.nextDouble();
		R = p.nextDouble();
		
		F = (6.6e-11 * m1 * m2) / Math.pow(R, 2);
		System.out.println(F);
		p.close();
	}

}
