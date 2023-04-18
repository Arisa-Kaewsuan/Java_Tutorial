import java.util.Scanner;

public class E1
{

	public static void main(String[] args)
	{
		int x = 10;
		System.out.println(sin (x));

	}
	public static double power (double a ,int b)
	{
		double sum = 1;
		for(int i = 1 ; i <= b ; i++)
		{
			sum *= a;
		}
		return sum;
	}
	public static double fac2 (int n)
	{
		if(n == 1 || n == 0)
			return 1;
		return n* fac2(n-1);
	}

	public static double sin(double x)
	{
		double result = 0;
		for(int i = 1 ; i <= 17 ;i+=2)
		{
			if(i%4 == 1)
			{
				result += power(x,i) / fac2(i);
			}
			else
			{
				result -= power(x,i) / fac2(i);
			}
		}
		return result;

	}

}
