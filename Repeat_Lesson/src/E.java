import java.util.Scanner;

public class E
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		double y = 7.5;
		int x = 2;
		System.out.println(power(y,x));
	}

	public static double power(double a,int b)
	{
		int sum = 1;
		for(int i = 1;i <= b;i++)
		{
			sum *= a;
		}
		return sum;
	}

}
