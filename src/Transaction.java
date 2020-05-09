import java.util.*;

public class Transaction {

	public static void main(String[] args) {
		
		int accountNum;
		String name;
		double accountBal;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please provide an account number:");
		accountNum = Integer.parseInt(input.nextLine());
		System.out.println("Please provide an account name:");
		name = input.nextLine();
		System.out.println("Please provide your initial balance ");
		accountBal = Double.parseDouble(input.nextLine());
		
		BankAccount savings = new BankAccount(accountNum, name, accountBal);
		System.out.println("The balance is " +savings.getBalance());
		System.out.println("The owner of this bank account is  " +savings.getName());
		System.out.println("The account number of this bank account is  " +savings.getAccountNumber());
		
		System.out.println("Please deposit an amount ");
		double amount = Double.parseDouble(input.nextLine());
		savings.deposit(amount);
		System.out.println("The balance is now " +savings.getBalance());
		
		System.out.println(savings.toString());
	}

}
