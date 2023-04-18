/*input : enter 1 Integer (sec) */
/*output : Print year month day hrs min sec
/*Example : 1000000 --> 0 0 11 13 46 40 */
/*          5000000 --> 0 1 27 20 53 20 */
/*          2000000 --> 0 0 23 3  33 20 */


import java.util.Scanner;

public class E5_16
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int sec = sc.nextInt(); // input correct

		int year = sec/31556926;
		int m = sec/2629743;
		int day = sec/86400;
		int hrs = (sec%(24*3600)) /3600 ;
		int min = (sec % 3600) / 60 ;
		int s = sec%60  ;
		
		System.out.println(year); //correct
		System.out.println(m); //correct
		System.out.println(day); // correct
		System.out.println(hrs); //correct
		System.out.println(min); //correct
		System.out.println(s); //correct
	}

}
