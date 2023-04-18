package Extra3_Array;

import java.util.Scanner;

public class H1
{

	public static void main(String[] args)
	{
		int[] x = new int[10];
		Scanner p = new Scanner(System.in);

		for (int i = 0; i <= x.length; i++)
		{
			System.out.print("Please Input a Numbers : ");
			x[i] = p.nextInt();
		}

		int count = 0;
		for (int i = 0; i <= x.length; i++)
		{
			if (x[i] % 2 == 0)
			{
				count++;
				break;
			}
		}

		if (count > 0)
		{
			System.out.println("Have a even nuber");
		} else
		{
			System.out.println("Have a even nuber");
		}
	}

}
