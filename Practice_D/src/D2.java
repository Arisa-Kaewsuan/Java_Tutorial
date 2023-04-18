/*input : Integer(n)*/
/*output : Print the results of 1*2*3*4*..*n  */
/*Example : 10 --> 3628800 */
/*          5 --> 120 */
/*          7 --> 5040 */

import java.util.Scanner;

public class D2
{

	public static void main(String[] args)
	{
		int multiply = 1;
		Scanner p = new Scanner(System.in);

		//System.out.println("Please Input : ");
		int n = p.nextInt();

		for (int i = 1; i <= n; i++)
		{
			multiply *= i;
		}
		System.out.println(multiply);
		p.close();
	}

}
