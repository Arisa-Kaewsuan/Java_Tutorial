import java.util.Scanner;

public class EE4
{

	public static void main(String[] args)
	{
		Scanner p = new Scanner (System.in);
		int num = p.nextInt();
		String r = toString(num);
	    for(int j = r.length()-1 ; j >= 0 ; j--)
	    {
	    	System.out.print(r.charAt(j));
	    }
	}
	
	public static String toString(int n)
	{
		return Integer.toString(n);
	}

}
