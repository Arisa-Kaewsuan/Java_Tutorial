package Method;

import java.util.Scanner;

public class Function_power_2
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
	
	public static double power(double x , int n)
	{
		int i = n ;
		double sum = 1 ;
		while(i > 0)
		{
			if(i%2 == 1)
			{
				sum *= x ;
				i--;
			}
			else
			{
				x *= x ;
				i = i/2 ;
			}
		}
		return sum ;
	}

}
