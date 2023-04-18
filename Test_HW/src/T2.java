import java.text.DecimalFormat;
import java.util.Scanner;

public class T2 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int sum = 0;
		
		String str1 = String.format("%09d", n);
		// Test String : System.out.println(str1);
		
		for(int i = 0 ; i < str1.length() ; i++)
		{
			System.out.println( str1.charAt(i) + "*" + i+1 + "=" + Integer.parseInt(str1.charAt(i) + "") * (i+1) );
		    sum += Integer.parseInt(str1.charAt(i) + "") * (i+1);
		} 
		// Test Sum : System.out.println(sum);
		
		sum = sum % 11 ;
		// Test mod : System.out.println(sum);
		
		for(int i = 0 ; i < str1.length() ; i++)
		{
			System.out.print(Integer.parseInt(str1.charAt(i)+""));
		}
		System.out.print(sum);
	}

}
