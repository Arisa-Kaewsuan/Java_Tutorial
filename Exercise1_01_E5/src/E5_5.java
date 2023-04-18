/*input : enter Integer (Celsius) */
/*output : Print result of ... convert Celsius to Fahrenheit (C = 5/9*(F-32)) */

/*Example : 37 --> 98.6 */
/*          27 --> 80.6 */
/*          32 --> 89.6 */

import java.util.Scanner;

public class E5_5
{

	public static void main(String[] args)
	{
		double C,F;
		Scanner p = new Scanner(System.in);
		
		//System.out.print("Enter value Celsius : ");
		C = p.nextDouble();
		
		F = (C*1.8)+32;
		System.out.println(F);
        p.close();
	}

}
