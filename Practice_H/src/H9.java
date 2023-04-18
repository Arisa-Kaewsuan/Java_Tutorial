/*input : enter 10 Integer put it in Array*/
/*output : Print maximum number in array  */
/*Example : 1 2 3 4 5 6 7 8 9 10 --> 10 */

import java.util.Scanner;

public class H9
{
	public static void main(String[] args)
	{
		int[] x = new int[10];
		int max = Integer.MIN_VALUE;
		Scanner p = new Scanner(System.in);

		for (int i = 0; i < x.length; i++)
		{
			x[i] = p.nextInt();
			if(max<x[i]) {max = x[i];}
		}
		System.out.println(max);
	}

	/*public static void main(String[] args)
	{
		int[] x = new int[10];
		Scanner p = new Scanner(System.in);

		for (int i = 0; i < x.length; i++)
		{
			//System.out.print("Please Input a Number : ");
			x[i] = p.nextInt();
		}
		
		int max = Integer.MIN_VALUE;
		for(int i = 0 ; i < x.length ; i++)
		{
			if(x[i] > max)
			{
				max = x[i];
			}
		}
		System.out.println(max);
		p.close();
	}*/

}
