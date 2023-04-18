import java.util.Arrays;
import java.util.Scanner;

public class EC12
{

	public static void main(String[] args)
	{
		Scanner p = new Scanner (System.in);
		int [] n = new int [5];
		
		for(int i = 0 ; i < n.length ; i++)
		{
			n[i] = p.nextInt();
		}
		int t = n[0];
		for(int i = 0 ; i < n.length-1 ; i++)
		{
			n[i] = n[i+1];
		}
		n[4] = t ;
		
		System.out.println(Arrays.toString(n));
	}

}
