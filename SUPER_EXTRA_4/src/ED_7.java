import java.util.Scanner;

public class ED_7
{
	public static void main(String[] args)
	{
		Scanner p = new Scanner (System.in);
		int x = p.nextInt();
		System.out.println(prime(x));
        p.close();
	}
	
	public static int prime(int a)
	{
		int count = 0 ;
		for(int i = 1 ; i <= a ; i++)
		{
			if(a%i == 0)
			{
				count++;
			}
		}
		if(count == 2)
			return 1;
		else
			return 0;
	}

}
