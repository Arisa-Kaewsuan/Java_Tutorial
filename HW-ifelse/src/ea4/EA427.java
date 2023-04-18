package ea4;
import java.util.Scanner;
public class EA427
{

	public static void main(String[] args)
	{
		int num;
		Scanner p =new Scanner(System.in);
		
		System.out.print("Enter number : ");
		num = p.nextInt();
		
		if(num>=0)
		{
			System.out.println("Is a positive number");
		}
		p.close();

	}

}
