package Method;

import java.util.Scanner;

public class Function_fac
{

	public static void main(String[] args)
	{
		Scanner p = new Scanner (System.in);
		int n = p.nextInt();
		int z = fac(n) ;
		System.out.println(z);
		p.close();

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
