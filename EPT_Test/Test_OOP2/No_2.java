package Test_OOP2;

import java.util.ArrayList;
import java.util.Scanner;

public class No_2 {

	public static void main(String[] args) 
	{
		Scanner p = new Scanner (System.in);
		System.out.println("How old are you ?");
		String ans = p.nextLine();
		
		String[] n = ans.split(ans, 1);
		if(n[0].equals("1"))
		{
			System.out.println("1 year old");
		}
		else 
		{
			System.out.println(ans.charAt(0) + " years old");
		}
	}

}
