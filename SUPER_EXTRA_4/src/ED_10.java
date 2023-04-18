import java.util.Arrays;
import java.util.Scanner;

public class ED_10
{

	public static void main(String[] args)
	{
		Scanner p = new Scanner (System.in);
		int [][] Hrs = new int[5][7];
		int [] s = new int [5];
		
		for(int i = 0 ; i < Hrs.length ;i ++)
		{
			int sum = 0;
			for(int j = 0 ; j < Hrs[0].length ;j ++)
			{
				int hrs = p.nextInt();
				sum += hrs;
			}
			
			for(int k = i ; k < i+1 ; k++)
			{
			  s[k] = sum;
			}
		}
		for(int l = 0 ; l < s.length ; l++)
		{
		  System.out.println(s[l]);
		}
        p.close();
	}

}
