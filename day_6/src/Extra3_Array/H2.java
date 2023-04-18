package Extra3_Array;

import java.util.Scanner;

public class H2
{

	public static void main(String[] args)
	{
		int[] x = new int[10];
		Scanner p = new Scanner(System.in);

		for (int i = 0; i < x.length; i++)
		{
			System.out.println("Please Input a Numbers : ");
			x[i] = p.nextInt();
		}
		p.close();
	}
}
