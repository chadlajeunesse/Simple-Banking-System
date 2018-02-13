/*
 * File name: Person.java
 * Author: Chad Lajeunesse, 040 621 896
 * Course: CST8132-OOP
 * Assignment: Lab 04
 * Date: February 09 2018
 * Professor: Anu Thomas, Angela Giddings
 * Purpose: Class that has basic contact info that a person would have.
 */
/**
 * A class that holds a persons information such as first and last name, phone number and email address.
 * @author Chad Lajeunesse
 * @version 1.0
 */
public class Person {
	// instance variables.
	/**
	 * A place holder for a persons first name.
	 */
	private String firstName;
	/**
	 * A place holder for a persons last name.
	 */
	private String lastName;
	/**
	 * A place holder for a persons phone number.
	 */
	private long phoneNum;
	/**
	 * A place holder for a persons email address.
	 */
	private String emailAddress;
	
	/**
	 * A constructor method that sets instance variables.
	 * @param firstName First name for the user.
	 * @param lastName Last name for the user.
	 * @param phoneNum Phone number for the user.
	 * @param emailAddress Email address for the user.
	 */
	public Person(String firstName, String lastName, long phoneNum, String emailAddress)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNum = phoneNum;
		this.emailAddress = emailAddress;
	}
	
	/**
	 * Getter method for getting the full name (first and last) of the person.
	 * @return String Returns a String of a persons first name and last name.
	 */
	public String getName()
	{
		return (firstName + " " +  lastName);
	}
	
	/**
	 * Getter method for getting the persons phone number.
	 * @return long Returns the persons phone number.
	 */
	public long getPhoneNumber()
	{
		return phoneNum;
	}
	
	/**
	 * Getter method for getting the persons email address.
	 * @return String Returns the persons email address.
	 */
	public String getEmailAddress()
	{
		return emailAddress;
	}
}
