
import java.util.Arrays;
import java.util.Scanner;

public class EC_6
{

	public static void main(String[] args)
	{
		Scanner p = new Scanner (System.in);
		int [] n = new int [10];
		
		for(int i = 0 ; i < n.length ; i++)
		{
			n[i] = p.nextInt();
		}
		
		for(int i = 0 ; i < n.length ; i++)
		{
			for(int j = 0 ; j < n.length-1-i ; j++)
			{
				if(n[j]<n[j+1])
				{
					int t = n[j];
					n[j] = n[j+1];
					n[j+1] = t;
				}
			}
		}
		System.out.println(Arrays.toString(n));
	}

}
