package JAVA2_Loop1;

public class C3
{

	public static void main(String[] args)
	{
		int i = 0;
		
		while(i<=10)
		{
			int x = 1;
			while(x<=i+1)
			{
				System.out.print("x");
				x++;
			}
			System.out.println();
			i++;
		}

	}

}
