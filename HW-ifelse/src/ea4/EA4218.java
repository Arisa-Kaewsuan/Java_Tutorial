package ea4;

import java.util.Scanner;

public class EA4218
{

	public static void main(String[] args)
	{
		int ages;
		Scanner p = new Scanner(System.in);
		
		System.out.print("Enter Your Ages : ");
		ages = p.nextInt();
		
		if(ages>30)
		{
			System.out.println("Don't grow old , Just grow up");
		}
		p.close();

	}

}
