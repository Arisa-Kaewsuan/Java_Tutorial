import java.util.Arrays;

public class Sorting 
{
	public static int[] bubbleSort(int[]a) // BigO n^2 
	{
		for(int i = 0 ; i <  a.length-1 ; i++)
		{
			for(int j = 0 ; j < a.length-(i+1) ; j++)
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
	
	public static int[] selectionSort(int[]a) // BigO n^2 
	{
		int i,j,t,mindex = 0;
		for(i = 0 ; i < a.length-1 ; i++) // a.length = 7 [5,4,1,2,3,7,16]
		{
			int max = 0;
			for( j = 0 ; j <= (a.length-1)-i ; j++) // 6 5 4 3 2 1
			{
				if(a[j] > max)
				{
					max = a[j];
					mindex = j;
				}
			}
			t = a[(a.length-1)-i];
			a[(a.length-1)-i] = max; 
			a[mindex] = t;
			//System.out.println(Arrays.toString(a)); //check
		}
		return a;
	}
	
	public static int[] insertionSort(int[]a) // BigO n^2 
	{
		
		for(int i = 0 ; i < a.length-1 ; i++)
		{
			int t = a[i+1];
			int j;
			for(j = i+1 ; j > 0 ; j--)
			{
				if(a[j-1] < t ) { break; }
				else { a[j] = a[j-1]; }
			} 
			a[j] = t;
			//System.out.println(Arrays.toString(a)); //check answer
		}
		return a;
	}
	
	public static void mergeSort(int[]a,int l, int r)
	{
		if(l == r) return;
		int m= (1+r)/2;
		mergeSort(a,l,m);
		mergeSort(a,m+1,r);
		int[]b = new int[r-l+1];
		int k = 0;
		int i = l;
		int j = m+1;
		while ( i <= m && j <= r)
		{
			if(a[i] < a[j])
			{
				b[k] = a[i];
				k++; i++;
			}
			else
			{
				b[k] = a[j];
				k++; j++;
			}
		}
		
		while(i <= m)
		{
			b[k] = a[i];
			k++;
			i++;
		}
			
		while(j <= r)
		{
			b[k] = a[j];
			k++;
			j++;
		}
		i = l;
		k = 0;
			
		for(; i <= r ;i++)
		{
			a[i] = b[k];
			k++;
		}
	}
	
	public static void quickSort(int[]a,int l,int r)
	{
		if(l >= r) { return; }
		int temp = a[l];
		int i = l;
		int j = r+1;
		while(i < j)
		{
			do
			{
				j--;
			} while (temp < a[j]);
			i++;
		}
		
		while (a[i] < temp)
		{
			if(i == r)
			{ break; }
			i++;
		}
		
		if(i < j)
		{
			int t = a[i];
			a[i] = a[j];
			a[j] = t;
		}
		int t2 =a[j];
		a[j] = a[l];
		a[l] = t2;
		quickSort(a,l,j-1);
		quickSort(a,j+1,r);
	}
	
	
	public static void main(String[] args) 
	{	
		// Bubble Sort
		int[] a = {5,4,1,2,3,7,16};
		System.out.println("input : " + Arrays.toString(a));
		long st = System.nanoTime();
		bubbleSort(a);
		long et = System.nanoTime();
		System.out.println("output : " + Arrays.toString(a));
		System.out.println("Bubble Sort timeuse : "+(et-st));
		System.out.println();
		
		// Selection Sort
		int[] b = {5,4,1,2,3,7,16};
		System.out.println("input : " + Arrays.toString(b));
		st = System.nanoTime();
		selectionSort(b);
		et = System.nanoTime();
		System.out.println("output : " + Arrays.toString(b));
		System.out.println("Selection Sort timeuse : "+(et-st));
		System.out.println();
		
		// Insertion Sort
		int[] c = {5,4,1,2,3,7,16};
		System.out.println("input : " + Arrays.toString(c));
		st = System.nanoTime();
		insertionSort(c);
		et = System.nanoTime();
		System.out.println("output : " + Arrays.toString(c));
		System.out.println("Insertion Sort timeuse : "+(et-st));
		System.out.println();
		
		// Merge Sort
	   /* int[] d = {5,4,1,2,3,7,16};
		System.out.println("input : " + Arrays.toString(d));
		st = System.nanoTime();
		mergeSort(d,0,d.length-1);
		et = System.nanoTime();
		System.out.println("output : " + Arrays.toString(d));
		System.out.println("Merge Sort timeuse : "+(et-st));
		System.out.println();*/
		
		
		
		
		
		/*int n = 10;
		int[] a = new int[n];
		for(int i = 0 ; i < n ; i++)
		{
			a[i] = (int) (Math.random()*1000);
		}
		System.out.println("Random number : " + Arrays.toString(a));
		quickSort(a, 0 ,a.length-1);
		System.out.println("Quick Sort : " + Arrays.toString(a));*/
		
		int n = 10;
		int[] a = new int[n];
		for(int i = 0 ; i < n ; i++)
		{
			a[i] = (int) (Math.random()*1000);
		}
		System.out.println("Random number : " + Arrays.toString(a));
		mergeSort(a, 0 ,a.length-1);
		System.out.println("Merge Sort : " + Arrays.toString(a));
	
	}

}
