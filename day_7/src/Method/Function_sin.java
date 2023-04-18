package Method;

import java.util.Scanner;

public class Function_sin
{

	public static void main(String[] args)
	{
		Scanner p = new Scanner (System.in);
		double x = p.nextDouble();
		int y = p.nextInt();
		double z,a ;
		z = power(x,y) ;
		a = fac(y) ;
		System.out.println(z);
		System.out.println(a);
		System.out.println(sin(Math.PI/2));
		p.close();
	}
	
	public static double sin (double x)
	{
		double result = 0 ;
		for(int i = 1 ; i <= 17 ; i=i+2)
		{
			if(i%4 == 1)
			{
				result += power(x,i) / fac(i) ;
			}
			else
			{
				result -= power(x,i) / fac(i) ;
			}
		}
		return result ;
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
	
	public static int fac(int x)
	{
		int result = 1 ;
		for(int i = 1 ; i <= x ; i++)
		{
			result *= i ;
		}
		return result;
	}

}
