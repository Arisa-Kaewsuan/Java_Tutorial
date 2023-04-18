package JAVA2_Loop1;

public class JAVA2_Loop1_09
{

	public static void main(String[] args)
	{
		int x;
		x = 1;
		while(x<=100)
		{
			if(x%5 == 0 && x%3 == 0)
			{
				
			}
			else
			{
				if(x%5 == 0 || x%3 == 0)
				{
					System.out.println(x);
				}
			}
			x++;
		}

	}

}
