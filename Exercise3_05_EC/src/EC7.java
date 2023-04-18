import java.util.Scanner;

public class EC7
{

	public static void main(String[] args)
	{
		String a = (new Scanner(System.in)).nextLine();
		
		// Input String
		for (int i = a.length()-1 ; i > -1; i--)
		{
			int x = Integer.parseInt("" + a.charAt(i));
			System.out.print(x);
		}
		
		
	}

}
