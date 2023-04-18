import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class EC11
{

	public static void main(String[] args)
	{
		Scanner p = new Scanner (System.in);
		String []x = new String[4];
		int n = p.nextInt();
		String num = Integer.toString(n);
		
		if(4-num.length() != 0)
		{
			for(int i = 0 ; i < 4-num.length() ; i++)
			{
				x[i] = "0";
			}
			for(int j = 0 ; j < num.length() ; j++)
			{
				x[j+(4-num.length())] = num.charAt(j) + "";
			}
		}
		else if (4-num.length() == 0)
		{
			for(int k = 0 ; k < num.length() ; k++)
			{
				x[k] = num.charAt(k)+"";
			}
		}
		System.out.println(Arrays.toString(x));
	}

}
