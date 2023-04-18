/*input : enter 2 integer (a,b) */
/*output : Print the number that is greater */
/*Example : 9 5 --> 9 */
/*          10 15 --> 15 */
/*          6 7 --> 7 */

import java.util.Scanner;

public class E1
{
	public static void main(String[] args)
	{
		Scanner p = new Scanner(System.in);
		int a = p.nextInt();
		int b = p.nextInt();

		if (a > b)
		{
			System.out.println(a);
		} else 
		{
			System.out.println(b);
		} 
		p.close();
	}


	/*public static void main(String[] args)
	{
		int max = Integer.MIN_VALUE;
		Scanner p = new Scanner(System.in);
		int a = p.nextInt();
		int b = p.nextInt();

		if (a > b)
		{
			max = a;
		} else if (b > a)
		{
			max = b;
		} else if (b == a)
		{
			max = b;
		}
		System.out.println(max);
		p.close();
	}*/

}
