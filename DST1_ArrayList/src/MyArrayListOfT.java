import java.security.InvalidParameterException;
import java.util.Arrays;

public class MyArrayListOfT <T>{
	private int size;
	private T []data;

	public MyArrayListOfT()
	{
		int size = 0;
		data = (T[])( new Object[10]);
	}
	
	public void add(T x)
	{
		if(size  >= data.length)
		{
			T [] data2 = (T[])(new Object[data.length*2]);		
			for(int i = 0 ; i < data.length ; i++)
			{
				data2[i] = data[i];
			}
			data = data2;
		}
		data[size] = x;
		size++;
	}
	
	public T[] toArray()
	{
		T [] x = (T[])(new Object[data.length*2]);
		for(int i = 0 ; i < x.length ; i++) 
		{
			x[i] = data[i];
		}
		return x;
	}
	
	public String toString()
	{
		T []x = toArray();
		return Arrays.toString(x);
	}
	
	public T get(int index)
	{
		if(index < 0 || index >= size)
		{
			throw new InvalidParameterException("Index out of range : " +index);
		}
		return data[index];
	}
	
	public void set(T x , int index)
	{
		if(index < 0 || index >= size)
		{
			throw new InvalidParameterException("Index out of range : " +index);
		}
		data[index] = x;
		size++;
	}
	
	public int size() {
		return size;
	}
	
	public void removeAt(int index) {
		if(index < 0 || index >= size)
		{
			throw new InvalidParameterException("Index out of range : " +index);
		}
		
		for(int i = index ; i < size-1 ; i++) {
			data[i] =data[i+1];
		}
		size--;
	}

}



