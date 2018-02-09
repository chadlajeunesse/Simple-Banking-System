/**
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
	/**
	 * 
	 */
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
	
	/**
	 * Initial constructor that sets the instance variables.
	 * @param accNumber sets the instance variable of accNumber
	 * @param accHolder Person object that is set to the instance variable
	 * @param balance initial balance the is set.
	 */
	public Account(long accNumber, Person accHolder, double balance )
	{
		this.accNumber = accNumber;
		this.accHolder = accHolder;
		this.balance = balance;
	}
	
	/**
	 * Setter method that increases the balance of the current Account holder.
	 * @param depositAmount which is a double that is used to increase the balance.
	 */
	public void deposit(double depositAmount)
	{
		balance += depositAmount;
	}
	
	//TODO Question: is the int return type wrong from our UML?
	/**
	 * Method that withdraws money from the current Account.
	 * A check is done to ensure that there is enough funds in the account before withdrawing the funds.
	 * @param withdrawAmount which is of type double
	 * @return int of the balance of the current Account after the money has been withdrawn.
	 */
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
	/**
	 * Getter method for the current Account holder. 
	 * @return long for the current Account holders account number.
	 */
	public long getAccNumber()
	{
		return accNumber;
	}
	/**
	 * Getter method that returns the Person object.
	 * @return Person object of the current Account holder.
	 */
	public Person getAccHolder()
	{
		return accHolder;
	}
	/**
	 * Getter method that returns the balance of the current account holder.
	 * @return double returns the balance of current Account holder.
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
	 * Getter method for the user whos Account we are looking at.
	 * @return String from the Person class.
	 */
	public String getEmailAddress()
	{
		return accHolder.getEmailAddress();
	}
}
