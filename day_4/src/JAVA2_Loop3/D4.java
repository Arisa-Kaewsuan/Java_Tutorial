package JAVA2_Loop3;

import java.util.Scanner;

public class D4
{

	public static void main(String[] args)
	{
		int n ; 
		double sum=0 ;
		Scanner p = new Scanner(System.in);
		System.out.print("Please Input : ");
		n = p.nextInt();
		
		int i=1;
		while(i<=n)
		{
			sum += 1.0/(i*i);
			i++;
		}
		
		System.out.println("sum = "+sum);
		p.close();

	}

}
