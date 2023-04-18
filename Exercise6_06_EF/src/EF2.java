import java.util.ArrayList;
import java.util.Arrays;

public class EF2
{
	public static void main(String[] args)
	{
		ArrayList<Integer> y = new ArrayList<Integer>();
		
		int[] a = new int[499];
		for(int i = 0; i < a.length ; i++)
		{
		   a[i] = (int) Math.pow(i+1, 2);
		}
		//System.out.println(Arrays.toString(a));
		
		for(int i = 0; i < a.length ; i++)
		{
			for(int k = i+1 ; k < a.length ; k++)
			{
				for(int j = k+1; j < a.length ; j++)
				{
				   if((a[i]+a[k] == a[j]) && (i!=j && j!=k && i!= k))
				   { 
					   y.add((int) Math.sqrt(a[i]));
					   y.add((int) Math.sqrt(a[k]));
					   y.add((int) Math.sqrt(a[j]));
					   
				   }
				}
			}
		}
		
		
		for(int j = 0 ; j < y.size() ; j+=3)
		{
			for(int i = j ; i<j+3 ; i++)
			{
				if(i == j+2) { System.out.print(" "+y.get(i)+"\n"); }
				else if(i == j) { System.out.print(y.get(i)+","); }
				else { System.out.print(" 		"+y.get(i)+","); }
			}
		}
	}
}
