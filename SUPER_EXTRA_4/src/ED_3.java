import java.util.Scanner;

public class ED_3
{
	public static void main(String[] args)
	{
		Scanner p = new Scanner (System.in);
		int x = p.nextInt();
		int y = p.nextInt();
		System.out.println(max(x,y));
		p.close();

	}

	public static int max(int a , int b)
	{
		if(a>b)
			return a;
		else
			return b;
	}
}
