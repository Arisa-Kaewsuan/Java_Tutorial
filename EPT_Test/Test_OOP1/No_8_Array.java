package Test_OOP1;

import java.util.Arrays;
import java.util.Scanner;

public class No_8_Array {

	public static void main(String[] args) 
	{
		Scanner p = new Scanner (System.in);
		int s = p.nextInt();
		int e = p.nextInt();
		int []fizzArray = new int [e-s];
		
		for(int i = 0 ; i < e-s ; i++)
		{
			fizzArray[i] = s+i ;
		}
		System.out.println(Arrays.toString(fizzArray));

	}

}
