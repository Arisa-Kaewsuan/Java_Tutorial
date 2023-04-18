import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class EA5
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int max = Integer.MIN_VALUE;
		int x=0,y=0;
		
		if(a>b && a>c)
		{
			max = a; 
			x = b;
			y = c;
		}
		else if(c>b && c>a)
		{
			max = c; 
			x = b;
			y = a;
		}
		else
		{
			max = b; 
			x = a;
			y = c;
		}
		max = max*max;
		x = x*x;
		y = y*y;
		
		if(a+b > c && a+c > b && c+b>a)
		{
			if(x+y == max)
			{
				System.out.println("right triangle");
			}
			else if(x+y > max)
			{
				System.out.println("acute-angled triangle");
			}
			else if(x+y < max)
			{
				System.out.println("obtuse triangle");
			}
			
			if(a==b && b==c)
			{
				System.out.println("equilateral triangle");
			}
			else if(a==b && a!=c || b==c && b!=a || a==c&&a!=b)
			{
				System.out.println("isosceles triangle");
			}
			else if(a!=b && a!=c && b!=c)
			{
				System.out.println("scalene triangle");
			}
		}
		else
		{
			System.out.println("is not triangle");
		}
		
		 
	}

	/*public static void main(String[] args)
	{
		int a, b, c, max=Integer.MIN_VALUE, x=0, y=0, m, n;
		Scanner p = new Scanner(System.in);
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
		} else if(c >= b && c >= a)
		{
			max = c;
			x = b;
			y = a;
		}

		if (x + y <= max)
		{
			System.out.println("is not triangle");
		} else
		{

			m = max * max;
			n = x * x + y * y;

			if (m > n)
			{
				System.out.println("obtuse triangle");
			} else if (m < n)
			{
				System.out.println("acute-angled triangle");
			} else 
			{
				System.out.println("right triangle");
			}

			if (a == b && b == c)
			{
				System.out.println("equilateral triangle");
			} else if (a == b || b == c || a == c)
			{
				System.out.println("isosceles triangle");
			} else
			{
				System.out.println("scalene triangle");
			}
		}
		p.close();
	}*/

}
