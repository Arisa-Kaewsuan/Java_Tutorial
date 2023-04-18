package Extra3_Array;

import java.util.Arrays;
import java.util.Scanner;

public class J2
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
		
		for(int j = 0 ; j < x.length ; j++)
		{
			for(int i = x.length-1 ; i > 0 ; i++)
			{
				if(x[i] < x[i+1])
				{
					int a = x[i];
					x[i] = x[i+1];
					x[i+1] = a; 
				}
			}
		}
		System.out.println(Arrays.toString(x));
		p.close();

	}

}
