import java.util.Scanner;

public class EH4
{

	public static void main(String[] args)
	{
		Scanner p = new Scanner (System.in);
		int n = p.nextInt();
		
		for(int i = 1 ; i <= 12 ; i++)
		{
			System.out.println(n + " * " + i + " = " + i*n);
		}
	}

}
