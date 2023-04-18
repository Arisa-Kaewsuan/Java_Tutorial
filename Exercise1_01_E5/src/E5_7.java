import java.util.Scanner;

public class E5_7
{

	public static void main(String[] args)
	{
		double a,b,c,sum,avg;
		Scanner p = new Scanner (System.in);
		
		//System.out.print("Enater Decimal Values 1 : ");
		a = p.nextDouble();
		//System.out.print("Enater Decimal Values 2 : ");
		b = p.nextDouble();
		//System.out.print("Enater Decimal Values 3 : ");
		c = p.nextDouble();
		
		sum = a+b+c;
		avg = sum/3;
		
		System.out.println(sum);
		System.out.println(avg);
		p.close();

	}

}
