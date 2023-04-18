package Test_OOP2;

import java.util.Scanner;

public class No_8 {

	public static void main(String[] args) 
	{
		Scanner p = new Scanner(System.in);
		int n = p.nextInt();
		String num = Integer.toString(n);
		int j =0 ;

		for (int i = 0; i < num.length() - 1; i++)
		{
			if (num.charAt(i) > num.charAt(i + 1))
			{
				System.out.println("false");
				break;
			} else if (num.charAt(i) < num.charAt(i + 1))
			{
				if (i == num.length() - 2)
				{
					j = 1;
					break;
				}
			} else
				continue;
		}
		if(j == 1)
		System.out.println("true");

	}
	
	public static String toString(int a)
	{
		return Integer.toString(a);
	}

}
