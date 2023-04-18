package day_11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class file
{
    // ทำยังไงให้มัน Append 
	public static void main(String[] args)
	{
		File f = new File("D://xxx.txt");
		// FileOutputStream outs;
		PrintWriter pw = null;
		try
		{
			pw = new PrintWriter(f);
			pw.println("Hello");
	        pw.close();
		} catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			if(pw != null)
			{
				pw.close();
			}
		}
		
	}

}
