package Test_JAVA_Part1;

import java.util.Scanner;

public class No_2 {

	public static void main(String[] args) 
	{
		Scanner x = new Scanner (System.in);
		int n = x.nextInt();
		int r=0 ,xx = 0;
		
		for(int i = 1 ; i<=n ; i++)
		{
			r += Math.pow(n,i);
		}
        System.out.printf("r = %s",Math.sqrt(r));
        System.out.println();
        xx = (int)Math.sqrt(r);
        System.out.println("r = " + xx);


	}

}
