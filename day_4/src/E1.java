

import java.util.Scanner;

public class E1
{

	public static void main(String[] args)
	{
		int a , b ;
		Scanner p = new Scanner(System.in);
		//System.out.print("Please Input 2 Numbers : ");
		a = p.nextInt();
		b = p.nextInt();
		
		int k=a;
		while(a%k != 0 || b%k !=0)
		{
			k--;
		}
		System.out.println(k);
        p.close();		
	}

}
