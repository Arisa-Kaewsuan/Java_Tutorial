package Extra3_Array;

import java.util.Scanner;

public class Extra3_Array_2
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

		int V, count = 0;
		System.out.println("Input a Integer : ");
		V = p.nextInt();

		for (int i = 0; i < x.length; i++)
		{
			if (x[i] == V)
			{
				count++;
				break;
			}
		}

		if (count == 0)
		{
			System.out.println("Is not in Array");

		} else
		{
			System.out.println("Is in Array");

		}
		p.close();
	}

}
