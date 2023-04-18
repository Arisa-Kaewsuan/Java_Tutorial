import java.util.Scanner;

public class EA427
{

	public static void main(String[] args)
	{
		int num;
		Scanner p =new Scanner(System.in);
		
		num = p.nextInt();
		
		if(num>=0)
			System.out.println("POSITIVE INTEGER");
		else if(num<0)
		    System.out.println("NOT POSITIVE INTEGER");

	}

}
