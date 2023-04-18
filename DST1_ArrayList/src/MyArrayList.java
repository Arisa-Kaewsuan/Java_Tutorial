import java.security.InvalidParameterException;
import java.util.Arrays;

import javax.xml.crypto.Data;

public class MyArrayList 
{
	private int size;
	private int []data;

	public MyArrayList()
	{
		int size = 0;
		data = new int[10];
	}
	
	public void add(int x)
	{
		if(size  >= data.length)
		{
			int [] data2 = new int[data.length*2];		
			for(int i = 0 ; i < data.length ; i++)
			{
				data2[i] = data[i];
			}
			data = data2;
		}
		data[size] = x;
		size++;
	}
	
	public int[] toArray()
	{
		int []x = new int[size];
		for(int i = 0 ; i < x.length ; i++) 
		{
			x[i] = data[i];
		}
		return x;
	}
	
	public String toString()
	{
		int []x = toArray();
		return Arrays.toString(x);
	}
	
	public int get(int index)
	{
		if(index < 0 || index >= size)
		{
			throw new InvalidParameterException("Index out of range : " +index);
		}
		return data[index];
	}
	
	public void set(int x , int index)
	{
		if(index < 0 || index >= size)
		{
			throw new InvalidParameterException("Index out of range : " +index);
		}
		data[index] = x;
		size++;
	}

}
