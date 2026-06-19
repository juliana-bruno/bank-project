/*
 * Name: Juliana Bruno
 * Project: 3
 * Title: BankAccountDriver.java
 * Summary: program displays an automated teller machine menu and the user selects their choices. program then displays information about the user's bank account
 * Date: 12/6/24
 */
import java.util.Scanner;
public class BankAccountDriver {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		
		BankAccount myAccount = new BankAccount(500, false, "123456");
	
		int choice;
		int feeReset = 1;
		do {
			System.out.println("Welcome to the Automated Teller Machine.");
			System.out.println("Please select from the following options:");
			System.out.println("1 - Display Account Information \n2 - Make a Withdraw \n3 - Make a Deposit \n4 - Reset Fees \n0 - Exit");
		
			choice = keyboard.nextInt();
			
			if (choice == 1) {
				System.out.println(myAccount);
				
			} else if (choice == 2) {
				System.out.println("Enter the amount you wnat to withdrawl: ");
				double amount = keyboard.nextDouble();
				
				if (myAccount.withdraw(amount) == true) {
					System.out.println("Successful withdrawl!");
					double balance = myAccount.getBalance();
					System.out.println("New balance: " + balance);
				} else {
					System.out.println("Error. Insufficient funds. Fee added.");
				}
				
			} else if (choice == 3) {
				System.out.println("Enter the amount you want to deposit: ");
				double amount = keyboard.nextDouble();
				myAccount.deposit(amount);
				double balance = myAccount.getBalance();
				System.out.println("Deposit successful! New balance: " + balance);
				
			} else if (choice == 4) {
				myAccount.resetFees();
				if (feeReset == 1) {
					System.out.println("Fees reset with one time free fee reset.");
					feeReset = 0;
				} else {
					System.out.println("Not able to reset fees. No free fee reset available.");
				}
				
			} else if (choice == 0) {
				System.out.println("Thank you for using the Automated Teller machine. Good bye.");
				
			} else {
				System.out.println("Please enter a valid number.");
			}
			
			
		} while (choice != 0);
		
		
		
/* Output:
Welcome to the Automated Teller Machine.
Please select from the following options:
1 - Display Account Information 
2 - Make a Withdraw 
3 - Make a Deposit 
4 - Reset Fees 
0 - Exit
1
Balance: $500.0
Type of account: Checking
Account Number: 123456
Fees: $0.0
Welcome to the Automated Teller Machine.
Please select from the following options:
1 - Display Account Information 
2 - Make a Withdraw 
3 - Make a Deposit 
4 - Reset Fees 
0 - Exit
3
Enter the amount you want to deposit: 
50
Deposit successful! New balance: 550.0
Welcome to the Automated Teller Machine.
Please select from the following options:
1 - Display Account Information 
2 - Make a Withdraw 
3 - Make a Deposit 
4 - Reset Fees 
0 - Exit
2
Enter the amount you wnat to withdrawl: 
300
Successful withdrawl!
New balance: 250.0
Welcome to the Automated Teller Machine.
Please select from the following options:
1 - Display Account Information 
2 - Make a Withdraw 
3 - Make a Deposit 
4 - Reset Fees 
0 - Exit
2
Enter the amount you wnat to withdrawl: 
300
Error. Insufficient funds. Fee added.
Welcome to the Automated Teller Machine.
Please select from the following options:
1 - Display Account Information 
2 - Make a Withdraw 
3 - Make a Deposit 
4 - Reset Fees 
0 - Exit
1
Balance: $250.0
Type of account: Checking
Account Number: 123456
Fees: $25.0
Welcome to the Automated Teller Machine.
Please select from the following options:
1 - Display Account Information 
2 - Make a Withdraw 
3 - Make a Deposit 
4 - Reset Fees 
0 - Exit
4
Fees reset with one time free fee reset.
Welcome to the Automated Teller Machine.
Please select from the following options:
1 - Display Account Information 
2 - Make a Withdraw 
3 - Make a Deposit 
4 - Reset Fees 
0 - Exit
2
Enter the amount you wnat to withdrawl: 
270
Error. Insufficient funds. Fee added.
Welcome to the Automated Teller Machine.
Please select from the following options:
1 - Display Account Information 
2 - Make a Withdraw 
3 - Make a Deposit 
4 - Reset Fees 
0 - Exit
1
Balance: $250.0
Type of account: Checking
Account Number: 123456
Fees: $25.0
Welcome to the Automated Teller Machine.
Please select from the following options:
1 - Display Account Information 
2 - Make a Withdraw 
3 - Make a Deposit 
4 - Reset Fees 
0 - Exit
4
Not able to reset fees. No free fee reset available.
Welcome to the Automated Teller Machine.
Please select from the following options:
1 - Display Account Information 
2 - Make a Withdraw 
3 - Make a Deposit 
4 - Reset Fees 
0 - Exit
9
Please enter a valid number.
Welcome to the Automated Teller Machine.
Please select from the following options:
1 - Display Account Information 
2 - Make a Withdraw 
3 - Make a Deposit 
4 - Reset Fees 
0 - Exit
0
Thank you for using the Automated Teller machine. Good bye.		
 */
		
		
		
		
		
		
		
	}

}
