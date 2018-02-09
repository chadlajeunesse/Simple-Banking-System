/**
 * 
 * File name: Account.java
 * @author Chad Lajeunesse, 040 621 896
 * Course: CST8132-OOP
 * Assignment: Lab 04
 * Date: February 09 2018
 * Professor: Anu Thomas & Angela Giddings
 * Purpose:
 * class List: Account, Person
 */
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
	/**
	 * Getter method that returns the balance of the current account holder.
	 * @return double returns the balance of current Account holder
	 */
	public double getBalance()
	{
		return balance;
	}
	/**
	 * Getter method that gets the name of the users whos Account we are looking at.
	 * @return String from the Person class.
	 */
	public String getName()
	{
		return accHolder.getName();
	}
	/**
	 * Getter method for the user whos Account we are looking at
	 * @return String from the Person class.
	 */
	public String getEmailAddress()
	{
		return accHolder.getEmailAddress();
	}
}
