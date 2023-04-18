package JAVA2_Loop5;

import java.util.Scanner;

public class F3
{

	public static void main(String[] args)
	{
		int a  ;
		Scanner p = new Scanner(System.in);
		System.out.print("Please Input 2 Numbers : ");
		a = p.nextInt();
		
		int k=1 , count=0 ;
		while(k <= a)
		{
			if(a%k == 0)
			{
			count += 1 ; 
			}
			k++;
		}
		
		if(count == 2)
		{
			System.out.println(a + " is a prime");
		}
		else
		{
			System.out.println(a + " is not a prime");
		}
		//System.out.println(count);
        p.close();

	}

}
