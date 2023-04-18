public class EA6_2
{
	public static void main(String[] args)
	{
		for(int i = 5 ; i>= 1 ; i--)
		{
			for(int j = 1 ; j<6-i ;j++) 
			{ System.out.print("-"); }
			for(int j = 0 ; j<(i*2)-1 ; j++)
			{ System.out.print("x"); }
			System.out.println();
		}

	}

	/*public static void main(String[] args)
	{
		for (int i = 1; i <= 5; i++)
		{
			for (int j = 1; j <= i - 1; j++)
			{
				System.out.print("-");
			}

			for (int k = 10-i-(i-1) ; k >= 1; k--)
			{
				System.out.print("x");
			}

			System.out.println();
		}

	}*/

}
