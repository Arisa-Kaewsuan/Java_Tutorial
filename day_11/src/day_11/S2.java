package day_11;

import java.util.Scanner;

public class S2
{

	public static void main(String[] args)
	{
		String s1 , s2 ;
		int k ;
		Scanner p = new Scanner (System.in);
		s1 = p.nextLine();
		s2 = p.nextLine();
		k = p.nextInt();
		
		
		if(k < 0 || k > s1.length())
		{
			s1 = s1+s2 ;
		}
		else
		{
			s1 = s1.substring(0,k) + s2 + s1.substring(k);
		}
		System.out.println(s1);
	}

}
