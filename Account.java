/*
 * File name: Account.java
 * Author Chad Lajeunesse, 040 621 896
 * Course: CST8132-OOP
 * Assignment: Lab 04
 * Date: February 09 2018
 * Professor: Anu Thomas, Angela Giddings
 * Purpose: This class allows basic functionality to adjust a users account balance by deposting and withdrawing funds.
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
	 * Method that withdraws money from the account holder. A simple check is performed to see if the funds being
	 * withdrawn are less or equal to the current balance.
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
}
