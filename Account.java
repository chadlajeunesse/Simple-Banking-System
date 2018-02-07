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
		//TODO ASK Angela
		// if DC is not being used is it better to create an empty DC
		// or let it be created on its own?
	}
	
	// initial constructor
	public Account(long accNumber, Person accHolder, double balance )
	{
		this.accNumber = accNumber;
		this.accHolder = accHolder;
		this.balance = balance;
	}
	
	public void deposit(double depositAmount)
	{
		balance += depositAmount;
	}
	
	public int withdraw(double withdrawAmount)
	{
		if(withdrawAmount > balance)
		{
			System.out.println("Insufficient balance");
			return (int) balance;
		}
		balance -= withdrawAmount;
		return (int) balance;
	}
	
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
}
