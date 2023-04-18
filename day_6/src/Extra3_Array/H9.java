package Extra3_Array;

import java.util.Scanner;

public class H9
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
	}
}
