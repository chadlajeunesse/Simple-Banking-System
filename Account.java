/*
 * File name: Account.java
 * Author Chad Lajeunesse, 040 621 896
 * Course: CST8132-OOP
 * Assignment: Lab 04
 * Date: February 09 2018
 * Professor: Anu Thomas, Angela Giddings
 * Purpose: This class allows basic functionality to adjust a users account balance by depositing and withdrawing funds.
 * class List: Account, Person
 */
/**
 * This class holds the banking information of a user along with manipulate the users balance. 
 * @author Chad Lajeunesse
 * @version 1.0.0
 */
public class Account {
	/**
	 * Place holder for the account number.
	 */
	private long accNumber;
	/**
	 * Place holder for the account holder.
	 */
	private Person accHolder;
	/**
	 * Place holder for the account balance.
	 */
	private double balance;
	
	/**
	 * Initial constructor that sets the instance variables.
	 * @param accNumber Used to set the current account number.
	 * @param accHolder Sets the Person object that is set to the instance variable.
	 * @param balance Used to set the initial balance.
	 */
	public Account(long accNumber, Person accHolder, double balance )
	{
		this.accNumber = accNumber;
		this.accHolder = accHolder;
		this.balance = balance;
	}
	/**
	 * Getter method for the account holders account number.
	 * @return long Returns the account holders account number.
	 */
	public long getAccNumber()
	{
		return accNumber;
	}
	/**
	 * Getter method that returns the Person object.
	 * @return Person Returns an object of the Person class.
	 */
	public Person getAccHolder()
	{
		return accHolder;
	}
	/**
	 * Getter method that returns the account holders balance.
	 * @return double Returns the balance of the current Account holder.
	 */
	public double getBalance()
	{
		return balance;
	}
	/**
	 * Getter method that gets the account holders first and last name.
	 * @return String Returns the account holders full name.
	 */
	public String getName()
	{
		return accHolder.getName();
	}
	/**
	 * Getter method for the account holder. A getter method from the Person class is called to get t
	 * @return String Returns the account holders email address.
	 */
	public String getEmailAddress()
	{
		return accHolder.getEmailAddress();
	}
	
	/**
	 * Method that increases the balance of the current Account holder.
	 * @param depositAmount This amount is used to increase the current balance.
	 */
	public void deposit(double depositAmount)
	{
		balance += depositAmount;
	}
	
	/**
	 * Method that subtracts an amount that is passed from a user from the current balance. If the amount that is passed from the user is
	 * greater then the current balance no subtraction is perform.
	 * @param withdrawAmount The amount the user is trying to withdraw. 
	 * @return int If the withdraw amount is less then the current balance 0 is returned. If the withdraw amount is more then the current balance -1 is return.
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
}
