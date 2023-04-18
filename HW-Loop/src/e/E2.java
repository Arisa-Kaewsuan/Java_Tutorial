package e;

import java.util.Scanner;

public class E2
{

	public static void main(String[] args)
	{ 
		//L.C.M
		int a , b ;
		Scanner p = new Scanner(System.in);
		System.out.print("Please Input 2 Numbers : ");
		a = p.nextInt();
		b = p.nextInt();
		
		int k=a;
		while(true) // infinit loop
		{
			if(k%a == 0 && k%b ==0)
			{
				break;
			}
			k++;
		}
		System.out.println(k);
        p.close();

	}

}
