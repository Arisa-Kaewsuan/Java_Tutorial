/*input : enter 1 Decimal (frequency: f1)
          which will be in the form of a scientific notation (eg. -2.03*10^11 --> -2.03e11) */
/*output : find the speed of the car 
           v = (107585*10^8)*(f1-f0)/(f1+f0) 
           f0 = 2*10^10 */

/*Example : 2.000001e10 --> 268.962432 */

import java.util.Scanner;

public class E5_10
{

	public static void main(String[] args)
	{
		double f1 , f0=2e10 , v ;
		Scanner p = new Scanner(System.in);
		//System.out.print("Enter values f1 : ");
		f1 = p.nextDouble();
		v = (10.7585e8)*(f1-f0)/(f1+f0);
		System.out.println(v);
		p.close();
	}

}
