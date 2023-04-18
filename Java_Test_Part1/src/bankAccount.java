import java.util.Scanner;

public class bankAccount
{
	public long Coin;
	public String Number;
	public String Name;
	public String Password;

	public bankAccount (String Number , String Name , String Password , long Coin)
	{
		this.Number = Number; 
		this.Name = Name;
		this.Password = Password; 
		this.Coin = Coin;
	}
	public static void Deposit()
	{
		bankAccount[] x = new bankAccount[10];
		Scanner p = new Scanner(System.in);
		System.out.println("Please Input Account ID : ");
		String ID = p.nextLine();
		System.out.println("Amount you wish to deposit : ");
		long newCoin = p.nextLong();
		
		int index = indexAccount(ID);
		long oldCoin = x[index].Coin;
		oldOutput(index);
		x[index].Coin = newCoin + oldCoin;
		System.out.println("Deposit : " + "+" + newCoin);
		System.out.println("New Balance : " + x[index].Coin);
		p.close();
	}

	public static void Withdraw()
	{
		bankAccount[] x = new bankAccount[10];
		Scanner p = new Scanner(System.in);
		int index;
		while (true)
		{
			System.out.println("Please Input Account ID : ");
			String ID = p.nextLine();
			System.out.println("Please Input Password : ");
			String Pass = p.nextLine();
			index = toCheck(ID, Pass);
			if (index == -1)
				continue;
			else
				break;
		}
		System.out.println("Amount you wish to withdraw : ");
		long newCoin = p.nextLong();
		oldOutput(index);
		long oldCoin = x[index].Coin;
		x[index].Coin = oldCoin - newCoin;
		System.out.println("Weposit : " + "-" + newCoin);
		System.out.println("New Balance : " + x[index].Coin);
		p.close();
	}

	public static void checkBalance()
	{
		bankAccount[] x = new bankAccount[10];
		Scanner p = new Scanner(System.in);
		int index;
		while (true)
		{
			System.out.println("Please Input Account ID : ");
			String ID = p.nextLine();
			System.out.println("Please Input Password : ");
			String Pass = p.nextLine();
			index = toCheck(ID, Pass);
			if (index == -1)
				continue;
			else
				break;
		}
		oldOutput(index);
	}

	public static int toCheck(String ID, String pass)
	{
		bankAccount[] x = new bankAccount[10];
		int i;
		for (i = 0; i < x.length; i++)
		{
			if ((x[i].Number == ID) && (x[i].Password == pass))
				break;
			else
				return -1;
		}
		return i;
	}

	public static int indexAccount(String a)
	{
		bankAccount[] x = new bankAccount[10];
		int i = 0;
		while (i < x.length)
		{
			if (x[i].Number.equals(a))
				break;
			i++;
					
		}
		return i;
	}

	public static void oldOutput(int index)
	{
		bankAccount[] x = new bankAccount[1];
		System.out.println("Account ID : " + x[index].Number);
		System.out.println("Account Name : " + x[index].Name);
		System.out.println("Account Balance : " + x[index].Coin);
	}
}
