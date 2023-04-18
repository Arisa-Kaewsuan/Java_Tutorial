import java.util.Scanner;

public class EH2
{

	public static void main(String[] args)
	{
		Scanner p = new Scanner(System.in);
		int n = p.nextInt();
		int x = p.nextInt();
		double xx = n*(x/100.0);
		double[] total = new double[10];
		double sum = 0;

		for (int i = 0; i < 10; i++)
		{
			if (i == 0)
			{
				total[i] = n +xx;
				sum += total[i];
			} else
			{
				total[i] = total[i - 1] +( total[i - 1] * (x/100.0));
				sum += total[i];
			}

		}
		System.out.println(sum);
	}

}
