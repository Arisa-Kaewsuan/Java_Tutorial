import java.util.Scanner;

public class EA6_4
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		for(int i = 1 ; i <= n ; i++)
		{
			if(i < (n/2)+1)
			{
			   for(int j = 0 ; j < ((n/2)+1)-i ; j++)
			   { System.out.print("-"); }
			   System.out.print("x");
			}
			else
			{
				for(int j = 0 ; j < i-((n/2)+1) ; j++)
				{ System.out.print("-"); }
				System.out.print("x");
			}
			
			if(i < (n/2)+1)
			{
			   for(int j = 2 ; j < (i*2)-1 ; j++)
			   { System.out.print("-"); }
			   if(i != 1)
			   { System.out.print("x"); }
			}
			else
			{
				for(int j = 0 ; j < ((n*2)-1)-(i*2) ; j++)
				{ System.out.print("-"); }
				if(i != n)
				{ System.out.print("x"); }
			}
			
			if(i < (n/2)+1)
			{
			   for(int j = 0 ; j < ((n/2)+1)-i ; j++)
			   { System.out.print("-"); }
			}
			else
			{
				for(int j = 0 ; j < i-((n/2)+1) ; j++)
				{ System.out.print("-"); }
			}
			System.out.println();
		}

	}


	/*public static void main(String[] args)
	{
		Scanner p = new Scanner(System.in);
		int n = p.nextInt();
		int a = n / 2;
		int b = n - a;
		for (int i = 1; i <= a; i++)
		{
			for (int j = a - i + 1; j >= 1; j--)
			{
				System.out.print("-");
			}
			System.out.print("x");

			for (int k = 1; k < (i * 2) - 2; k++)
			{
				System.out.print("-");
			}
			if (i != 1) System.out.print("x");
			
			for (int j = a - i + 1; j >= 1; j--)
			{
				System.out.print("-");
			}
			System.out.println();
		}
		for (int l = 1; l <= b; l++)
		{
			for(int m = 1 ; m <= l-1 ; m++)
			{
				System.out.print("-");
			}
			System.out.print("x");
			for(int r = 1 ; r <= n-(l*2) ; r++)
			{
				System.out.print("-");
			}
			if(l != b) System.out.print("x");
			for(int m = 1 ; m <= l-1 ; m++)
			{
				System.out.print("-");
			}
			System.out.println();
		}

	}*/

}
