package Morning_Extra4_MethodAndArray2D;

import java.util.Scanner;

public class ED5
{

	public static void main(String[] args)
	{
		double x ;
		Scanner p = new Scanner (System.in);
		System.out.println(" Please Number : ");
		x = p.nextDouble();
		System.out.println( absolute(x));
		p.close();
	}
	public static double absolute (double x)
	{
		if(x>= 0)  return x;
		return x*-1;
	}

}
