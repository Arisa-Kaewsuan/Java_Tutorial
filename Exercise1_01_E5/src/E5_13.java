import java.util.Scanner;

public class E5_13
{
	public static void main(String[] args)
	{
		Scanner p = new Scanner (System.in);
		int n = p.nextInt();
		double result ;
		result = Math.sqrt(2*Math.PI*n) * Math.pow((n/Math.E),n);
		System.out.println(result);
 	}
}
