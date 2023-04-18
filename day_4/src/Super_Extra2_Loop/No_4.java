package Super_Extra2_Loop;

public class No_4
{

	public static void main(String[] args)
	{
		int i = 0 ; // นับว่ากี่ปี ปนะชากร a ถึงจะมากกว่า b
        double a = 50000000 ;
        double b = 70000000 ;
        
        while(true)
        {
        	a = a*1.03 ;
        	b = b*1.02 ;
        	i++;
        	if(a >= b)
        	{
        		break;
        	}
        }
        System.out.println(i);

	}

}
