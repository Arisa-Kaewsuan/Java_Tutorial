package Morning_Extra4_MethodAndArray2D;

import java.util.Scanner;

public class ED1
{

	public static void main(String[] args)
	{
		Scanner p = new Scanner(System.in);
		System.out.print("Input 2 numbers : ");
		int z;
		int x = p.nextInt();
		int y = p.nextInt();
		z = sum(x,y);
		System.out.println(z);
		p.close();

	}
	public static int sum(int a , int b)
	{
		int r = a+b;
		return r ;
	}
	
 
}
