  
public class EA6_3
{
	public static void main(String[] args)
	{
       for(int i = 1 ; i <= 9 ; i++)
       {
    	   if(i<6)
    	   {
               for(int j = 0 ; j < i-1 ; j++)
               { System.out.print("-"); }
               System.out.print("x");
           }
    	   else
    	   {
    	       for(int j = 0 ; j < 9-i ; j++)
    	       { System.out.print("-"); }
    	       System.out.print("x");
    	   }
    	   
    	   if(i<6)
    	   {
    	       for(int j = 0 ; j < ((5-i)*2)-1 ; j++)
    	       { System.out.print("-"); }
    	       if(i != 5)
    	       { System.out.print("x");}
    	   }
    	   else
    	   {
    	       for(int j = 0 ; j < (i*2)-11 ; j++)
    	       { System.out.print("-"); }
    	       System.out.print("x");
    	   }
    	   
    	   if(i<6)
    	   {
    	      for(int j = 1 ; j < i ; j++)
    	      { System.out.print("-"); }
    	   }
    	   else
    	   {
    	      for(int j = 0 ; j < 9-i ; j++)
    	      { System.out.print("-"); }
    	   }
    	   System.out.println();
       }
	}


	/*public static void main(String[] args)
	{
		for (int i = 1; i <= 9; i++)
		{
			// make -1
			if (i <= 5)
			{
				for (int j = 1; j <= i - 1; j++)
				{

					System.out.print("-");
				}
			} else if (i >= 6)
			{
				for (int k = 1; k <= 9 - i; k++)
				{
					System.out.print("-");
				}
			}
			System.out.print("x");

			// make -2
			if (i < 5)
			{
				for (int j = 8 - i - (i - 1); j >= 1; j--)
				{

					System.out.print("-");
				}
			} else if (i > 5)
			{
				for (int k = 1; k <= (i - 2) - (9 - i); k++)
				{
					System.out.print("-");
				}
			}
			if (i != 5)
				System.out.print("x");

			// make -3
			if (i <= 5)
			{
				for (int j = 1; j <= i - 1; j++)
				{

					System.out.print("-");
				}
			} else if (i >= 6)
			{
				for (int k = 1; k <= 9 - i; k++)
				{
					System.out.print("-");
				}
			}
			System.out.println();
		}

	}*/

}
