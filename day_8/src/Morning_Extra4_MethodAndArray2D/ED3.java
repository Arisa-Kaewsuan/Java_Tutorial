package Morning_Extra4_MethodAndArray2D;

import java.util.Scanner;

public class ED3
{

	public static void main(String[] args)
	{
		int x , y , z , w;
		Scanner p = new Scanner (System.in);
		x = p.nextInt();
		y = p.nextInt();
		w = p.nextInt();
		z = max3(x,y,w) ;
		System.out.println(z);
        p.close();
	}
	
	public static int max (int a , int b)
	{
		return a>b ? a:b ;
	}
	
	public static int max3(int a , int b , int c)
	{
		int m = max(a,b) ;  // return (max(a,b),c); 
		m = max(m,c);
		return m;
	}

}
