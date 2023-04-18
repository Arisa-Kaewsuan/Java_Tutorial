package ea4;
import java.util.Scanner;
public class EA421
{

	public static void main(String[] args)
	{
		double i,j,k;
		Scanner p = new Scanner(System.in);
		
		System.out.print("Enter value in i : ");
		i = p.nextDouble();
		System.out.print("Enter value in j : ");
		j = p.nextDouble();
		System.out.print("Enter value in k : ");
		k = p.nextDouble();
		
		
		if(i/j == 0)
		{
			k = 2*i;
		}
		else if(i == 4*j)
		{
			k = i/2;
		}
		else if(i == 0)
		{
			i = j;
		}
		else if(j == 0)
		{
			j = i;
		}
		else if(i%2 != 0 && i>j)
		{
			i += 1;
			j += 1;
		}
		else if(i>=0 && i<=20)
		{
			if(i%2 == 0 && i!=8 && i!=10)
			{
				if(i<10)
				{
					k = k*2;
				}
				else 
				{
					k = k/2;
				}
			}
		}
		p.close();

	}

}
