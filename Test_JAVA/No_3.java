import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class No_3 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		
		ArrayList<Integer> x = new ArrayList<Integer>();
		x.add(k);
		
		for(int i = 1 ; i < 11 ; i++)
		{
		    if(x.get(i-1)%2.0 == 0.0)
			{
				x.add(x.get(i-1)/2);
			}
			else
			{
				x.add((x.get(i-1)*3)+1);
			}
		}
		
	    System.out.println(x.size());
		for (int j : x) 
		{
		   System.out.print(j + " ");
		}

	}

}
