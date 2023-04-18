package Extra3_Array;
import java.util.Arrays;
import java.util.Scanner;

public class J1
{

	public static void main(String[] args)
	{
		int[] x = new int[10];
		Scanner p = new Scanner(System.in);

		for (int i = 0; i < x.length; i++)
		{
			System.out.print("Please Input a Number : ");
			x[i] = p.nextInt();
		}
		
		for(int j = 0 ; j < x.length ; j++)
		{
			for(int i = 0 ; i < x.length-1 ; i++)
			{
				if(x[i] > x[i+1])
				{
					int t = x[i];
					x[i] = x[i+1];
					x[i+1] = t; 
				}
			}
		}
		System.out.print(Arrays.toString(x));
		p.close();
	}
}
