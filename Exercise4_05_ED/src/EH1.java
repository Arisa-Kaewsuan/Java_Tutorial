import java.util.ArrayList;

public class EH1
{

	public static void main(String[] args)
	{
		double inc = 0 ;
		double dep = 500 ;
		int  i = 1 ;
		
		while(true)
		{
			inc = dep*0.03;
			dep += inc ;
			
			if(dep >= 20000)
			{
				break;
			}
			i++;
		}
	    System.out.println(i);
	}

}
