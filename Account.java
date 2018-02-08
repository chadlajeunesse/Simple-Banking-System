/*
 * Lab 3
 * Created by Chad Lajeunesse
 * Jan 29th 2018
* */
 
public class Account {
	// Instance variables
	private long accNumber;
	private Person accHolder;
	private double balance;
	
	// Default constructor
	public Account()
	{
		//TODO Question:
		// if DC is not being used is it better to create an empty DC
		// or let it be created on its own?
	}
	
	// initial constructor
	public Account(long accNumber, Person accHolder, double balance )
	{
		// initialize instance vars.
		this.accNumber = accNumber;
		this.accHolder = accHolder;
		this.balance = balance;
	}
	
	public void deposit(double depositAmount)
	{
		// increase balance by amount given from user.
		balance += depositAmount;
	}
	
	//TODO Question: is the int return type wrong from our UML?
	public int withdraw(double withdrawAmount)
	{
		if(withdrawAmount > balance) // check if amount given is more then what user has as balance
		{
			System.out.println("Insufficient balance");
			return (int) balance; // returns the balance as int 
		}
		balance -= withdrawAmount;
		return (int) balance;
	}
	
	/*
	 * Getters and setter
	 */
	public long getAccNumber()
	{
		return accNumber;
	}
	
	public Person getAccHolder()
	{
		return accHolder;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public String getName()
	{
		return accHolder.getName();
	}
	
	public String getEmailAddress()
	{
		return accHolder.getEmailAddress();
	}
	/*
	 * Getters and Setters END
	 */
}
