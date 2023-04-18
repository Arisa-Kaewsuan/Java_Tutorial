import java.util.List;
import java.util.ArrayList;
public class test2
{

	public static void main(String[] args)
	{
		int a10 = 84;
		List ans = new ArrayList();
		do {
			int bit = a10%2;
			a10 = a10 /2;
			ans.add(bit);
		}while(a10 > 0);
		for(int i = ans.size(); i > 0 ; i--)
		{
			System.out.print(ans.get(i-1));
		}

	}

}
