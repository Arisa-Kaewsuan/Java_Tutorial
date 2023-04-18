package ea4;

import java.util.Scanner;

public class EA4214
{

	public static void main(String[] args)
	{
		double a ,b ,c ;
		Scanner p = new Scanner(System.in);
		
		System.out.print("Enter value in a side : ");
		a = p.nextDouble();
		System.out.print("Enter value in b side : ");
		b = p.nextDouble();
		System.out.print("Enter value in c side : ");
		c = p.nextDouble();
		
		if(a+b+c > c)
		{
			System.out.println(" Can be make a triangle ");
		}
		else if(a+b+c > b)
		{
			System.out.println(" Can be make a triangle ");
		}
		else if(a+b+c > a)
		{
			System.out.println(" Can be make a triangle ");
		}
		else
		{
			System.out.println(" Can't be make a triangle ");
		}
        p.close();
	}

}
