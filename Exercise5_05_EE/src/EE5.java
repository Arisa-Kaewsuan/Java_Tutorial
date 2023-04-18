import java.util.ArrayList;

public class EE5
{

	public static void main(String[] args)
	{
		int i = 1 ;
		ArrayList<Double> sumPi = new ArrayList<Double>();
		
		while(true)
		{       double sum = 0.00;
				for(int j = i ; j < i+1 ; j++)
				{
					if(j == 1)
					{
						sum += 1.0;
					}
					else if(j%2 == 0)
					{
						sum += -(1.0/(i+(i-1.0))) ;
	
					}
					else
					{
						sum += 1.0/(i+(i-1.0)) ;
					}
				}
				
				sum *= 4.00;
				System.out.println(sum);
				sumPi.add(sum);
				if(sumPi.get(i-1)-sumPi.get(i-2) < 0.000001)
				{
					System.out.println(i+1);
					break;
				}
			}
			i++;
		}
		

	}

