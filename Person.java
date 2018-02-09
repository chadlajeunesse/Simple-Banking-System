/**
 * File name: Person.java
 * @author: Chad Lajeunesse, 040 621 896
 * Course: CST8132-OOP
 * Assignment: Lab 04
 * Date: February 09 2018
 * Professor: Anu Thomas & Angela Giddings
 * Purpose: Class that has basic contact info for person.
 */

public class Person {
	// instance variables.
	private String firstName;
	private String lastName;
	private long phoneNum;
	private String emailAddress;
	
	/**
	 * Constructor method that sets instance variables.
	 * @param firstName first name for the user
	 * @param lastName last name for the user
	 * @param phoneNum phone number for the user
	 * @param emailAddress email address for the user
	 */
	public Person(String firstName, String lastName, long phoneNum, String emailAddress)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNum = phoneNum;
		this.emailAddress = emailAddress;
	}
	
	/**
	 * Getter method for getting the users full name (first and last)
	 * @return String returns a String of concatinated firstName and lastName
	 */
	public String getName()
	{
		return (firstName + " " +  lastName);
	}
	
	/**
	 * Getter method for getting the users phone number
	 * @return long returns the phone number
	 */
	public long getPhoneNumber()
	{
		return phoneNum;
	}
	
	/**
	 * Getter method for getting the users email address
	 * @return String returns the users email address
	 */
	public String getEmailAddress()
	{
		return emailAddress;
	}
}
