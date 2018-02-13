/*
 * File name: Bank.java
 * @author Chad Lajeunesse, 040 621 896
 * Course: CST8132-OOP
 * Assignment: Lab 04
 * Date: February 09 2018
 * Professor: Anu Thomas, Angela Giddings
 * Purpose: 
 * Class List: Bank, Scanner, Person, Account.
 */
/**
 * Add description for Bank class
 * @author Chad Lajeunesse
 * @version 1.0
 */
import java.util.Scanner;

public class Bank {
	// instance variables
	private String bankName;
	Scanner keyboard;
	
	public Bank() {
		
		// prompt user here
		// get name
		
		
	}
	
	/**
	 * Initial constructor. Instantiates the Scanner class and sets the bankName instance variable.
	 * @param bankName sets the instance variable.
	 */
	public Bank(String bankName)
	{
		this.bankName = bankName;
		keyboard = new Scanner(System.in);
	}
	
	/**
	 * Method that creates Account objects for each user.
	 * Asks detail info about the user.
	 * Instantiates the Person object and uses this to Instantiate the Account object which is added in the Account array.
	 * @param accounts passes the array of Accounts.
	 * @param numAccHolder passes the size of users to be created. Size of array of Accounts.
	 */
	public void generateAccountDetails(Account[] accounts, int numAccHolder)
	{	
		for(int i = 0; i < numAccHolder; i++)
		{
			// General msg indicating which user information needs to be input
			System.out.println("Enter details of account holder " + (i + 1)); // add i + 1 because our index starts at 0.
			System.out.println("====================================");
			
			
			/*
			 * Using the Scanner methods for each of the different type needed.
			 * Storing the return input in temporary variables.
			 * 		Account Number - int
			 * 		First name - String
			 * 		Last name - String
			 * 		Phone number - long
			 * 		Email - String
			 * 		Opening balance - double
			 */
			// Account number
			System.out.print("Enter account number: ");
			int accNum = keyboard.nextInt();
			
			// Account first name
			System.out.print("Enter first name of account holder: ");
			String firstName = keyboard.next();
			
			// Account last name
			System.out.print("Enter last name of account holder: ");
			String lastName = keyboard.next();
			
			// Account phone #
			System.out.print("Enter phone number: ");
			long phoneNum = keyboard.nextLong();
			
			// Account email address
			System.out.print("Enter email address: ");
			String emailAddress = keyboard.next();
			
			// Account opening balance
			System.out.print("Enter opening balance: ");
			double openingBalance = keyboard.nextDouble();
			
			// Initialize Person object
			Person personObj = new Person(firstName, lastName, phoneNum, emailAddress); // use temp var to pass the info to create the object with initial constructor.
			
			// Initialize Account object
			accounts[i] = new Account(accNum, personObj, openingBalance);
		}
	}
	
	/**
	 * Method that prints all the users along with their details.
	 * @param acc array of Account
	 * @param userCount size of array along with the amount of users.
	 */
	public void printAccountDetails(Account[] acc, int userCount)
	{
		System.out.println("\n" + bankName + "'s Banking System"); // print name dynamicly
		System.out.println("********************************");
		
		// iterate array of all accounts and display all of the users info.
		for(int i = 0; i < userCount; i++)
		{
			System.out.print(
				"AccountNumber: " + acc[i].getAccNumber() +
				" Name: " + acc[i].getAccHolder().getName() +
				" Phone Number: " + acc[i].getAccHolder().getPhoneNumber() +
				" Email: " + acc[i].getAccHolder().getEmailAddress() + 
				" Balance: " + acc[i].getBalance()
			);
			System.out.println(); // used to print next users info on a new line.
		}
	}
	
	/**
	 * Method the listens for user input for the duration of the program
	 * depending what input is passed different methods used.
	 * @param allAccounts array of Account. Account objects are stored in here.
	 * @param userCount amount of users in Account array.
	 */
	public void listenForOptions(Account[] allAccounts, int userCount)
	{
		//public variable.
		int tempIndexNum;
		
		// string to be use for bank operation. 
		String opperation = new String("c"); // set string to a value that will not stop our loop.
		
		// use only the first char of the string and store it as a char.
		char userOperation = opperation.charAt(0);

		while(userOperation != 'n') {
			System.out.print(
					"d: Deposit\n"
					+ "w: Withdraw\n"
					+ "p: Print all accounts\n"
					+ "n: Quit\n"
					+ "Enter your option: "); //output user options
			
			opperation = keyboard.next().toLowerCase(); // make input to be lower case for our check
			userOperation = opperation.charAt(0); // use the first char incase user added more then one char.
			//TODO take away initial space use regex.
			
			switch(userOperation)
			{
				case 'd':
					System.out.print("Enter account index: ");
					tempIndexNum = keyboard.nextInt();
					
					while(userCount-1 < tempIndexNum || tempIndexNum < 0){
						System.out.print("Please enter an index lower then " + userCount + ": ");
						tempIndexNum = keyboard.nextInt();
					}
					
					System.out.print("\nEnter deposit amount: ");
					double tempDepositAmount = keyboard.nextDouble();
					allAccounts[tempIndexNum].deposit(tempDepositAmount);
					
					break;
				case 'w':
					System.out.println("Enter account index: ");
					tempIndexNum = keyboard.nextInt();
					
					while(userCount - 1 < tempIndexNum || tempIndexNum < 0) {
						System.out.print("Plese enter an index lower then " + userCount + ": ");
						tempIndexNum = keyboard.nextInt();
					}
					
					System.out.print("\n Enter withdrawl amount: ");
					double tempWithdrawalAmount = keyboard.nextDouble();
					
					int isInsuficientFunds = allAccounts[tempIndexNum].withdraw(tempWithdrawalAmount);

					if(isInsuficientFunds == -1) {
						System.out.println("Insufficient balance");
					}
					break;
				case 'p':
					printAccountDetails(allAccounts, userCount);
					break;
				case 'n':
					System.out.println("Good Bye");
					break;
				default :
					// if we end up in default we have a problem
					break;
			}
		}
	}
}
