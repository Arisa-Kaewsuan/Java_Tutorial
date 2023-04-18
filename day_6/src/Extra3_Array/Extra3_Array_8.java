;package Extra3_Array;

import java.util.Arrays;

public class Extra3_Array_8
{
    // convolution
	public static void main(String[] args)
	{
		// ประ�?าศ Array
		int[] a = new int[] {1,2,1,3,8,5,4,6,8,4,2,5,6,1,2,1,0,0,1,2};
	    int[] b = new int[] {-1,0,1} ; // kernel
	    int[] c = new int[a.length] ;  // keep result
	    int i , j , sum ; 

		for ( i = 1; i < a.length-1; i++)
		{
			sum = 0 ;
			for( j =0 ; j<b.length ; j++)
			{
			  sum +=  b[j]*a[i+j-1] ;
			}
			c[i] = sum ;
		}
		System.out.println(Arrays.toString(c));
	}
}
