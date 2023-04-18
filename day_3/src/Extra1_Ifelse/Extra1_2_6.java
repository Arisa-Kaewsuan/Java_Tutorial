package Extra1_Ifelse;

import java.util.Scanner;

public class Extra1_2_6
{
	/*Is a triangle ? : sum 2min = max
	 * 4 5 3
	 */
	  
	public static void main(String[] args)
	{
		int a, b, c, max, x, y, m, n;
		Scanner p = new Scanner(System.in);
		System.out.print("Input 3 number : ");
		a = p.nextInt();
		b = p.nextInt();
		c = p.nextInt();

		if (a >= b && a >= c)
		{
			max = a;
			x = b;
			y = c;
		} else if (b >= c && b >= a)
		{
			max = b;
			x = a;
			y = c;
		} else
		{
			max = c;
			x = b;
			y = c;
		}

		if (x + y <= max)
		{
			System.out.println(" It is not a triangle ");
		} else
		{
			System.out.println(" It is  a triangle ");

			m = max * max;
			n = x * x + y * y;

			if (m > n)
			{
				System.out.println(" Obtuse Triangle ");
			} else if (m < n)
			{
				System.out.println(" Acute Triangle");
			} else
			{
				System.out.println(" Right Triangle");
			}

			if (a == b && b == c)
			{
				System.out.println(" Equalateral Triangle");
			} else if (a == b || b == c || a == c)
			{
				System.out.println(" Isoscele Triangle");
			} else
			{
				System.out.println(" Scalene Triangle");
			}
		}
		p.close();
	}

}
