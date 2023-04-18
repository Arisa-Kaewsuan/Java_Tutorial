public class HanoiTower 
{
    int [][] x = new int[3][5];
    
    public void init()
    {
    	for(int i=0; i < x[0].length ; i++)
    	{
    		x[0][i] = i+1;
    	}
    }
    
    public void move(int from , int to , int n)
    {
    	if(from == to) return;
    	if(n == 1)
    	{
    		int findex = 0;
    		while (findex < x[0].length && x[from][findex] == 0)
    		{
    			findex++;
    		}
    		int tindex = 0;
    		while(tindex < x[0].length && x[to][tindex] == 0)
    		{
    			tindex++;
    		}
    		tindex--;
    		x[to][tindex] = x[from][findex];
    		x[from][findex] = 0;
    		draw();
    		return;
    	}
    	int anotherpole = 3 - from - to;
    	move(from , anotherpole , n-1);
    	move(from , to , 1);
    	move(anotherpole , to , n-1);	
    }
    
    void draw()
    {
    	for(int i = 0; i < x[0].length ; i++)
    	{
    		for(int j = 0; j < x.length ; j++)
        	{
    			for(int k = 0; k < x[0].length - x[j][i] ; k++)
    	    	{
    	    		System.out.print("_");
    	    	}
    			for(int k = 0; k < x[j][i] ; k++)
    	    	{
    	    		System.out.print("X");
    	    	}
    			System.out.print("|");
    			for(int k = 0; k < x[j][i] ; k++)
    	    	{
    	    		System.out.print("X");
    	    	}
    			for(int k = 0; k < x[0].length - x[j][i] ; k++)
    	    	{
    	    		System.out.print("_");
    	    	}
    			System.out.print("\t");
        	}
    		System.out.println();
    	}
    	System.out.println("\n\n");
    }
    
	public static void main(String[] args) 
	{
		HanoiTower ht = new HanoiTower();
		ht.init();
		ht.draw();
		ht.move(0, 2, 5);
	}

}
