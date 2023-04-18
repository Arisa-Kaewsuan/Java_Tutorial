import java.util.Scanner;

public class EH10
{

	public static void main(String[] args)
	{
		int sum1 = 0 , sum2 = 0 , x;
		Scanner p = new Scanner (System.in);
		while(true)
		{
			x = p.nextInt();
			
			if(x != 0)
			{
				if(x > 0)
				   sum1 += x;
				else
					sum2 += x;
			}
			else if(x ==0)
			   break;
		}
		System.out.println(sum1);
		System.out.println(sum2);
		p.close();

	}

}
