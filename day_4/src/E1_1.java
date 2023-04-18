

import java.util.Scanner;

public class E1_1
{
    // Use break;
	public static void main(String[] args)
	{
		int a , b ;
		Scanner p = new Scanner(System.in);
		//System.out.print("Please Input 2 Numbers : ");
		a = p.nextInt();
		b = p.nextInt();
		
		int k=a;
		while(true)
		{
			if(a%k == 0 && b%k ==0)
			{
				break;
			}
			k--;
		}
		System.out.println(k);
        p.close();

	}

}
