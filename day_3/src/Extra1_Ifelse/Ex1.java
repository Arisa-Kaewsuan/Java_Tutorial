package Extra1_Ifelse;

import java.util.Scanner;

public class Ex1
{

	public static void main(String[] args)
	{
		int a,b,c ;
		Scanner p = new Scanner(System.in);
		System.out.print("Please iput a,b,c : ");
		a = p.nextInt();
		b = p.nextInt();
		c = p.nextInt();
        if( a>3 )
        {
        	System.out.println("Red");
        }
        else
        {
        	if( b<=2 )
        	{
        		if( c!=5 )
        		{
        			System.out.println("Green");
        		}
        		else
        		{
        			System.out.println("Blue");
        		}
        	}
        	else
        	{
        		System.out.println("Pink");
        	}
        }
        p.close();
	}

}
