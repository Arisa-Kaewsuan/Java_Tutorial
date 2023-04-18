/*input : enter 10 Integer put it in Array*/
/*output : Print all even numbers in array */
/*Example : 1 2 3 4 5 6 7 8 9 10 --> 2 4 6 8 10 */
/*          11 12 13 14 15 16 17 18 19 20 --> 12 14 16 18 20 */

import java.util.Scanner;

public class H4
{
	public static void main(String[] args)
	{
		int[] a = new int[10];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < a.length; i++)
		{
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < a.length; i++)
		{
			if (a[i] % 2 == 0)
			{
				System.out.println(a[i]);
			}
		}
	}

	/*public static void main(String[] args)
	{
		int i;
		int[] x = new int[10];
		Scanner p = new Scanner(System.in);

		for (i = 0; i < x.length; i++)
		{
			// System.out.println("Please Input a Numbers : ");
			x[i] = p.nextInt();
		}
		for (i = 0; i < x.length; i++)
		{
			if (x[i] % 2 == 0)
			{
				System.out.println(x[i]);
			}
		}
		p.close();

	}*/

}
