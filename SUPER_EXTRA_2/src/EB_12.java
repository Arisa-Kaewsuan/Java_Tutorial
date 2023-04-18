import java.util.Arrays;
import java.util.Scanner;

public class EB_12
{
	public static void main(String[] args)
	{
        Scanner sc = new Scanner (System.in);
        int A,B,C;
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        
        int a = (B-A)-1 ;
        int b = (C-B)-1 ;
        if(a > b) { System.out.println(a); }
        else { System.out.println(b); }
        
	}  
}
