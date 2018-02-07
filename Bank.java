import java.util.Scanner;

public class Bank {
	// variables
	private String bankName;
	private int tempIndexNum;
	Scanner keyboard;
	
	// string to be use for bank operation. 
	String opperation = new String("c"); // set string to a value that will not stop our loop.
	
	// use only the first char of the string and store it as a char.
	char userOperation = opperation.charAt(0);
	
	// Initial constructor	
	public Bank(String bankName)
	{
		this.bankName = bankName;
		keyboard = new Scanner(System.in);
	}
	
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
	
	public void printAccountDetails(Account[] acc, int numRename)
	{
		System.out.println("\n" + bankName + "'s Banking System"); // print name dynamicly
		System.out.println("********************************");
		
		// iterate array of all accounts and display all of the users info.
		for(int i = 0; i < numRename; i++)
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
	
	public void listenForOptions(Account[] allAccounts, int userCount)
	{
		while(userOperation != 'n') {
			System.out.print(
					"d: Deposit\n"
					+ "w: Withdraw\n"
					+ "p: Print all accounts\n"
					+ "n: Quit\n"
					+ "Enter your option: "); //output user options
			
			opperation = keyboard.next().toLowerCase(); // make input to be lower case for our check
			userOperation = opperation.charAt(0);
			
			switch(userOperation)
			{
				case 'd':
					System.out.print("Enter account index: ");
					tempIndexNum = keyboard.nextInt();
					System.out.print("\nEnter deposit amount: ");
					double tempDepositAmount = keyboard.nextDouble();
					allAccounts[tempIndexNum].deposit(tempDepositAmount);
					break;
				case 'w':
					System.out.print("Enter account index: ");
					tempIndexNum = keyboard.nextInt();
					System.out.print("\n Enter deposit amount: ");
					double tempWithdrawalAmount = keyboard.nextDouble();
					allAccounts[tempIndexNum].withdraw(tempWithdrawalAmount);
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
