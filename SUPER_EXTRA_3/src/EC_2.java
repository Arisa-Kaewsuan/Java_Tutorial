import java.util.Arrays;
import java.util.Scanner;

public class EC_2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int []n = new int[10];
		
		for(int i = 0 ; i < n.length ; i++)
		{
			n[i] = sc.nextInt();
		}
		int V = sc.nextInt();
		int count = 0;
		for(int i = 0 ; i < n.length ; i++)
		{
			if(n[i] == V)
			{
				System.out.println("V is in array");
				break;
			}
			else { count++; }
		}
		if(count == n.length) { System.out.println("is not in array");}
		
		//System.out.println(Arrays.toString(n));
 	}
}
