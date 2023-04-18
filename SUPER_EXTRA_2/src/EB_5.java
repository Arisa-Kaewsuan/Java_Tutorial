import java.util.Scanner;

public class EB_5
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		for(int i = 1 ; i <= n ; i++)
		{
			for(int j = 0 ; j < (n+1)-i ; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}


	/*public static void main(String[] args)
	{
		Scanner p = new Scanner(System.in);
		int N = p.nextInt();

		for (int i = 1; i <= N ; i++)
		{
			for (int j = 1; j <= (N + 1) - i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		p.close();

	}*/

}
