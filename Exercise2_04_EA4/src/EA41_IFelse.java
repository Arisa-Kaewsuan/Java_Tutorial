import java.util.Scanner;

public class EA41_IFelse
{

	public static void main(String[] args)
	{
		Scanner p = new Scanner(System.in);
		
		//System.out.print("Enter value in a : ");
		int a = p.nextInt();
		int b = p.nextInt();
		int c = p.nextInt();
		
		if(a>13)
		{
			if(b!=16)
				System.out.println("A");
			else if(c<=7)
				System.out.println("B");
			else
				System.out.println("C");
		}
		else if(b<=16)
			System.out.println("D");
		else if(c>6)
			System.out.println("E");
		else
			System.out.println("F");
		p.close();

	}

}
