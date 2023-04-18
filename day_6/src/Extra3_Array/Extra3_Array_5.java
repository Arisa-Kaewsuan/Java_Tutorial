package Extra3_Array;

import java.util.Arrays;
import java.util.Scanner;

public class Extra3_Array_5
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

		// input v , index
		System.out.println("Input V : ");
		int V = p.nextInt();
		System.out.println("Input Index : ");
		int index = p.nextInt();

		// slide
		for (int i = x.length-1; i > index ; i--)
		{
			x[i] = x[i - 1];
		}

		// insert
		x[index] = V;
		System.out.println(Arrays.toString(x));
		p.close();
	}

}
