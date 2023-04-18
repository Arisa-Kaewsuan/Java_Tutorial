import java.util.Scanner;

public class EA4212
{

	public static void main(String[] args)
	{
		double w  ;
		Scanner p = new Scanner (System.in);
		
		w = p.nextDouble();
		
		if(w>=0 && w<=1)
		{
			System.out.println("50");
		}
		else if(w>=1.1 && w<=2)
		{
			System.out.println("60");
		}
		else if(w>=2.1 && w<=3)
		{
			System.out.println("70");
		}
		else if(w>=3)
		{
			System.out.println("100");
		}
		p.close();

	}

}
