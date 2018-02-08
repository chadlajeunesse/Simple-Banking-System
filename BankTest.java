/*
 * Lab 3
 * Created by Chad Lajeunesse
 * Jan 29th 2018
* */
import java.util.Scanner;

public class BankTest {

	public static void main(String[] args) {
			
		// variables
		int userCount; // var used as a place holder for the amount of users that are in the bank system
		String bankName; 
		
		Scanner keyboard = new Scanner(System.in); //Scanner object to gather users input
		
		// Ask user for the name of the bank. Stored in the bankName var.
		System.out.println("What is your name: ");
		bankName = keyboard.next();
		
		// Ask user how many users are in the banking system.
		// Amount stored in the userCount variable which is used as the size of the Account array.
		System.out.println("How many account holders are there in your banking system: ");
		userCount = keyboard.nextInt(); //use the Scanner method to get size from user. Store the return value in userCount.
		
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
