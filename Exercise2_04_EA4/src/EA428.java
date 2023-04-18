import java.util.Scanner;

public class EA428
{

	public static void main(String[] args)
	{
		int num;
		Scanner p =new Scanner(System.in);
		
		num = p.nextInt();
		
		if(num%2 == 0)
			System.out.println("EVEN NUMBER");
		else
			System.out.println("ODD NUMBER");
		p.close();
	}
}
