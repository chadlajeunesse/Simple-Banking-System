/*
 * Created by Chad Lajeunesse
 */
public class Person {
	// instance variables.
	private String firstName;
	private String lastName;
	private long phoneNum;
	private String emailAddress;
	
	// Initial constructor for all instance variable 'firstName, lastName, phoneNum, emailAddress'
	public Person(String firstName, String lastName, long phoneNum, String emailAddress)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNum = phoneNum;
		this.emailAddress = emailAddress;
	}
	
	// Full name getter.
	public String getName()
	{
		return (firstName + " " +  lastName);
	}
	
	// phone number getter
	public long getPhoneNumber()
	{
		return phoneNum;
	}
	
	// email getter
	public String getEmailAddress()
	{
		return emailAddress;
	}
}
