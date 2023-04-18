import java.util.Arrays;
import java.util.Scanner;

public class EH8
{

	public static void main(String[] args)
	{
		Scanner p = new Scanner(System.in);
		int[] n = new int[10];
		int r;

		for (int i = 0; i < n.length; i++)
		{
			n[i] = p.nextInt();
		}
		
		for (int i = 0; i < n.length; i++)
		{
			Arrays.sort(n);
		}
		System.out.println(n[n.length-2]);

	}

}
