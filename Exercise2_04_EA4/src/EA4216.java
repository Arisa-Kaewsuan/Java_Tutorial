import java.util.Scanner;

public class EA4216
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
		
		if(a==b && a!=c && b!=c)
		{
			System.out.println("a = b");
		}
		else if(a==c && a!=b && c!=b)
		{
			System.out.println("a = c");
		}
		else if(b==c && b!=a && c!=a)
		{
			System.out.println("b = c");
		}
		else
		{
			System.out.println("a != b != c");
		}
        p.close();

	}

}
