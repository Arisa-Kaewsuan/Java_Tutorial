package Test_OOP1;

import java.util.Scanner;

public class No_6 {

	public static void main(String[] args) 
	{
		Scanner x = new Scanner(System.in);
		int []maxtriple = new int[3];
		int max =0 , t;
	    maxtriple[0] = x.nextInt() ;
	    maxtriple[1] = x.nextInt() ;
	    maxtriple[2] = x.nextInt() ;
		
		for(int i = 0 ; i < maxtriple.length ; i++)
		{
			for(int j = 0 ; j < maxtriple.length-i-1 ; i++)
			{
			if(maxtriple[i] > maxtriple[i+1])
			{
				t = maxtriple[i];
				maxtriple[i] = maxtriple[i+1];
				maxtriple[i+1] = t;
			}
			}
				
		}
		System.out.println(maxtriple[2]);
	}

}
