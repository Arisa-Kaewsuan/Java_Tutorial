package Super_Extra2_Loop;

import java.util.Scanner;

public class No_0
{

	public static void main(String[] args)
	{
		int i=1 , sum=0 ,n ;
		Scanner p = new Scanner(System.in);
		while(i<=10)
		{
			System.out.print("Please Input 10 Numbers : ");
            n = p.nextInt();
            sum += n;
			i++;
		}
		System.out.println(sum);
		p.close();

	}

}
