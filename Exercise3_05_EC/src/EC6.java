import java.util.Scanner;

public class EC6
{

	public static void main(String[] args)
	{
		Scanner p = new Scanner(System.in);
		double[] x = new double [10];
		double n = p.nextInt();
		double sum = 0.0;
		for(int i = 0 ; i < n ; i++)
		{
			x[i] = p.nextDouble();
			sum += x[i];
		}

		// max
		double max = Integer.MIN_VALUE;
		for(int i = 0 ; i < x.length ;i++)
		{
			if(x[i] > max)
			{
				max = x[i];
			}
		}
		
		// min
		double min = Integer.MAX_VALUE;
		for(int i = 0 ; i < n ;i++)
		{
			if(x[i] < min)
			{
				min = x[i];
			}
		}
		
		// avg
		double avg = 0;
		avg = sum / n ;
		
		System.out.println(min);
		System.out.println(max);
		System.out.println(avg);
		p.close();
	}

}
