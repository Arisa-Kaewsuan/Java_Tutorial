package loop;

public class Extra1_6_2
{

	public static void main(String[] args)
	{
		int n=5 ;
		for(int j=1 ; j<=n ; j++)
		{
			for(int i=1 ; i<=n*2 ; i++)
			{
				if(i<=j+n-1 && i>=n-j+1)
				{
					System.out.print("x");
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}

	}

}
