import java.util.Scanner;

public class ED_5
{

	public static void main(String[] args)
	{
		Scanner p = new Scanner (System.in);
		int x = p.nextInt();
		System.out.println(abs(x));
		p.close();
	}
	
	public static double abs(int a)
	{
		return Math.abs(a);
	}

}
