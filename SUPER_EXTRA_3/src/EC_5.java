import java.util.Arrays;
import java.util.Scanner;

public class EC_5
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int []n = new int[12];
		
		for(int i = 0 ; i < n.length ; i++)
		{
			n[i] = sc.nextInt();
		}
		//System.out.println(Arrays.toString(n));
		
		for(int i = 0 ; i < n.length-2 ; i++)
		{
			if(i == n[11])
			{ 
			  int t = n[10];
			  for(int j = n.length-2 ; j >= i; j--)
			  {
				  if(j == i)
				  {
					  n[j] = t;
				  }
				  else
				  { n[j] = n[j-1]; }
			  }
			}
		}
		//System.out.println(Arrays.toString(n));
		
		for(int i = 0 ; i<n.length-2 ; i++)
		{
			if(i == n.length-3) { System.out.print(" "+n[i]+"]");}
			else if(i==0) { System.out.print("["+n[i]+","); }
			else { System.out.print(" "+n[i]+",");}
		}
	}
}
