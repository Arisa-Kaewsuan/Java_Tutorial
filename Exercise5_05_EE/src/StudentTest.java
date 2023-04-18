import java.io.IOException;
import java.util.Scanner;

public class StudentTest
{

	public static void main(String[] args)
	{
		Scanner p = new Scanner (System.in);
		int n = p.nextInt();
		Student [] x = new Student [n];
		
		double sum1 = 0.0;
		for(int i = 0 ; i < x.length ; i++)
		{
			x[i] = new Student();
			for(int j = 0 ; j < 5 ; j++)
			{
				try
				{
					x[j].score = p.nextInt();
					sum1 += x[j].score;
				}catch(Exception e) {}
			}
		}
		System.out.println(sum1/5);
		
		double  sum2 = 0.0;
		for(int k = 0 ; k < 5 ; k++)
		{
			for(int m = 0 ; m < x.length ; m++)
			{
				sum2 += x[k].score;
			}
			System.out.println(sum2/n);
		}

	}

}
