package Test_OOP2;

import java.math.BigInteger;
import java.util.Scanner;

public class No_4 
{

    public static void main(String[] args) 
    { 
    	Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        BigInteger sumofSquare = BigInteger.valueOf(0);
        //BigInteger fraction = BigInteger.valueOf(fact(n+1,n*2));
       // BigInteger denominator = BigInteger.valueOf(fact(1,n));
        BigInteger fraction =fact(n+1,n*2);
        BigInteger denominator = fact(1,n);
        System.out.println(fraction+" "+denominator);
        sumofSquare = fraction.divide(denominator);
        System.out.printf("easyline(%s) => %s",n,sumofSquare);
    }  

    public static BigInteger fact(int start , int end)
    {
    	BigInteger r= BigInteger.valueOf(1);
    	//int r = 1 ;
    	for(int i = start ; i <= end ; i++)
    	{
    		r = r.multiply(BigInteger.valueOf(i));
    	    //r*= i ;
    	}
    	
		return r;
    }
}
