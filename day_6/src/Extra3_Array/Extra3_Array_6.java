package Extra3_Array;

import java.util.Arrays;
import java.util.Scanner;

public class Extra3_Array_6
{

	public static void main(String[] args)
	{
		int[] x = new int[10];
		Scanner p = new Scanner(System.in);

		// input array x
		for (int i = 0; i < x.length; i++)
		{
			System.out.print("Input : ");
			x[i] = p.nextInt();
		}

		for (int j = 0; j < x.length; j++)
		{
			// find min
			int min = Integer.MIN_VALUE;
			int min_index = -1;
			for (int i = 0; i < x.length - j; i++)
			{
				if (x[i] < min)
				{
					min = x[i];
					min_index = i;
				}
			}

			// change
			int t = x[x.length - j - 1];
			x[x.length-j-1] = x[min_index] ;
			x[min_index] = t ;
		}
		System.out.println(Arrays.toString(x));
		p.close();
	}
}
