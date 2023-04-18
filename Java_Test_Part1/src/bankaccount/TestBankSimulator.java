package bankaccount;

import java.util.Scanner;

public class TestBankSimulator
{

	public static void printMenu()
	{
		System.out.println("******** MENU ********");
		System.out.println("Please Select Your Option");
		System.out.println("1. Deposit");
		System.out.println("2. Withdraw");
		System.out.println("3. Check Balance");
		System.out.println("4. Exit");

		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt(); sc.nextLine();
		while (i <= 0 || i > 4)
		{
			System.out.println("******** MENU ********");
			System.out.println("Please Select Your Option");
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. Check Balance");
			System.out.println("4. Exit");
			i = sc.nextInt(); sc.nextLine();
		}
		return i;
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		BankSimulator sim = new BankSimulator();
		while (true)
		{
			int input = printMenu(sc);
			if (input == 1)
			{
				System.out.println("Please input acc_no :");
				int acc_no = sc.nextInt();
				System.out.println("Please input amount to deposit : ");
				double amount = sc.nextDouble();
				sim.deposit(acc_no, amount);
			} else if (input == 2)
			{
				System.out.println("Please input acc_no :");
				int acc_no = sc.nextInt();sc.nextLine();
				System.out.println("Please input password :");
				String password = sc.nextLine();
				System.out.println("Please input amount to withdraw : ");
				double amount = sc.nextDouble();
				sim.withdraw(acc_no, password , amount);
			} else if (input == 3)
			{
				System.out.println("Please input acc_no :");
				int acc_no = sc.nextInt(); sc.nextLine();
				System.out.println("Please input password :");
				String password = sc.nextLine();
				System.out.println("Please input amount to getBalance : ");
				double amount = sc.nextDouble();
				sim.getBalance(acc_no, password , amount);
			}else if(input == 4)
			{
				return;
			}
		}

	}

}
