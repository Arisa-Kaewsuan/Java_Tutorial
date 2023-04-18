
public class MyArrayListTest 
{

	public static void main(String[] args) 
	{
		MyArrayList l = new MyArrayList();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		System.out.println(l);
        System.out.println(l.get(1));
        l.set(50, 2);
        System.out.println(l);
	}

}
