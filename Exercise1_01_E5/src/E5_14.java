import java.util.Scanner;

public class E5_14
{

	public static void main(String[] args)
	{
		double nA, nB ,nC ,nD ,nF ,sum ,GPA ;
		Scanner p = new Scanner(System.in);
		
		//System.out.print("Enter number of people who received grade A : ");
        nA = p.nextDouble();  
        //System.out.print("Enter number of people who received grade B : ");
        nB = p.nextDouble();    
        //System.out.print("Enter number of people who received grade C : ");
        nC = p.nextDouble();    
        //System.out.print("Enter number of people who received grade D : ");
        nD = p.nextDouble();    
        //System.out.print("Enter number of people who received grade F : ");
        nF = p.nextDouble();  
        
        sum = (4*nA)+(3*nB)+(2*nC)+(1*nD)+(0*nF);
        GPA = sum / (nA+nB+nC+nD+nF);
        
        System.out.println(GPA);
        p.close();

	}

}
