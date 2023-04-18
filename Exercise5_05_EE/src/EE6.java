import java.util.ArrayList;

public class EE6
{

	public static void main(String[] args)
	{
		int i = 1;
		int count=1;
		double pi=0;
		ArrayList<Double> sum = new ArrayList<Double>();
		while(i<9) // Test : i<8
		{
			if(i%2 == 0)
			{
				pi -= 1.0/((i*2.0)-1.0);
				//System.out.println(4*pi); //Test
				sum.add(4*pi);
			}
			else 
			{
				pi += 1.0/((i*2.0)-1.0);
				//System.out.println(4*pi); //Test
				sum.add(4*pi);
			}
			if(i>1) { System.out.println(sum.get(i)-sum.get(i-1)); }.args.
			/*if( < 0.000001)
			{
				System.out.println(count);
				return;
			}
			else
			{
				count++;
			}*/
			i++;
		}
	}
}
