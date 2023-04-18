import java.util.Scanner;

public class EA4215
{

	public static void main(String[] args)
	{
		int a ,b ,c ;
		Scanner p = new Scanner(System.in);
		
		//System.out.print("Enter value 1 : ");
		a = p.nextInt();
		//System.out.print("Enter value 2 : ");
		b = p.nextInt();
		//System.out.print("Enter value 3 : ");
		c = p.nextInt();
		
		if(c == a*b)
		{
			System.out.println("*");
		}
		else if(c == a+b)
		{
			System.out.println("+");
		}
		else if(c == a-b)
		{
			System.out.println("-");
		}
		else if(c == a/b && b!=0)
		{
			System.out.println("/");
		}
		else
		{
			System.out.println(" No Suitable Mark ");
		}
		p.close();


	}

}
