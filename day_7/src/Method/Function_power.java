package Method;

import java.util.Scanner;

public class Function_power
{

	public static void main(String[] args)
	{
		Scanner p = new Scanner (System.in) ;
		double x = p.nextDouble();
		int y = p.nextInt();
		double z ;
		z = power(x,y) ;
		System.out.println(z);
		p.close();
	}
	
	public static double power(double a , int b)
	{
		double sum = 1 ;
		for(int i = 1 ; i<=b ; i++)
		{
			sum *= a ;
		}
		return sum;
	}
	

}
