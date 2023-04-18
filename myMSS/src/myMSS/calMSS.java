package myMSS;

public class calMSS
{
	public int mssI(int[]a , int max)
	{
		for (int i = 0; i < a.length-1; i++) 
		{
			for (int j = 0; j < a.length-(i+1); j++) 
			{
				int sum = 0;
				for (int k = j; k < (j+2)+i; k++) 
				{
					sum += a[k];
				}
				
				if (sum > max) 
				{
					max = sum;
				}
			}
		}
		return max;
	}
	
	public int mssII(int[]a , int max) 
	{
		for (int i = 0; i < a.length ; i++) 
		{
			int sum = 0;
			for (int j = i; j < a.length; j++) 
			{
				sum += a[j];
				if (sum > max) 
				{
					max = sum;
				}
			}
		}
		return max;
	}
	
	public int mssIII(int[]a , int max) 
	{
		int sum = 0;
		for (int i = 0; i < a.length; i++) 
		{
			sum = sum + a[i];
			if(sum < 0) { sum = 0; }
			if(sum > max)  { max = sum; }
		}
		return max;
	}
}
