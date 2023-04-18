import java.util.Arrays;
import java.util.Scanner;

public class EF6
{

	public static void main(String[] args)
	{
		//โจทย์ ตัวเลข 9 ล้านๆ
		Scanner sc = new Scanner(System.in);
		Long n = sc.nextLong();
		
		System.out.println(n);
		//System.out.println(Integer.MAX_VALUE);//ประมาณ 2000 ล้าน
		//System.out.println(Long.MAX_VALUE);
		
		/*Scanner sc = new Scanner (System.in);
		Long code = sc.nextLong();
		String ncode;
		int [] y = new int [13];
		
		ncode = Long.toString(code);
		y[0] = 9;
		y[1] = 7;
		y[2] = 8;
		for(int i = 3 ; i < y.length ;i++)
		{
			y[i] = Integer.parseInt(""+ncode.charAt(i-3));
		}
		y[12] = 9;
		
		
		for(int i = 0 ; i < y.length ;i++)
		{
			System.out.print(y[i]);
		}		
	}
	
	public static String toString (long code)
	{
		return Long.toString(code);
	}*/
	}
	

}
