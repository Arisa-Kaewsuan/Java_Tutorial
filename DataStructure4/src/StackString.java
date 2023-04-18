
public class StackString 
{
	
	LinkedListString ls;
	
	public StackString()
	{
		ls = new LinkedListString();
	}
	
	public void push(String s)
	{
		ls.addFirst(s);
	}
	
	public String pop()
	{
		String x = ls.get(0);
		ls.removeAt(0);
		return x;
	}
	
	public int size()
	{
		return ls.size();
	}
	
	public void StackStringData() 
	{
		for(int i = 0 ; i < size() ; i++)
		{
			System.out.println(ls.get(i)+"\t");
		}
		
	}

}
