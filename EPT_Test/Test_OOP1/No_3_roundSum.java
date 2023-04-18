package Test_OOP1;

import java.util.Scanner;

public class No_3_roundSum {

	public static void main(String[] args) 
	{
		Scanner p = new Scanner (System.in);
		int sum = 0;
		int a = p.nextInt();
		int b = p.nextInt();
		int c = p.nextInt();
		
		int a2 = tocheck(a);
		int b2 = tocheck(b);
		int c2 = tocheck(c);
		
		sum = a2+b2+c2 ;
        System.out.println(sum);
	}
	
	public static int tocheck (int num)
	{
		if(num%10 >= 5 && num/10 == 1)
		{
			num = 20;
		}
		else if(num%10 < 5 && num/10 == 1)
		    num = 10;
		else if(num/10 == 0 && num < 5)
			num = 0 ;
		else if(num/10 == 0 && num >= 5)
			num = 10 ;
		else if(num/10 > 1 && num%10 < 5)
			num = 10*(num/10);
        else if(num/10 > 1 && num%10 >= 5)
		    num = (10*(num/10))+10;
			
		return num;
	}

}
