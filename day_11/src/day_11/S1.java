package day_11;

import java.util.Scanner;

public class S1
{

	public static void main(String[] args)
	{
		// INPUT
		String s1, s2;
		Scanner sc = new Scanner(System.in);
		s1 = sc.nextLine();
		s2 = sc.nextLine();

		// CHACK : M2 have in M1 ? >> use method indexOf
		// don't have
		if (s1.indexOf(s2) == -1)
		{
			System.out.println("No");
			return; // จบโปรแกรมเลย
		} else
		{
			// Have
			int i = 1;
			while (i > 0 && i < s1.length())
			{
				i = s1.indexOf(s2, i);
				if (i == -1)
					break;
				System.out.println(i);
				i++;
			}
			
		}
		sc.close();

	}
	

}
