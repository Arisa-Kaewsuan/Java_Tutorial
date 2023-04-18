
public class EA4217
{

	public static void main(String[] args)
	{
       for(int i = 1 ; i<=5 ; i++)
       {
    	   for(int j = 0 ; j< (i*2)-1 ; j++)
    	   {
    		   System.out.print("*");
    	   }
    	   for(int j = 18-(((i*2)-1)*2) ; j>0 ; j--)
    	   {
    		   System.out.print("-");
    	   }
    	   for(int j = 0 ; j< (i*2)-1 ; j++)
    	   {
    		   System.out.print("*");
    	   }
    	   System.out.println();
       }
       
       for(int i = 1 ; i<5 ; i++)
       {
    	   for(int j = 8-((i*2)-1) ; j> 0 ; j--)
    	   {
    		   System.out.print("*");
    	   }
    	   for(int j = 0; j< 18-((9-(i*2))*2); j++)
    	   {
    		   System.out.print("-");
    	   }
    	   for(int j = 8-((i*2)-1) ; j> 0 ; j--)
    	   {
    		   System.out.print("*");
    	   }
    	   System.out.println();
       }
       
	}

}
