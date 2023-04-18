import java.util.Scanner;

public class EH3_2
{

	public static void main(String[] args)
	{
		Scanner p = new Scanner (System.in);
		int n = p.nextInt();
		int odd = 0,even = 0;

		String x = Integer.toString(n);
		for(int i = 0 ; i < x.length();i++)
		{
			if(x.charAt(i)%2 == 0)
				even++;
			else
				odd++;
		}
		System.out.println(even + "\n" + odd);
		
	}
	
	public static String toString(int num)
	{
		return Integer.toString(num);
	}

}
