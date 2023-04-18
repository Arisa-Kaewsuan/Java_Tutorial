
import java.util.Scanner;
public class B2
{

	public static void main(String[] args)
	{
	    try(Scanner scan = new Scanner(System.in))
	    {
		System.out.println("Enter Value : ");
		int k = scan.nextInt();
		
		if(k < 7)
		{
			System.out.println("Hello");
		}
		else
		{
			System.out.println("Good bye");
		}
	    }
	
	}

}
