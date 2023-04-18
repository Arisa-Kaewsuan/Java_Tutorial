
public class EE3
{

	public static void main(String[] args)
	{
		int [][] x = new int [12][12];
		int r = 0; 
		for(int i = 2 ; i <= x.length ; i++)
		{
			for(int k = 0 ; k < 9 ; k++)
			{
				if(k == 4)
					System.out.print(" " +i + " ");
				else
					System.out.print("*");
			}
			System.out.println();
			for(int j = 1 ; j <= x[0].length ; j++)
			{
				r = i*j;
				System.out.println(i + " * " + j +" = " + r);
			}
		}

	}

}
