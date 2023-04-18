package Morning_Extra4_MethodAndArray2D;

import java.util.Scanner;

public class ED7
{

	public static void main(String[] args)
	{
		Scanner p = new Scanner(System.in);
		int x = p.nextInt();
		System.out.println(isPrime(x));
		p.close();
	}

	public static int isPrime(int x)
	{
		for (int i = 2; i < x; i++)
		{
			if (x % i == 0)
			{
				return 0;
			}
		}
		return 1;

	}

}
