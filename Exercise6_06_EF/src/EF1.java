import java.util.Arrays;
import java.util.Scanner;

public class EF1
{

	public static void main(String[] args)
	{
		Scanner p = new Scanner(System.in);
		double[] x = new double[4];

		for (int i = 0; i < x.length; i++)
		{
			x[i] = p.nextDouble();
		}

		double sum = 0;
		for (int j = 0; j < x.length; j++)
		{
			sum += x[j];
		}

		for (int k = 0; k < x.length; k++)
		{
			for (int m = 0; m < x.length - 1 - k; m++)
			{
				if (x[m] > x[m + 1])
				{
					double t = x[m];
					x[m] = x[m + 1];
					x[m + 1] = t;
				}
			}
		}
		
		double sum2 = 0;
		for(int n = 1 ; n < x.length ; n ++)
		{
			sum2 += x[n];
		}
		
		System.out.println(sum);
		System.out.println(sum2);
		p.close();
	}

}
