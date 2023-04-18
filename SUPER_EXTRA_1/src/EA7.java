import java.util.Scanner;

public class EA7
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		double wA = sc.nextDouble();
		double pA = sc.nextDouble();
		double wB = sc.nextDouble();
		double pB = sc.nextDouble();
		
		if(pA/wA < pB/wB)
		{ System.out.println("A is cheaper than B"); }
		else if(pA/wA == pB/wB)
		{ System.out.println("Equal price"); }
		else
		{ System.out.println("B is cheaper than A"); }

	}


	/*public static void main(String[] args)
	{
		double wA , pA ,wB ,pB ,a ,b ;
		Scanner p = new Scanner (System.in);
        //System.out.print("Input weight & price of A : ");
        wA = p.nextDouble();
        pA = p.nextDouble();
        //System.out.print("Input weight & price of B : ");
        wB = p.nextDouble();
        pB = p.nextDouble();
        
        a = wA/pA ; // mี่ราคา 1 บาท ซื้อได้หนักเท่าไหร่
        b = wB/pB ;
        
        if(a>b)
        {
        	System.out.println("A is cheaper than B");
        }
        else if(a==b)
        {
        	System.out.println("Equal price");
        }
        else 
        {
        	System.out.println("B is cheaper than A");
        }
        p.close();

	}*/

}
