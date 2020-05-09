
public class BankAccount {
	private static double interestRate = 0.0;
	// all bank accounts have the same interest rate, thus interestRate has to be static
	private final int accountNumber;
	private String accountName;
	private double balance; // e.g. 1.27 means $1.27
	
	/**
	 * The constructors  
	 */
	
	/**
	 * @param num - number for the account 
	 * @param  name - name of the account
	 */
	
	public BankAccount(int num, String name) {
		accountNumber = num;
		accountName = name;
	}
	
	/**
	 * When creating a BankAccount that has an initial balance 
	 * @param num - number for the account
	 * @param name - name for the account
	 * @param bal - opening balance
	 */
	
	public BankAccount(int num, String name, double bal) {
		accountNumber = num;
		accountName = name;
		balance = bal;
	}
	
	/**
	 * The withdrawal should be refused if the withdrawal would result in a negative balance
	 * 
	 * @param amount - The amount to be withdrawn
	 */
	
	public double withdraw(double amount) {
		if (balance >= amount) {
			balance = balance - amount;
			return balance;
		}
		else
			return -1.0;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public String getName() {
		return this.accountName;
	}
	
	public int getAccountNumber() {
		return this.accountNumber;
	}
	
	/**
	 * Setting a new interest rate: This will be a static method so that a change to the
	 * interest rate changes the interest rate for all objects
	 * 
	 * @param newInterest - The new interest rate
	 */
	
	public static void setInterestRate(double newInterest) {
		interestRate = newInterest;
	}
	
	public static double getInterestRate() {
		return interestRate;
	}
	
	public String toString() {
		return "accountNumber =" + accountNumber + " accountName=" +accountName + " balance=" +balance;
	}
	
} //End of class
