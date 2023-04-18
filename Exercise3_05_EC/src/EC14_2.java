import java.util.Scanner;

public class EC14_2
{
	public static void main(String[] args)
	{
		Scanner p = new Scanner(System.in);
		int n = p.nextInt();
		double r=0 ;

		for (int j = 0; j <= n; j++)
		{
			r +=  1.0 / fac(j);
		}
		System.out.println(r);

	}

	public static double fac(int num)
	{
		double mul = 1;
		for (int i = num; i > 0; i--)
		{
			mul *= i;
		}
		return mul;
	}

}
