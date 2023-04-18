import java.util.Arrays;

public class sortTest 
{

	public static void main(String[] args) 
	{
		Sort sort = new Sort();
		int [] a = {7,2,3,8,9,1};
		
		System.out.println(Arrays.toString(a));
		sort.bubbleSort(a);
		System.out.println(Arrays.toString(a));
	}

}
