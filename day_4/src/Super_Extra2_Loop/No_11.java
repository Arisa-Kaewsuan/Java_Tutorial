package Super_Extra2_Loop;

import java.util.Scanner;

public class No_11
{

	public static void main(String[] args)
	{
		int n=0 , sum=0 ,count=0 ;
		double avg;
		Scanner p = new Scanner (System.in);
		
		for(;;)
		{
			System.out.println("Please Input : ");
			n = p.nextInt();
			if(n < 0) 
			{
				System.out.println("ERROR");
				continue;
			}
			else if(n == 0)
			{
				break;
			}
			else 
			{
				sum += n;
				count++;
			}
			
			if(count == 0)
			{
				System.out.println("No avg");
			}
			else
			{
				avg = (double)sum / count;
				System.out.println(avg);
			}
		}
		p.close();

	}

}
