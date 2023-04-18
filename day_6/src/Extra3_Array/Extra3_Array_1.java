package Extra3_Array;

import java.util.Scanner;

public class Extra3_Array_1
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

		int count = 0;
		for (int i = 0; i < x.length; i++)
		{
			if (x[i] >= 10)
			{
				count++;
			}
		}
		System.out.println(count);
		p.close();
	}
}
