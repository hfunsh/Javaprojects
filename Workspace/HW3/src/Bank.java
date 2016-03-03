import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Bank
{
	Account [] myAccounts;
	int nextNewCustomer;

	public Bank (int numberCustomers)
	{
		myAccounts = new Account[numberCustomers];
		nextNewCustomer = 0;
	}
	public void addAccount(Account acc)
	{
		if (nextNewCustomer < myAccounts.length)
			myAccounts[nextNewCustomer++] = acc;
	}
	public void processMonthlyEvent()
	{
		for (int k=0; k<nextNewCustomer; k++)
			myAccounts[k].monthlyEvent();
	}
	
	public Account findAccount (String name)
	{
		for (int k=0; k<nextNewCustomer; k++)
		{
			if (myAccounts[k].getName().equals(name))
				return myAccounts[k];
		}
		return null; 
	}
	/*
	 *  todo:
	 *     add:
	 *        public Account findAccount (String name, int type)
	 *        public Account findAccount(int id)
	 */
	
	public Account findAccount(String name, int type){
		
		for (int k=0; k<nextNewCustomer; k++)
		{
			if (myAccounts[k].getName().equals(name) && myAccounts[k].getNumType() == type)
				return myAccounts[k];
		}
		return null; 
		
	}
	
public Account findAccount(int id){
		
		for (int k=0; k<nextNewCustomer; k++)
		{
			if (myAccounts[k].getId()== id)
				return myAccounts[k];
		}
		return null; 
		
	}
	
	
	
	
	public String toString()
	{
		String str = String.format("%-30s  %8s %8s %10s\n", "Name", "ID", "Balance", "Type");
		for (int k=0; k<nextNewCustomer; k++)
		{
			String name = myAccounts[k].getName();
			int id = myAccounts[k].getId();
			double balance = myAccounts[k].getBalance();
			String sType = myAccounts[k].getStringType();
			String entry = String.format("%-30s  %8d %8.2f %10s", name, id, balance, sType);
			str += entry + "\n";
		}
		return str;
	}

}