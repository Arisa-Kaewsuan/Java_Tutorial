package Morning_Extra4_MethodAndArray2D;

import java.util.Scanner;

public class ED6
{

	public static void main(String[] args)
	{
		Scanner p = new Scanner(System.in);
		int n = p.nextInt();
		System.out.println(LargestPower(n));
		p.close();
	}

	public static int LargestPower(int n)
	{
		int a = 1;
		while (a * 2 < n)
		{
			a *= a;
		}
		if (a * 2 >= n)
			return n;
		return a;

	}
}
