/*input : Integer(n)*/
/*output : Print the results of 1 + 1/2^2 + 1/3^2 + 1/4^2 +.... + 1/n^2  */
/*         # ^ = power     */
/*Example : 10 --> 1.54976 */
/*          15 --> 1.58044 */
/*          6 --> 1.491388889 */

import java.util.Scanner;

public class D4
{

	public static void main(String[] args)
	{
		double polinomial = 0;
		Scanner p = new Scanner(System.in);

		int n = p.nextInt();
		for (int i = 1; i <= n; i++)
		{
			polinomial += 1 / Math.pow(i, 2);
		}
		System.out.println(polinomial);
		p.close();
	}

}
