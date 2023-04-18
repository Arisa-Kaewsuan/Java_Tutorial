import java.util.Scanner;

public class E5_10
{

	public static void main(String[] args)
	{
		double f1 , f0=2e10 , v ;
		Scanner p = new Scanner(System.in);
		//System.out.print("Enter values f1 : ");
		f1 = p.nextDouble();
		v = (10.7585e8)*(f1-f0)/(f1+f0);
		System.out.println(v);
		p.close();
	}

}
