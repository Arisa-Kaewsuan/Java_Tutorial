
public class No_9
{

	public static void main(String[] args)
	{
		int [] tripleUp = new int [] {1,4,5,6,2};
		int count = 0;
		
		for(int i = 0 ; i < tripleUp.length-2 ; i++)
		{
			for(int j = i ; j < i+3 ; j++)
			{
				int l = tripleUp[j];
				if(l+1 == tripleUp[j+1] && l+2 == tripleUp[j+2])
				{
					System.out.println("True");
					break;
				}
				else
					count++;
			}
		}
		if(count != 0)
			System.out.println("False");
	}

}
