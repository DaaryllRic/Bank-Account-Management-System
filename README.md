# Bank-Account-Management-System
An object oriented bank account management system written in Java. No GUI as of yet. A precursor to more complex object oriented projects.

## Usage
The BankAccount class has two constructors:
```java
//To initialize a bank account with no initial balance
	public BankAccount(int num, String name) { 
		accountNumber = num;
		accountName = name;
	}

//To initialize a bank account with an initial balance
	public BankAccount(int num, String name, double bal) {
		accountNumber = num;
		accountName = name;
		balance = bal;
	}
```
The Transaction class reads user input using a Scanner object following the order shown in the constructors
