
public class EA6_1
{
	public static void main(String[] args)
	{
		for(int i = 1 ; i <= 5 ; i++)
		{
			for(int j = 5-i ; j >= 1 ; j--)
			{ System.out.print("-"); }
			for(int x = 0 ; x < (i*2)-1 ; x++)
			{ System.out.print("x"); }
			System.out.println();
		}

	}

	/*public static void main(String[] args)
	{
		for(int i = 1 ; i <= 5 ; i++)
		{
			for(int j = 5-i ; j >= 1 ; j--)
			{
				System.out.print("-");
			}
			
			for(int k = 1 ; k <= (2*i)-1 ; k++)
			{
				System.out.print("x");
			}
			System.out.println();
		}

	}*/

}
