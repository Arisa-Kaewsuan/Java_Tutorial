import java.util.Scanner;

public class EE11
{

	public static void main(String[] args)
	{
		Scanner p = new Scanner (System.in);
		int n = p.nextInt();
		int [] x = new int[n];
		double sum = 0.0;
		for(int i = 0 ; i < x.length ; i++)
		{
			x[i] = p.nextInt();
			sum += x[i];
		}
		double max , min , avg ;
		for(int j = 0 ; j < x.length ; j++)
		{
			for(int k = 0 ; k < x.length-1-j ; k++)
			{
				if(x[k] > x[k+1])
				{
					int t = x[k];
					x[k] = x[k+1];
					x[k+1] = t; 
				}
			}
		}
		avg = sum/n;
		max = x[x.length-1];
		min = x[0];
		System.out.println(max + "\n" + min + "\n" + avg);
        p.close();

	}

}
