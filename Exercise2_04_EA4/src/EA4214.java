import java.util.Scanner;

public class EA4214
{

	public static void main(String[] args)
	{
		Scanner p = new Scanner(System.in);
		int a = p.nextInt();
		int b = p.nextInt();
		int c = p.nextInt();

		int max = 0, min = 0;
		if (a > b && a > c)
		{
			max = a;
			min = b + c;
		} else if (b > a && b > c)
		{
			max = b;
			min = a + c;
		} else
		{
			max = c;
			min = a + b;
		}

		if (min > max)
			System.out.println("triangle");
		else
			System.out.println("not triangle");

	}

}
