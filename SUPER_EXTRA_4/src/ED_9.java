import java.util.Scanner;

public class ED_9
{

	public static void main(String[] args)
	{
		Scanner p = new Scanner(System.in);
		int x = p.nextInt();
		String a = toString(x);
		char i = 0;
		while (true)
		{
			i = a.charAt(0);
			if (i == 0)
			{
				i = a.charAt(i++);
			} else
			     break;
		}
		System.out.println(i);
		p.close();
	}

	public static String toString(int i)
	{
		return Integer.toString(i, 0);
	}

}
