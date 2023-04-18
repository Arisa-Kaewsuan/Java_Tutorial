/*input : enter 3 Integer */
/*output : Print sum & avg */

/*Example : 7 11 32 --> 50  16.66 */
/*          5 10 15 --> 30  10.0 */
/*          7 3  9  --> 19  6.33 */

import java.util.Scanner;

public class E5_6
{

	public static void main(String[] args)
	{
		double a,b,c,sum,avg;
		Scanner p = new Scanner (System.in);
		
		//System.out.print("Enter value 1 : ");
		a = p.nextInt();
		
		//System.out.print("Enter value 2 : ");
		b = p.nextInt();
		
		//System.out.print("Enter value 3 : ");
		c = p.nextInt();
		
		sum = a+b+c;
		avg = sum/3.0;
		
		System.out.println(sum);
		System.out.println(avg);
		p.close();

	}

}
