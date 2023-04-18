import java.util.Arrays;
import java.util.Scanner;

public class EH14
{

	public static void main(String[] args)
	{
		int[] x = new int[3];
		Scanner p = new Scanner(System.in);

		for (int i = 0; i < 3; i++)
		{
			x[i] = p.nextInt();
		}

		for (int j = 0; j < x.length; j++)
		{
			for (int k = 0; k < x.length - 1 - j; k++)
			{
				if (x[k] > x[k + 1])
				{
					int t = x[k];
					x[k] = x[k + 1];
					x[k + 1] = t;
				}
			}
		}
		System.out.println(x[2]);
		System.out.println(x[0]);
		System.out.println(Arrays.toString(x));
		p.close();
	}

}
