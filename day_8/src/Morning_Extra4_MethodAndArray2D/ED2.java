package Morning_Extra4_MethodAndArray2D;

import java.util.Scanner;

public class ED2
{

	public static void main(String[] args)
	{
		Scanner p = new Scanner(System.in);
		System.out.println("Please Input 2 numbers :");
		int x = p.nextInt();
		int y = p.nextInt();
		int[] z = new int [1] ;
		sum(x,y,z) ;
        System.out.println(z[0]);
        p.close();
	}
	
	public static void sum(int a , int b , int [] c)
	{
		c[0] = a + b ;
	
	}

}
