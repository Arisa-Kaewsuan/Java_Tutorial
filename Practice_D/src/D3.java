/*input : Integer(n)*/
/*output : Print the results of 1 + 1/2 + 1/3 + 1/4 +.... + 1/n  */
/*Example : 10 --> 2.9289682539 */
/*          5 --> 2.28333333333 */
/*          7 --> 2.59285714285 */

import java.util.Scanner;

public class D3
{

	public static void main(String[] args)
	{
		double fraction = 0;
		Scanner p = new Scanner(System.in);

		int n = p.nextInt();
		for (double i = 1; i <= n; i++)
		{
			fraction += 1 / i;
		}
		System.out.println(fraction);
		p.close();
	}

}
