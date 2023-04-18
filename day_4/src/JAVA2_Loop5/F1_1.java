package JAVA2_Loop5;

import java.util.Scanner;

public class F1_1
{

	public static void main(String[] args)
	{
		int a  ;
		Scanner p = new Scanner(System.in);
		//System.out.print("Please Input 2 Numbers : ");
		a = p.nextInt();
		
		int k=1 ;
		while(k < a)
		{
			if(a%k == 0)
			{
			System.out.println(k);
			}
			k++;
		}
        p.close();

	}

}
