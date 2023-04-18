import java.util.Scanner;

public class EH7
{

	public static void main(String[] args)
	{
		int max = Integer.MIN_VALUE;
		Scanner p = new Scanner (System.in);
		for(int i = 0 ; i < 10 ; i++)
		{
			int x = p.nextInt();
			if(x > max)
				max = x;
		}
		System.out.println(max);
		p.close();

	}

}
