package mySort;

import java.util.Arrays;

public class mainSort {

	public static void main(String[] args) 
	{
		int[] a = {5,4,1,2,3,7,16}; 
		int[] b = {7,6,1,2,5,9,4};
		
		mySort s = new mySort();
		
		System.out.println(Arrays.toString(s.bubbleSort(b)));
		long x = System.currentTimeMillis();
		s.bubbleSort(b);
		long y = System.currentTimeMillis();
		System.out.println("BubbleSort : " + (y-x));
		
		System.out.println(Arrays.toString(s.selectionSort(b)));
		x = System.currentTimeMillis();
		s.selectionSort(b);
	    y = System.currentTimeMillis();
		System.out.println("SelectionSort : " + (y-x));
		
		System.out.println(Arrays.toString(s.insertionSort(b)));
		x = System.currentTimeMillis();
		s.insertionSort(b);
	    y = System.currentTimeMillis();
	    System.out.println("InsertionSort : " + (y-x));
	}

}
