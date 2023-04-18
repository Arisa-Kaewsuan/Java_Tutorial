import java.util.Scanner;

public class Ex_Method
{

	public static void main(String[] args)
	{
		Scanner p = new Scanner(System.in);
		int a = p.nextInt();
		int b = p.nextInt();
		int z = add(a, b);
		int m = minus(a, b);
		System.out.println(z + ":" + m);
		p.close();
	}

	public static int add(int a, int b)
	{
		int sum;
		sum = a + b;
		return sum;
	}

	public static int minus(int a, int b)
	{
		int sum;
		sum = a - b;
		return sum;
	}

}
