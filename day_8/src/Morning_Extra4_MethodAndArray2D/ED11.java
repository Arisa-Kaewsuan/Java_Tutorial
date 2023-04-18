package Morning_Extra4_MethodAndArray2D;

import java.util.Scanner;

public class ED11
{

	public static void main(String[] args)
	{
		Scanner p = new Scanner(System.in);
		char[][] x = new char[][]
		{
				{ 'a', 'b', 'c', 'd' },
				{ 'e', 'f', 'g', 'h' },
				{ 'i', 'j', 'k', 'l' },
				{ 'm', 'n', 'o', 'p' } };
		System.out.print(x);
		while (true)
		{
			// Recieve Input
			System.out.println("Input(1:3) and (l,r,u,d) : ");
			int n = p.nextInt();
			p.nextLine();

			if (n == -1)
				break;
			String c = p.nextLine();

			// Rotate Left
			if (c.charAt(0) == 'l')
			{
				char t = x[n][0];
				for (int i = 0; i < x[0].length - 1; i++)
				{
					x[n][i] = x[n][i + 1];
				}
				x[n][x[0].length - 1] = t;
			}

			// Rotate Right
			else if (c.charAt(0) == 'r')
			{
				char t = x[n][x[0].length - 1];
				for (int i = x[0].length - 1 ; i > 0; i--)
				{
					x[n][i] = x[n][i - 1];
				}
				x[n][0] = t;
			}
			
			// Rotate down
			else if(c.charAt(0) == 'd')
			{
				int i = x.length-1;
				char t = x[x[0].length-1][n];
				for(; i > 0 ; i--)
				{
					x[i][n] = x[i-1][n] ;
				}
				x[0][n] = t ;
			}
			
			// Rotate Up
			else if (c.charAt(0) == 'u')
			{
				
			}
			System.out.println(x);

		}
		p.close();
	}

	public static void print(char[][] x)
	{
		for (int i = 0; i < x.length; i++)
		{
			for (int j = 0; j < x.length; j++)
			{
				System.out.println(x[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
