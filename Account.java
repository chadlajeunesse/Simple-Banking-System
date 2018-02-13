/*
 * File name: Account.java
 * Author Chad Lajeunesse, 040 621 896
 * Course: CST8132-OOP
 * Assignment: Lab 04
 * Date: February 09 2018
 * Professor: Anu Thomas, Angela Giddings
 * Purpose:
 * class List: Account, Person
 */
/**
 * Add description for Account class 
 * @author Chad Lajeunesse
 * @version 1.0.0
 */
public class Account {
	/**
	 * 
	 */
	private long accNumber;
	private Person accHolder;
	private double balance;
	
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
			return -1; // returns -1 to indicate there is not enough funds in the account
		}
		
		balance -= withdrawAmount;
		return 0;
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
	 * @return double Returns the balance of current Account holder.
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
