import java.util.Scanner;

public class E5_15
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		
		int year = (int)(n*(3.170979*Math.pow(10, -8)));
		int month = (int)(n*(3.805175*Math.pow(10, -7)));
		int day = (int)(n*(1.157407*Math.pow(10, -5)));
		int hours = (int)(n*0.000277);
		int sec = (int)(n*0.016666);
		
		System.out.println(year);
		System.out.println(month);
		System.out.println(day);
		System.out.println(hours);
		System.out.println(sec);
	}
}
