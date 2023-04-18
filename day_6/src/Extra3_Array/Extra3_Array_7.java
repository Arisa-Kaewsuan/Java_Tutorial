package Extra3_Array;

import java.util.Arrays;
import java.util.Scanner;

public class Extra3_Array_7
{

	public static void main(String[] args)
	{
		int[] A = new int[10];
		Scanner p = new Scanner(System.in);

		// input array A
		for (int i = 0; i < A.length; i++)
		{
			System.out.print("Input : ");
			A[i] = p.nextInt();
		}

		// input array B
		int[] B = new int[10];
		for (int i = 0; i < B.length; i++)
		{
			System.out.print("Input : ");
			B[i] = p.nextInt();
		}

		// input array C
		int[] C = new int[10];
		for (int i = 0; i < C.length; i++)
		{
			System.out.print("Input : ");
			C[i] = p.nextInt();
		}
		
		// copy A
		for (int i = 0; i < A.length; i++)
		{
			C[i] = A[i] ;
		}
		
		// copy B
		for (int i = 0; i < B.length; i++)
		{
			C[i+10] = B[i] ;
		}
		System.out.println(Arrays.toString(C));
		p.close();
	}

}
