
public class EC10
{

	public static void main(String[] args)
	{
		for (int j = 1; j < 11; j++)
		{
			double sum = 0.0;
			for (int i = 1; i < j+1; i++)
			{
				
				sum = sum+(1.0 / i);
			}
			System.out.println(sum);
		}
	}
}
