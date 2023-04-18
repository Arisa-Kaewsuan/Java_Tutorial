public class FindMaximumSubsequenceSum 
{
	/*static int count =0; //check */
	public static int mss1(int[]a) 
	{
		int max=0;
		
		for(int i = 0 ; i < a.length-1 ; i++)
		{
			for(int j = i ; j < a.length ; j++)
			{
				int sum = 0;
				for(int k = i  ; k < j+1 ; k++)
				{
					sum += a[k];
					/*if(k == j) { System.out.print(a[k]); } //check sum
					else { System.out.print(a[k]+"+"); } //check sum */
				}
				/*System.out.println(); //check sum
				System.out.println("sum = "+sum); //check sum
				count++; //check count */
				if(sum>max)
				{
					max = sum;
				}
			}
		}
		/*System.out.println("count = "+count); //check count = 66/77
		System.out.println("max = "+max); //check max = 36 */
		return max;
	}
	
	public static int mss2 (int[]a)
	{
		int max = 0;
		for(int i = 0 ; i  < a.length-1 ; i++)
		{
			int sum = 0;
			for(int j = i ; j < a.length ; j++)
			{
			   sum += a[j];
			  /* System.out.println("sum = "+sum); // check sum*/
			   if(sum > max) { max = sum; }
			}
		}
		/*System.out.println("max = "+max); //check max = 36*/
		return max;
	}
	
	public static int mss3 (int[]a)
	{
		int max = 0;
		int sum = 0;
		for(int i = 0 ; i < a.length ; i++)
		{
			sum = sum + a[i];
			System.out.println(sum+"+"+a[i]); // check sum
			System.out.println("sum = "+sum); // check sum  
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
		int []a = {1,7,-10,8,2,5,10,-7,2,-3,19,-25};
		
		//System.out.println(mss1(a)); // print max value = 36
		long startTime = System.nanoTime();
		mss1(a);
		long endTime = System.nanoTime();
		long a1 = (endTime - startTime);
		System.out.println("mss1 Time Use = " +a1); // print time mss1 use
		
		//System.out.println(mss2(a)); // print max value 36
		startTime = System.nanoTime();
		mss2(a);
		endTime = System.nanoTime();
		long a2 = (endTime - startTime);
		System.out.println("mss2 Time Use = " +a2); // print time mss2 use
		
		//System.out.println(mss3(a)); // print max value = 36
		startTime = System.nanoTime();
		mss3(a);
		endTime = System.nanoTime();
		long a3 = (endTime - startTime);
		System.out.println("mss2 Time Use = " +a3); // print time mss2 use
		
		/*/////////////////////////////////////////////
		long st,et;
		st = System.currentTimeMillis();
		mss1(a);
		et = System.currentTimeMillis();
		System.out.println(et-st);
		
		st = System.currentTimeMillis();
		mss2(a);
		et = System.currentTimeMillis();
		System.out.println(et-st);
		
		st = System.currentTimeMillis();
		mss3 (a);
		et = System.currentTimeMillis();
		System.out.println(et-st);*/
	}

}
