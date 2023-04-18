import java.util.Scanner;

public class ED_4
{

	public static void main(String[] args)
	{
	  Scanner p = new Scanner (System.in);
	  int x = p.nextInt();
	  int y = p.nextInt();
	  int z = p.nextInt();
	  System.out.println(max(x,y,z));
	  p.close();

	}
	
	public static int max(int a , int b , int c)
	{
		if(a>b && a> c)
		   return a;
		else if(b>a && b>c)
			return b;
		else
			return c;
	}

}
