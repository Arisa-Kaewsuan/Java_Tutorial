import java.util.Scanner;

public class EA4210
{

	public static void main(String[] args)
	{
		int a ,b ,c ,ans=0 ;
		Scanner p = new Scanner (System.in);
		
		a = p.nextInt();
		b = p.nextInt();
		c = p.nextInt();
		
	    switch(c)
	    {
	    case 1 : ans = a+b;
	             System.out.println(ans);
	             break;
	    case 2 : ans = a-b;
	             System.out.println(ans);
	             break;
	    case 3 : ans = a*b;
	             System.out.println(ans);
	             break;
	    case 4 : ans = a/b;
	             double result = ans;
	             System.out.println(result);
	             break;
	    }
	    p.close();

	}

}
