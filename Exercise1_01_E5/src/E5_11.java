/*input : enter 6 Integer (a1,b1,c1,a2,b2,c2) sequently */
/*output : find x and y from 
           a1X+b1Y = C1 
           a2X+B2Y = C2 */

/*Example : 2 1 10 -1 2 0 --> 4.0  2.0 */
/*          1 2 3   4 5 6 --> -1.0 2.0 */

import java.util.Arrays;
import java.util.Scanner;

public class E5_11
{
	public static void main(String[] args)
	{
	   Scanner sc = new Scanner (System.in);
	   int a1 = sc.nextInt();
	   int b1 = sc.nextInt();
	   int c1 = sc.nextInt();
	   int a2 = sc.nextInt();
	   int b2 = sc.nextInt();
	   int c2 = sc.nextInt();
	   double x =0, y = 0;
	   int ex1=0 ,ex2=0 , x1=0 , x2=0 ;
	   int nA1=0 , nB1=0 , nC1=0 , nA2=0 , nB2=0 , nC2 =0;
	   int A=0 , B=0 , C=0;
	   
	   if(a1>0 && a2>0) // สัมปสิทธิ์ของ X ไม่ติดลบ หรือ เท่ากับ 0
	    { 
		   x1 = a1;
		   x2 = a2;
	   }
	   else  // สัมปสิทธิ์ของ X เป็นบวก
	   {
		   x1 = b1;
		   x2 = b2;
	   }
	   
	   if(a1==a2 || b1==b2) // case1 : x1 = x2  หรือ  y1 = y2
	   {
		   A = a1-a2; 
		   B = b1-b2; 
		   C = c1-c2; 
		   // Ax + By = C
		   
		   if(A == 0) // --- Kill X (x=0 x หาย )  หา y  จาก  By = C
		   { 
			   y = C/B; 
			   x = (c1-(b1*y)) / a1;
			   //y *= b1;
			   //x = c1-(b1*y);  // หา  X Ax + By = C
		   }
		   else   // B == 0 --- y = 0 y หาย   หา x ก่อน จาก  Ax = C
		   { 
			   x = C/A;
			   y = (c1-(a1*x)) / b1; 
			   //x *= a1;
			   //y = c1-(a1*x);
		   }
	   }
	   else    
	   {
		   // หา ค.ร.น ของ a1 a2
		  int i = 1;
		  while(true)
		  {
			  if(i%x1 == 0 && i%x2 == 0)
			  { 
				  ex1 = i/x1;
				  ex2 = i/x2;
				  break;
			  }
			  i++;
		  }
		   
		 //เอาสปส ที่ได้จากการหา ค.ร.น คูณทั้งสมการ
		  nA1 = ex1*a1 ;
		  nB1 = ex1*b1 ;
		  nC1 = ex1*c1 ;
		  nA2 = ex2*a2 ;
		  nB2 = ex2*b2 ;
		  nC2 = ex2*c2 ;
		  
		   // ลบสมการ กำจัดตัวแปร
		  A = nA1-nA2;
		  B = nB1-nB2;
		  C = nC1-nC2;
		  
		  //ย้ายข้างหาคำตอบตัวที่หนึ่ง
		  if(A==0) { y = (double)C/B; }
		  else {x = (double)C/A;}
		  
		  //แทนค่าหาอีกหนึ่งคำตอบ
		  if(A==0) { x = (c1-(y*b1))/a1; }
		  else { y = (c1-(x*a1))/b1; }
	   }
	   System.out.println(x);
	   System.out.println(y);
	}
	
	   
	   /*System.out.println(ex1); // 2
	   System.out.println(ex2); // 1
	   System.out.println(nA1+" "+nB1+" "+nC1); // 4 2 20
	   System.out.println(nA2+" "+nB2+" "+nC2); // -1 2 0
	   System.out.println(A+" "+B+" "+C); // 5 0 20*/
}
