/*input : Integer(n)*/
/*output : Print the results of square root(6*(1 + 1/2^2 + 1/3^2 + 1/4^2 +.... + 1/n^2))  */
/*         # ^ = power     */
/*Example : 10000 --> 3.141 */
/*          100 --> 3.132 */
/*          50 --> 3.123 */

import java.util.Scanner;

public class D5
{

	/*public static void main(String[] args)
	{
		double polinomial = 0 , Sqrt = 0;
		Scanner p = new Scanner(System.in);

		int n = p.nextInt();
		for (int i = 1; i <= n; i++)
		{
			polinomial += 1 / Math.pow(i, 2);
		}
		Sqrt = Math.sqrt(6*polinomial);
		System.out.println(Sqrt);
		p.close();

	}*/
	
	public static void main(String[] args)
	{
		double polinomial = 0 , Sqrt = 0;
		Scanner p = new Scanner(System.in);

		int n = p.nextInt();
		for (int i = 1; i <= n; i++)
		{
			polinomial += 1 / Math.pow(i, 2);
		}
		System.out.printf("%.3f",Math.sqrt(6.0*polinomial));
		p.close();

	}


}
