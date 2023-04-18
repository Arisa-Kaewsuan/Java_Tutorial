package Super_Extra2_Loop;

import java.util.Scanner;

public class No_5
{

	public static void main(String[] args)
	{
		Scanner p = new Scanner(System.in);
		
		System.out.print("Input N : ");
		int n = p.nextInt();
		
		int i=0  ;
		while(i<n)
		{  
			int j = 0;
			while(j < n-i)
			{
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
		p.close();

	}

}
