import java.util.Scanner;

public class ED_2
{
	public static void main(String[] args)
	{
		Scanner p =new Scanner (System.in);
		int x = p.nextInt();
		int y = p.nextInt();
		adds(x,y);
		p.close();
		
	}
	
	public static void  adds(int a , int b)
	{
		System.out.println(a+b);
	}
}
