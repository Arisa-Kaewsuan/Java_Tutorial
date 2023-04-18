import java.security.*;
import java.util.*;

public class ArrayList_Test 
{
    private int [] a;
    private int size;
	
	public  ArrayList_Test()
	{
		size = 0;
		a = new int[10];
	}
	
     public void add(int x)
     {
    	 if(a.length >= size)  // check ว่า index นี้มีอยู่จริง
    	 {
    		 int[] a2 = new int[a.length*2];  // ขยายขนาดอาเรย์ เป็น 2 เท่่า ของ Array เดิม
    		 for(int i = 0 ; i < a.length ; i++)  // copy ของเก่า ใส่ ของใหม่
    		 {
    			 a2[i] = a[i];
    		 }
    		 a = a2; // ชี้ไปยัง array ใฟม่
    	 }
    	 a[size]=x;  // เพิ่มค่าลงไปใน Array
    	 size++;     // size array ++
     }
     
     public int get(int x)
     {
    	 if(x < 0 || x > a.length-1)
    	 {
    		 throw new InvalidParameterException("index out of range : "+x);
    	 }
    	 return a[x];
     }
     
     public void set(int index , int n)
     {
    	 if(index < 0 || index > a.length-1)
    	 {
    		 throw new InvalidParameterException("index out of range : "+index);
    	 }
    	 a[index] = n;
     }
     
     public static void toArray()
     {
    	 
     }
    
     public static void main (String[] args)
     {
    	 ArrayList_Test x = new ArrayList_Test();
    	 x.add(5);
    	 x.add(4);
    	 x.add(3);
    	 x.add(2);
    	 System.out.println(x.get(2));
    	 x.set(2, 50);
    	 System.out.println(x.get(2));
     }
}
