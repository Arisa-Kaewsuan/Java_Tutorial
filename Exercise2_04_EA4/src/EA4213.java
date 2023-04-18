import java.util.Scanner;

public class EA4213
{

	public static void main(String[] args)
	{
		Scanner n = new Scanner (System.in);
		int num = n.nextInt();
		double dec1 = n.nextDouble();
		double dec2 = n.nextDouble();
		
		if(num == 1)
		{
			System.out.println(dec1+dec2);
		}
		else if(num == 2)
		{
			System.out.println(dec1*dec2);
		}
		else if(num == 3)
		{
			System.out.println(dec1/dec2);
		}
		else
		{
			System.out.print("please select only 1-3");
		}
	}

}
