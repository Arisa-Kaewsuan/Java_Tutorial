package loop;

import java.util.Scanner;

public class Ex3
{
    /* ราคาถูกกว่า คือ ต้องมีน้ำหนักมากกว่าที่ราคาเท่ากัน
     * A : w=75   p=148
     * B : w=105  p=215
     */
	public static void main(String[] args)
	{
		double wA , pA ,wB ,pB ,a ,b ;
		Scanner p = new Scanner (System.in);
        System.out.print("Input weight & price of A : ");
        wA = p.nextDouble();
        pA = p.nextDouble();
        System.out.print("Input weight & price of B : ");
        wB = p.nextDouble();
        pB = p.nextDouble();
        
        a = wA/pA ; // mี่ราคา 1 บาท ซื้อได้หนักเท่าไหร่
        b = wB/pB ;
        
        if(a>b)
        {
        	System.out.println("a ถูกกว่า");
        }
        else if(a==b)
        {
        	System.out.println("ราคาเท่ากัน");
        }
        else 
        {
        	System.out.println("b ถูกกว่า");
        }
        p.close();
	}

}
