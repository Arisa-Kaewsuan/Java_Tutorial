import java.util.Scanner;

public class EH5
{

	public static void main(String[] args)
	{
		int sum = 0 , count = 0;
		Scanner p = new Scanner (System.in);
		while(true)
		{
			int x = p.nextInt();
			if(x!= 0)
			{
				sum += x;
				count++;
			}
			else if(x == 0)
				break;
			
		}
		double avg;
		avg = sum/(double)count;
		System.out.println(sum);
		System.out.println(avg);
		p.close();
	}

}
