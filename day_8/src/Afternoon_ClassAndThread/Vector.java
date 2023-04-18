package Afternoon_ClassAndThread;
public class Vector
{
	//  M1 (P.101)
	public double x,y;
	public Vector add(Vector v)
	{
		Vector result = new Vector();
		result.x= x+v.x;
		result.y= y+v.y;
		return result;
	}
	
	// Homework 
}
