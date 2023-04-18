import java.util.Scanner;

public class EE9
{

	public static void main(String[] args)
	{
		Scanner p = new Scanner(System.in);
		int m = p.nextInt();
		int n = p.nextInt();
		if (m >= n)
		{
			for (int i = n; i <= m; i++)
			{
				if(i == m)
					System.out.print(i);
				else
					System.out.print(i+",");
			}
		}
		p.close();

	}

}
