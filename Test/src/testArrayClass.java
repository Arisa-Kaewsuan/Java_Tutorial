import java.util.Arrays;

public class testArrayClass {

	public static int min(int[] a) 
	{
		int min = Integer.MAX_VALUE;
		for(int i = 0 ; i < a.length ; i++)
		{
			if(a[i] < min) { min = a[i]; }
		}
		return min;
	}
	
	public static int max(int[] a) 
	{
		int max = Integer.MIN_VALUE;
		for(int i = 0 ; i < a.length ; i++)
		{
			if(a[i] > max) { max = a[i]; }
		}
		return max;
	}
	
	public static int binarySearch(int[] b , int x)
	{
		int r=0;
		for(int i = 0 ; i < b.length ; i++)
		{
			if(b[i] == x) { r = i; }
		}
		if(r == 0) 
		{
			r = -(b.length-1);
			int [] nr = new int[b.length+1]; 
			for(int k = 0 ; k < b.length ; k++ )
			{
				nr[k] = b[k];
			}
			for(int j = nr.length-1 ; j >= (-r) ; j-- )
			{
				nr[j] = nr[j-1];
			}
			nr[(-r)-1] = x;
			System.out.println(Arrays.toString(nr));
		}
		return r;
	}
	
	public static boolean normalSearch(int[]a , int x) 
	{
		boolean v = false;
		for(int i = 0 ; i < a.length ; i++)
		{
			if(a[i] == x) 
			{ 
				v = true;
				break;
			}
		}
		return v;
		
	}
	
	public static String printArray(int[] a)
	{
		String s = "["+a[0]+""+",";
		for(int i = 1 ; i < a.length ; i++)
		{
			if(i == a.length-1) { s+= a[i]+""+"]"; }
			else { s += a[i]+"" + ","; }
		}
		return s;
	}
	
	public static void main(String[] args) 
	{
		/*int[] a = {3,7,12,24,45};
		System.out.println(min(a));
		System.out.println(max(a));*/
		
		/*int[] b = {22,44,66,88,99};
		System.out.println(binarySearch(b,20));
		System.out.println(binarySearch(b,44));*/
		
		/*int[] a = {3,7,12,24,45};
		System.out.println(normalSearch(a,45));*/

		/*int[] a = {3,7,12,24,45};
		System.out.println(printArray(a));*/
	}

}
