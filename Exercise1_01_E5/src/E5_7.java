/*input : enter 3 decimal */
/*output : Print sum & avg */

/*Example : 3.0  7.0  1.5 --> 11.5  3.833 */
/*          5.2  1    6   --> 12.2  4.066 */
/*          7    5    2.5 --> 14.5  4.833 */

import java.util.Scanner;

public class E5_7
{

	public static void main(String[] args)
	{
		double a,b,c,sum,avg;
		Scanner p = new Scanner (System.in);
		
		//System.out.print("Enater Decimal Values 1 : ");
		a = p.nextDouble();
		//System.out.print("Enater Decimal Values 2 : ");
		b = p.nextDouble();
		//System.out.print("Enater Decimal Values 3 : ");
		c = p.nextDouble();
		
		sum = a+b+c;
		avg = sum/3;
		
		System.out.println(sum);
		System.out.println(avg);
		p.close();

	}

}
