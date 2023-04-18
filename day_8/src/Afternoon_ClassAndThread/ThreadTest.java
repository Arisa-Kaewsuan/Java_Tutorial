package Afternoon_ClassAndThread;

public class ThreadTest
{

	public static void main(String[] args)
	{
		Thread t1 = new Thread(new Runnable(){
			public void run() 
			{
				while(true) 
				{
					try { Thread.sleep(150);}  // if sleep > will slower 
					catch(Exception e) {}
					System.out.print("x");
				}
			}
		});
		t1.start();
		
		Thread t2 = new Thread(new Runnable(){
			public void run() 
			{
				while(true) 
				{
					try { Thread.sleep(100);}
					catch(Exception e) {}
					System.out.print("y");
				}
			}
		});
		t2.start();

	}

}
