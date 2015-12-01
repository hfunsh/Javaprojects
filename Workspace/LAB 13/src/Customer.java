
import java.util.Date;
import java.util.Scanner;


public class Customer
{
	String fullName;
	static int nextId = 100;
	int id;
	String password;
	boolean loggedIn = false;
	Date dateCreated;

	public Customer (String fullName)
	{
		this.fullName = fullName;
		id = nextId++;
		password = null;
		dateCreated = new Date();
	}

	public String getFullName()
	{
		return fullName;
	}
	public Date getDateCreated()
	{
		return dateCreated;
	}
	public int getId()
	{
		return id;
	}

	/*
	 * setPassword: 
	 *       - first validate the specified String to see if it's 
	 *         a valid password.  call validatePassword()
	 *       - if valid, copy the specified string to the instance variable, password
	 *       - if invalid, do not copy the specified string.
	 *   
	 *       - returns a boolean, true if successful, 
	 *                            false if pword was not valid.
	 */
	public boolean setPassword( String pword )
	{
		//call the validatePassword method
		if (validatePassword( pword ))
		{ 
			password = pword;    

			return true;
		}
		else 
			return false;

	}

	/*
	 * validatePassword: validate a specified password
	 *   length is at least 8 characters
	 *   at least 1 number 
	 *   at least 1 upper and 1 lower case letter 
	 *   cannot contain the first name
	 *   
	 *   method returns true if the password is valid.
	 */
	private boolean validatePassword ( String pword )
	{
		//declare the variables
		int upperLetterCnt = 0;
		int lowerLetterCnt = 0;
		int numberCount = 0;
		String firstNameLower = getFirstName().toLowerCase();	
		String pwordLower = pword.toLowerCase();

		//use Index of method to verify firstname is not part of the pword string
		int nameCompare = pwordLower.indexOf(firstNameLower);
		

		//verify the length of pwd >=8 
		if (pword.length() < 8 ){
			return false;}
		
		//else if(nameCompare < 0){
		//return false;}

		else {
			for (int i = 0; i < pword.length(); i++){
				if (pword.charAt(i) >= '0' &&  pword.charAt(i) <= '9')
					numberCount++;
				if (pword.charAt(i) >= 'A' && pword.charAt(i) <= 'Z' )
					upperLetterCnt++;
				if (pword.charAt(i) >= 'a' && pword.charAt(i) <= 'z' )
					lowerLetterCnt++;

			}

			if (numberCount > 0 && upperLetterCnt > 0 && lowerLetterCnt > 0)

			return true;}

		return false;

	}

	/*
	 * parse the fullName to get the first name by finding the first space.
	 * Use indexOf to get the index of the first occurance of a space (" ") 
	 * and the substring method to extract the first name.
	 */
	public String getFirstName ()
	{      
		int firstIndex = fullName.indexOf(" ");
		String firstName = fullName.substring(0, firstIndex);
		return firstName;
	}

	/*
	 * Compare the specified pword with the object's password. 
	 * If equal, set the loggedIn field to true and return true.
	 * Else return false. 
	 */
	public boolean login( String pword)
	{
		//compare the string pword to the password instance variable
		if (pword.equals(password)){
			loggedIn = true;
			return true;
		}


		return false;
	}
	public static String getHeader()
	{
		String str = String.format("%25s  %3s  %8s  %9s %s", "Name", "ID", "password", "logged in", "Date Created");
		return str;
	}
	public String toString()
	{
		String str = String.format("%25s  %3d  %8s  %9s %s", fullName, id, 
				(password == null ? "not set" : "set"), 
				(loggedIn  ? "yes" : "no"),
				dateCreated);
		return str;
	}
}