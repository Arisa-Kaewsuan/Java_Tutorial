import java.util.Scanner;

public class ED_6
{

	public static void main(String[] args)
	{
		Scanner p = new Scanner(System.in);
		int n = p.nextInt();
		System.out.println(num(n));
		p.close();
	}

	public static int num(int a)
	{
		int b = 0;
		for(int i = 1 ; i < Integer.MAX_VALUE ; i++)
		{
			if (Math.pow(2, i) > a)
			{
				b = (int)Math.pow(2, i-1);
				break;
			}
		}
		return b;

	}

}
