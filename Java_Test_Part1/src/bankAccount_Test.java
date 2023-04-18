import java.util.Scanner;

public class bankAccount_Test extends bankAccount
{
	public bankAccount_Test(String Number, String Name, String Password, long Coin)
	{
		super(Number, Name, Password, Coin);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args)
	{
		Scanner p = new Scanner(System.in);
		bankAccount p0,p1,p3,p4,p5,p6,p7,p8,p9,p10;
        p0 = new bankAccount ("115566" , "mama" , "852" , 5000); 
        p1 = new bankAccount("12345" , "nana" , "258" , 4000);
        p2 = new bankAccount ("225566" , "baba" , "965" , 4000);
        p3 = new bankAccount ("445566" , "lala" , "569" , 3000);
        p4 = new bankAccount ("555566" , "yaya" , "782" , 2000);
        p6 = new bankAccount ("665566" , "papa" , "278" , 1000); 
        p7 = new bankAccount ("775566" , "vava" , "354" , 8000);
        p8 = new bankAccount ("885566" , "sasa" , "453" , 7000);
        p9 = new bankAccount ("995566" , "rara" , "656" , 6000);
        p10 = new bankAccount ("54321" , "zaza" , "565",9000);
		
		System.out.println("Please select the desired transaction : \n" + "1.) Deposit \n" + "2.) Withdraw \n"
				+ "3.) Check Balance \n");
		int num = p.nextInt();
		switch (num)
		{
		case 1:
			Deposit();
			break;
		case 2:
			Withdraw();
			break;
		case 3:
			checkBalance();
		default:
			System.out.println("Value Invalid");
		}
		p.close();
	}
}
