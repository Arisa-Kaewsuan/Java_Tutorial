
  import java.util.Arrays;

public class EC_8
{

	public static void main(String[] args)
	{
		int[] num = new int[]
		{ 1, 2, 1, 3, 8, 5, 4, 6, 8, 4, 2, 5, 6, 1, 2, 1, 0, 0, 1, 0 };
		int[] k = new int[]
		{ -1, 0, 1 };
		int[] x = new int[num.length - 2];

		for (int i = 0; i < x.length; i++)
		{
			int sum = 0, count = i;
			for (int j = 0; j < 3; j++)
			{
				if (count < i + 3)
				{
					sum += num[count] * k[j];
					count++;
				} else
					break;

			}
			x[i] = sum;
		}
		System.out.println(Arrays.toString(x));
	}

}