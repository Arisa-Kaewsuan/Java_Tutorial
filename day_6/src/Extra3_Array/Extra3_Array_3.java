package Extra3_Array;

import java.util.Scanner;

public class Extra3_Array_3
{

	public static void main(String[] args)
	{
		int[] x = new int[10];
		Scanner p = new Scanner(System.in);

		for (int i = 0; i < x.length; i++)
		{
			System.out.print("Input : ");
			x[i] = p.nextInt();
		}

		int max = Integer.MIN_VALUE , max_index = 0 ;
		for (int i = 0; i < x.length; i++)
		{
			if (x[i] > max)
			{
				max = x[i];
				max_index = i ;
			}
		}
		System.out.println("Max_Value = " + max);
		System.out.println("Max_Index = " + max_index);
		p.close();
	}
}
