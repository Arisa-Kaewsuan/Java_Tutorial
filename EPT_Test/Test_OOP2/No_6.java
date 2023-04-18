package Test_OOP2;

import java.util.Scanner;

public class No_6 {

	public static void main(String[] args) 
	{

		Scanner p = new Scanner (System.in);
		int n = p.nextInt();
		int n2 = n*n ;
		String num = Integer.toString(n);
		String num2 = Integer.toString(n2);
		
		for(int i = num.length()-1 ; i >= 0 ; i--)
		{
			for(int j = num2.length()-1 ; j >= num2.length()-1 ; j--)
			{
			if(num.charAt(i) == num2.charAt(j))
				continue;
			else if(num.charAt(i) == num2.charAt(j) && i == 0)
			{
				System.out.println("Automorphic");
				break;
			}
			else
			{
				System.out.println("Not!!");
			    break;
			}
			}
				
		}

	}
	public static String toString (int a)
	{
		return Integer.toString(a);
	}

}
