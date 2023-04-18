import java.util.ArrayList;
import java.util.Scanner;

public class EC_9
{

	public static void main(String[] args)
	{
	    Scanner sc = new Scanner (System.in);
	    int n = sc.nextInt();
	    ArrayList<Integer> co = new ArrayList<Integer>();
	    int x=0 , j=0;
	    do
	    {
	    	x = sc.nextInt();
	    	if(x != -999)
	    	{
		    	co.add(x);
	    	}
	    	else
	    	{
	    		break;
	    	}
	    	j++;
	    }while(true);
	    
	    double a = sc.nextDouble();
	    double b = sc.nextDouble();
	    double sum = 0.00;
	    
	    for(int i = 0 ; i<co.size() ; i++)
	    {
	    	sum += ((co.get(i)*Math.pow(b, (n-i)+1) / ((n-i)+1)) - (co.get(i)*Math.pow(a, (n-i)+1) / ((n-i)+1)));
	    }
	    
	    System.out.println(sum);
	}

	private static void While(boolean b) {
		// TODO Auto-generated method stub
		
	}

}
