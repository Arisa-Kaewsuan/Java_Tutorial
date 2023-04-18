package Super_Extra2_Loop;

import java.util.Scanner;

public class No_1
{

	public static void main(String[] args)
	{
		int i=1 , sum=0 ,n, max = Integer.MAX_VALUE , min = Integer.MIN_VALUE  ;
		double avg ;
		Scanner p = new Scanner(System.in);
		while(i<=10)
		{
			System.out.print("Please Input 10 Numbers : ");
            n = p.nextInt();
            sum += n;
            if(n>max)
            {
            	max=n;
            }
			i++;
		}
		avg = sum / 10.0;
		System.out.println("avg = "+avg);
		System.out.println("max = "+max);
		//System.out.println("min = "+min);
		p.close();

	}

}
