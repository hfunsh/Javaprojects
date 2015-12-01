import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;



public class Bank
{
	private String name;
	private Account [] myAccounts;
	private int nextNewCustomer;

	//todo: add a 2 argument constructor for Bank:  
	//      look at the variables: what do you need to initialize Bank?


	/*
	 * addAcount: add a reference of an Account to the array myAccounts
	 *            if the array is full, return false, otherwise return true
	 */
	public boolean addAccount(Account acc)
	{
		//todo:

		return false;
	}


	/*
	 * processMonthlyEvent: traverse the myAccounts array and get the monthly 
	 *                      interest for the account.  Then deposit it.  
	 */
	public void processMonthlyEvent()
	{
		double interest;
		for (int k=0; k<nextNewCustomer; k++)
		{
			//todo: 
		}
	}

	/*
	 * findAccount: return the reference of an Account that has the specified
	 *              id.  Return null if not found
	 */
	public Account findAccount (int  id)
	{
		//todo:

		return null; 
	}

	/*
	 * toString(): traverse the myAccounts array and call the Account's toString() 
	 */
	public String toString()
	{
		String str = "Bank: " + name + "\n";
		for (int k=0; k<nextNewCustomer; k++)
		{
			String entry = myAccounts[k].toString();
			str += "    " + entry + "\n";
		}
		return str;
	}

}