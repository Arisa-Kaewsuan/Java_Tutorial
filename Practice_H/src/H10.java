/*input : enter 10 Integer put it in Array*/
/*output : Print minimum number in array  */
/*Example : 1 2 3 4 5 6 7 8 9 10 --> 1 */

import java.util.Arrays;
import java.util.Scanner;

public class H10
{
	public static void main(String[] args)
	{
		int[] x = new int[10];
		int min = Integer.MAX_VALUE;
		Scanner p = new Scanner(System.in);

		for (int i = 0; i < x.length; i++)
		{
			x[i] = p.nextInt();
			if(min>x[i]) {min = x[i];}
		}
		System.out.println(min);
	}

	/*public static void main(String[] args)
	{
		int min = Integer.MAX_VALUE;
		int[] x = new int[10];
		Scanner p = new Scanner(System.in);

		for (int i = 0; i < x.length; i++)
		{
			// System.out.println("Please Input a Numbers : ");
			x[i] = p.nextInt();
		}
		for (int i = 0; i < x.length; i++)
		{
			if (x[i] < min)
			{
				min = x[i];
			}
		}
		System.out.println(min);
		p.close();

	}*/

}
