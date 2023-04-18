package Extra3_Array;

import java.util.Scanner;

public class H7
{

	public static void main(String[] args)
	{
		int[] x = new int[10];
		Scanner p = new Scanner(System.in);

		for (int i = 0; i < x.length; i++)
		{
			System.out.print("Please Input a Number : ");
			x[i] = p.nextInt();
		}

		int mul = 1;
		for (int i = 0; i < x.length; i++)
		{
			mul *= x[i];
		}
		System.out.println("multiplies = " + mul);
		p.close();
	}
}
