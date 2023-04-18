import java.util.Scanner;

public class ED_1
{
	public static void main(String[] args)
	{
	   Scanner p = new Scanner (System.in);
	   int x = p.nextInt();
	   int y = p.nextInt();
	   System.out.println(adds(x,y));
       p.close();
	} 
	
	public static int adds(int a , int b)
	{
		int sum = a+b ;
		return sum;
	}

}
