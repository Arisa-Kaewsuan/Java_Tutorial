package mySort;

import java.util.Arrays;

public class mySort 
{
	public int[] bubbleSort(int[]a)
	{
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a.length-i-1  ; j++) 
			{
				if(a[j] > a[j+1])
				{
					int t = a[j];
					a[j] = a[j+1];
					a[j+1] = t;
				}
			}
		}
		return a;
	}
	
	public int[] selectionSort(int[]a)
	{
		
		for (int i = 0; i < a.length-1; i++) 
		{

			int max = Integer.MIN_VALUE;
			int max_index = 0 ;
			int last = a.length-i-1;
			
			for (int j = 0; j <=  last ; j++) 
			{
				if(a[j] > max)
				{
					max = a[j];
					max_index = j;
				}
			}

			int t = a[last];
			a[last] = max;
			a[max_index] = t;
		}
		return a;
	}
	
	public int[] insertionSort(int[]a)
	{
		
		for (int i = 0; i < a.length ;i++) 
		{	
			int temp = a[i];
			int j;
			
			for (j = i-1 ; j >= 0 ; j--) 
			{
				if(temp > a[j]){ break; }
				a[j+1] = a[j];
		
			}
			a[j+1] = temp;
		}
		return a;
	}
}
