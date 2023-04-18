
public class EB_4
{
	public static void main(String[] args)
	{
		int i=1;
		int  nA = 50000000;
		int  nB = 70000000;
		while(true)
		{
			nA += ((3*nA)/100);
			nB += (2*nB)/100;
			if(nA > nB)
			{
				System.out.println(i);
				return;
			}
			i++;
		}
	}

	/*public static void main(String[] args)
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
	}*/
}
