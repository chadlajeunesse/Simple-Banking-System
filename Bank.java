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
			
			// Account number input
			System.out.print("Enter account number: ");
			int accNum = keyboard.nextInt(); // Scanner method ask user and stores input in temp var for user acc number
			
			// Account first name input
			System.out.print("Enter first name of account holder: ");
			String firstName = keyboard.next(); // temp var for users first name
			
			// Account last name input
			System.out.print("Enter last name of account holder: ");
			String lastName = keyboard.next(); // temp var for users last name
			
			// Account phone #
			System.out.print("Enter phone number: ");
			long phoneNum = keyboard.nextLong(); // temp var for users phone number
			
			// Account email address
			System.out.print("Enter email address: ");
			String emailAddress = keyboard.next(); // temp var for users email address
			
			// Account opening balance
			System.out.print("Enter opening balance: ");
			double openingBalance = keyboard.nextDouble(); // temp var for opening balance
			
			
			// Initialize Person object
			Person personObj = new Person(firstName, lastName, phoneNum, emailAddress);
			
			// Initialize Account object
			accounts[i] = new Account(accNum, personObj, openingBalance);
		}
	}
	
	public void printAccountDetails(Account[] acc, int numRename)
	{
		System.out.println("\n" + bankName + "'s Banking System");
		System.out.println("********************************");
		for(int i = 0; i < numRename; i++)
		{
			System.out.print(
				"AccountNumber: " + acc[i].getAccNumber() +
				" Name: " + acc[i].getAccHolder().getName() +
				" Phone Number: " + acc[i].getAccHolder().getPhoneNumber() +
				" Email: " + acc[i].getAccHolder().getEmailAddress() + 
				" Balance: " + acc[i].getBalance()
			);
			System.out.println();
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
					+ "Enter your option: ");
			
			opperation = keyboard.next().toLowerCase();
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
					//TODO implement what happens in default
					break;
			}
		}
	}
}
