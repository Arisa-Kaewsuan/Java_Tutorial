import java.util.Scanner;

public class Static_Test
{

	public static void main(String[] args)
	{
		double a ;
		Scanner p = new Scanner (System.in);
		System.out.print("Please Input : ");
		a = p.nextDouble();
		//double b = f(a);
		Static_Test c = new Static_Test();
		System.out.println("c value = " +c.f(1));
	}
	
	public  double f(double x)
	{
		if(x<0) return 0;
		return x;
	}

}
