/*
 * Name: Juliana Bruno
 * Project: 3
 * Title: BankAccount.java
 * Summary: outline of automated teller machine information
 * Date: 12/6/24
 */
public class BankAccount {

	//instance variables
	private double balance;
	private boolean isSavingsAccount;
	private String accountNumber;
	private double fees;
	
	//constructors
	//default constructor
	public BankAccount() {
		balance = 0.0;
		isSavingsAccount = false;
		accountNumber = "";
		fees = 0.0;
	}
		
	//overloaded constructor
	public BankAccount(double b, boolean i, String a) {
		balance = b;
		isSavingsAccount = i;
		accountNumber = a;
		fees = 0.0;
	}
	
	//get and set methods
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(int b) {
		balance = b;
	}
	
	public boolean getIsSavingsAccount() {
		return isSavingsAccount;
	}
	
	public void setIsSavingsAccount(boolean i) {
		isSavingsAccount = i;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public void setAccountNumber(String a) {
		accountNumber = a;
	}
	
	public double getFees() {
		return fees;
	}
	
	public void setFees(double f) {
		fees = f;
	}
	
	//toString() method
	public String toString() {
		String x;
		if (isSavingsAccount == true) {
			x = "Balance: $" + balance + "\nType of account: Savings" + "\nAccount Number: " + accountNumber + "\nFees: $" + fees;
		} else {
			x = "Balance: $" + balance + "\nType of account: Checking" + "\nAccount Number: " + accountNumber + "\nFees: $" + fees;
		}
		return x;
	}
	
	//deposit method
	public void deposit(double x) {
		double deposit = x;
		balance = balance + deposit;
	}
	
	//withdraw method
	public boolean withdraw(double y) {
		double withdraw = y;
		if (balance >= withdraw) {
			balance = balance - withdraw;
			return true;
		} else {
			fees = fees + 25;
			return false;
		}
		
	}
	
	//reset fees method
	public void resetFees() {
		fees = 0.0;
	}
	
	
	
	
	
}
