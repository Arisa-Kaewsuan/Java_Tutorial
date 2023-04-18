/*input : Integer(n)*/
/*output : Print the results of 1+2+3+4+..+n*/
/*Example : 10 --> 55 */
/*          20 --> 210 */
/*          15 --> 120 */

import java.util.Scanner;

public class D1
{

	public static void main(String[] args)
	{
		/*int sum = 0;
		Scanner p = new Scanner(System.in);

		//System.out.print("Please Input : ");
		int n = p.nextInt();

		for (int i = 1; i <= n; i++)
		{
			sum += i;
		}
		System.out.println(sum);
		p.close();*/
		
		Scanner p = new Scanner(System.in);
		int n = p.nextInt();
		int sum = (n*(n+1))/2;
		System.out.println(sum);
		p.close();
	}
}
