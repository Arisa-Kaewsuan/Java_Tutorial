import java.util.Scanner;

public class EH11
{

	public static void main(String[] args)
	{
		Scanner p = new Scanner(System.in);
		int i = 1, count1 = 0 , count2 = 0;
		double sum1 = 0 , sum2=0;
		while (true)
		{
			i = p.nextInt();
			if (i == 0)
				break;
			else if (i > 0)
			{
				sum1 += i;
				count1++;
			} else if (i < 0)
			{
				sum2 += i;
				count2++;
			}
		}
		System.out.println(sum1 / count1);
		System.out.println(sum2 / count2);

	}

}
