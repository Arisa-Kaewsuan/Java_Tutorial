import java.util.Arrays;
import java.util.Scanner;

public class EE15
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int[][] pascal = new int[n][(n*2)-1];
	    for(int i =0 ; i < n ;i++)
	    {
	    	for(int j=0 ; j< ((n*2)-1) ; j++)
	    	{
	    		if((j>=(n-1)-i) && (j<(n+i)))
	    		{
	    			if(i%2==0)
	    			{   
	    				if(j%2==0 && i!=0) 
	    				{ 
	    					pascal[i][j] = pascal[i-1][j-1]+pascal[i-1][j+1];
	    					System.out.print(pascal[i][j]); 
	    				}
	    				else if(i==0) {System.out.println("1");}
	    				else 
	    				{ 
	    					System.out.print(" "); 
	    					pascal[i][j] = 0;
	    				}
	 
	    			}
	    			else 
	    			{ 
	    				if(j%2!=0) 
	    				{ 
	    					pascal[i][j] = pascal[i-1][j-1]+pascal[i-1][j+1];
	    					System.out.print(pascal[i][j]); 
	    				}
	    				else 
	    				{ 
	    					System.out.print(" "); 
	    					pascal[i][j] = 0;
	    				}
	    			}
    				
	    		}
	    		else
	    		{
	    			System.out.print(" ");
	    			pascal[i][j] = 0;
	    		}
	    	}
	    	System.out.println();
	    }
	    
	   /* for(int i = 0 ; i < pascal.length ; i++) //Test
	    {
	       for(int j = 0 ; j < pascal[i].length ; j++)
	       {
	           if(pascal[i][j] != 0)
	           {
	    	       System.out.print(pascal[i][j]); 
	    	   }
	    	   else
	    	   {
	    	       System.out.print(" ");
	    	   }
	       }
	       System.out.println();
	    }*/
	}

	/*public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		
		for(int i = 0 ; i < n ; i++)
		{
			for(int j = 0 ; j < n+i ; j++)
			{
				if(j < n-(i+1))
				{
				   System.out.print(" ");
				}
				else if(j > n-(i+1))
				{
				    System.out.print("2");
				}
				else
				{
					System.out.print("1");
				}
			}
			System.out.println();
		}
	}*/
}
