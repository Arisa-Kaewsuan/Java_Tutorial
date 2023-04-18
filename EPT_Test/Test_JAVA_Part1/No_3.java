    package Test_JAVA_Part1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class No_3 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		int k = sc.nextInt();
		int count = 1;
		int i = k;
		ArrayList<Integer> x = new ArrayList<Integer>();
		x.add(k);
		
		for(int j : x)
		{
			System.out.println(j);
		}
	}
		
		
}
