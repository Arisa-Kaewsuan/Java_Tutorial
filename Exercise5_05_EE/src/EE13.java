import java.util.Arrays;
import java.util.Scanner;

public class EE13
{

	public static void main(String[] args)
	{
		Scanner p = new Scanner (System.in);
		int n = p.nextInt();
		int [][]score = new int[n][5];
		
		for(int i = 0 ; i < score.length ; i++)
		{
			for(int j = 0 ; j < 5 ; j++)
			{
				score[i][j] = p.nextInt();
			}
		}
		
		double [] r = new double [n];
	    for(int i = 0 ; i < score.length ; i++)
	    {
	    	double sum = 0;
	    	for(int j = 0 ; j < 5 ; j++)
	    	{
	    		sum += score[i][j] ;
	    	}
	    	r[i] = sum / 5;
	    }
	    
	    for(int i = 0 ; i < score.length ; i++)
	    {  
	    	System.out.println(r[i]);
	    }
	    
	    double [] t = new double [5];
	    for(int i = 0 ; i < 5 ; i++)
	    {   double sum2 = 0;
	    	for(int j = 0 ; j < score.length ; j++)
	    	{
	    		sum2 += score[j][i] ;
	    	}
	    	t[i] = sum2 / n;
	    }
	    
	    for(int i = 0 ; i < 5 ; i++)
	    {  
	    	System.out.println(t[i]);
	    }
		
		
		
		
		
		
		

	}

}
