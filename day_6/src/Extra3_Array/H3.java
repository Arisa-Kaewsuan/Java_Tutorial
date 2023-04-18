package Extra3_Array;

import java.util.Scanner;

public class H3
{

	public static void main(String[] args)
	{
		int[] x = new int[10];
		Scanner p = new Scanner(System.in);

		for (int i = 0; i < x.length; i++)
		{
			System.out.print("Please Input Number : ");
			x[i] = p.nextInt();
		}
		
		for(int i = x.length-1 ; i>= 0 ; i--)
		{
			System.out.print(x[i]+"\t");
		}
		p.close();
	}

}
