package Extra3_Array;

import java.util.Scanner;

public class K1
{

	public static void main(String[] args)
	{
		int[][] A = new int[3][3];
		int[][] B = new int[3][3];
		int[][] C = new int[3][3];
		int[][] D = new int[3][3];
		Scanner p = new Scanner(System.in);

		// input for A
		for (int i = 0; i < A.length; i++)
		{
			for (int j = 0; j < A[0].length; j++)
			{
				System.out.println("Please Input A: ");
				A[i][j] = p.nextInt();
			}
		}

		// input for B
		for (int i = 0; i < B.length; i++)
		{
			for (int j = 0; j < B[0].length; j++)
			{
				System.out.println("Please Input B: ");
				B[i][j] = p.nextInt();
			}
		}

		// matrix plus
		for (int i = 0; i < B.length; i++)
		{
			for (int j = 0; j < B[0].length; j++)
			{
				C[i][j] = A[i][j] + B[i][j];
			}
		}

		/*
		 * for(int i = 0 ; i < A.length ; i++) { for(int j = 0 ; j < A[0].length ; j++)
		 * { System.out.println(C[i][j]+" "); } System.out.println(); }
		 */

		// matrix multiply
		for (int i = 0; i < B.length; i++)
		{
			for (int j = 0; j < B[0].length; j++)
			{
				int sum = 0;
				for (int k = 0; k < B.length; k++)
				{
					sum += A[i][k] * B[k][j];
				}
				D[i][j] = sum;
			}
			System.out.println();
		}

		// print A
		for (int i = 0; i < B.length; i++)
		{
			for (int j = 0; j < B[0].length; j++)
			{
				System.out.println(A[i][j] + "\t");
			}
			System.out.println();
		}

		// print B
		for (int i = 0; i < B.length; i++)
		{
			for (int j = 0; j < B[0].length; j++)
			{
				System.out.println(B[i][j] + "\t");
			}
			System.out.println();
		}
		
		// print C
		for (int i = 0; i < B.length; i++)
		{
			for (int j = 0; j < B[0].length; j++)
			{
				System.out.println(C[i][j] + "\t");
			}
			System.out.println();
		}
		
		// print D
		for (int i = 0; i < B.length; i++)
		{
			for (int j = 0; j < B[0].length; j++)
			{
				System.out.println(D[i][j] + "\t");
			}
			System.out.println();
		}
		p.close();
	}

}
