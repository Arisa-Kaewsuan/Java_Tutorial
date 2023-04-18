
public class maximumSubsequenceSum 
{
	public static int mss1(int [] a)
	{
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length - 1; j++) {
				int sum = 0;
				for (int k = i; k < j + 2; k++) {
					sum += a[k];
				}
				if (sum > max) {
					max = sum;
				}
			}
		}
		return max;
	}
	
	public static int mss2(int [] a)
	{
		int max = 0;
		for(int i = 0 ; i  < a.length ; i++)
		{
			int sum = 0;
			for(int j = i ; j < a.length ; j++)
			{
			    sum = sum + a[i];
			    if(sum > max)
			    {
				    max = sum;
			    }
			}
		}
		return max;
	}
	
	public static int mss3 (int[]a)
	{
		int max = 0;
		int sum = 0;
		for(int i = 0 ; i < a.length ; i++)
		{
			sum = sum + a[i];
			if(sum < 0 )
			{
				sum = 0;
			}
			if(sum > max)
			{
				max = sum;
			}
		}
		return max;
	}

	public static void main(String[] args) 
	{
		int [] a = {-3,1,-8,12,0,-3,5,-9,4} ;
		System.out.println(mss1(a));
		System.out.println(mss2(a));
		System.out.println(mss3 (a));
	}

}
