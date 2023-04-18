package Super_Extra2_Loop;

public class No_6
{

	public static void main(String[] args)
	{
		for(int i = 1 ; i<=110 ; i++)
		{
			if(i%3 == 0 && i%5 == 0)
			{
				System.out.print("Cozaloza\t");
			}
			else if(i%3 == 0)
			{
				System.out.print("Coza\t");
			}
			else if(i%5 == 0)
			{
				System.out.print("Loza\t");
			}
			else if(i%7 == 0)
			{
				System.out.print("Woza\t");
			}
			else 
			{
				System.out.print(i+"\t");
			}
			
			if(i%11 == 0)
			{
				System.out.println();
			}
		}

	}

}
