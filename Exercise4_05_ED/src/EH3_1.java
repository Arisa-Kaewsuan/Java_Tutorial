import java.util.Scanner;

public class EH3_1
{

	public static void main(String[] args)
	{
		Scanner p = new Scanner (System.in);
		int n = p.nextInt();
		
		String r = Integer.toString(n);
		int sum = 0 ;
		for(int i = 0 ; i < r.length() ; i++)
		{
			String a = r.charAt(i)+"";
			sum += Integer.parseInt(a);
		}
		System.out.println(sum);
	}

	public static String toString(int num)
	{
		return Integer.toString(num);
	}

}
