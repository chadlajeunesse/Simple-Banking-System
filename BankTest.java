/*
 * File name: Bank.java
 * @author Chad Lajeunesse, 040 621 896
 * Course: CST8132-OOP
 * Assignment: Lab 04
 * Date: February 09 2018
 * Professor: Anu Thomas, Angela Giddings
 * Purpose: 
 * Class List: Bank, Scanner, Account.
 */
import java.util.Scanner;
/**
 * Driver class that is used to initiate the program.
 * @author Chad Lajeunesse
 * @version 1.0
 */
public class BankTest {
	/**
	 * Initial method that starts our program by calling respective classes.
	 * @param args List of parameters that can be passed in the program. Not being used.
	 */
	public static void main(String[] args) {
			
		/**
		 * Place holder that holds number of users.
		 */
		int userCount; // var used as a place holder for the amount of users that are in the bank system
		/**
		 * Place holder for the bank name.
		 */
		String bankName; 
		/**
		 * Place holder to hold the Scanner object.
		 */
		Scanner keyboard = new Scanner(System.in); //Scanner object to gather users input
		
		// Ask user for the name of the bank. Stored in the bankName var.
		System.out.println("What is your name: ");
		bankName = keyboard.next();
		
		// Ask user how many users are in the banking system.
		// Amount stored in the userCount variable which is used as the size of the Account array.
		do {
			System.out.println("How many account holders are there in your banking system: ");
			userCount = keyboard.nextInt(); //use the Scanner method to get size from user. Store the return value in userCount.
		}while(userCount <= 0);
		// instantiate bank object.
		
		Bank myBankingSystem = new Bank(bankName);
		
		// Create array of type Account and allocate proper array size.
		Account[] allAccounts = new Account[userCount];
		
		// method to create all of the users in the system by using the Bank object.
		myBankingSystem.generateAccountDetails(allAccounts, userCount);
		
		// Bank object method to print * info of every user in the bank system 
		myBankingSystem.printAccountDetails(allAccounts, userCount);

		// method that waits for user instructions to make deposit/ withdrawals/ print all user info or quit the program.
		myBankingSystem.listenForOptions(allAccounts, userCount);
	}
}
