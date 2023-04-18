package Test_OOP1;

import java.util.Scanner;

public class No_2_sqrt {

	public static void main(String[] args) 
	{
		Scanner p = new Scanner (System.in);
		int n = p.nextInt();
		double r=0;
		for(int i = 1 ; i <= n ; i++)
		{
			r += Math.sqrt(1/Math.pow(i, 2));
		}
        System.out.println(r);

	}

}
