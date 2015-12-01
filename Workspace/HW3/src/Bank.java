//Bank Class


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;



public class Bank
{
    private String name;
	private Account [] myAccount;
	private static int nextNewCustomer = 0;

   //2 argument constructor for Bank:  
   	public Bank(String name, int arraySize){
		this.name = name;
		myAccount = new Account [arraySize];
		}
   
   /*
    * addAcount: add a reference of an Account to the array myAccounts
    *            if the array is full, return false, otherwise return true
    */
   	//add a reference of an Account to the array myAccounts
	public boolean addAccount(Account acc)
	{
		//check to see if array is full
		if(nextNewCustomer > myAccount.length)
       return false;
		
		myAccount[nextNewCustomer++]= acc;
		return true;
	}
   
   
   /*
    * processMonthlyEvent: traverse the myAccounts array and get the monthly 
    *                      interest for the account.  Then deposit it.  
    */
	public void processMonthlyEvent()
	{
      double interest;
		for (int k=0; k<nextNewCustomer; k++)
			//find the interest rate for each account in the array using the getMonthlyInterestrate method
			//call the deposit method to add the interest to the account
			//for each element in the array: interest = element.getBalance * monthly interest date 
			//element.deposit(interest)
      {interest = myAccount[k].getMonthlyInterest();
      myAccount[k].deposit(interest);}
			
      
	}
	
   /*
    * findAccount: return the reference of an Account that has the specified
    *              id.  Return null if not found
    */
	public Account findAccount (int  id)
	{
		
		for(int i = 0; i < nextNewCustomer; i++){
			if (id == myAccount[i].getId())
				return myAccount[i];
			}
				      
      return null; 
	}
	
	public static int getNextNewCustomer(){
		return nextNewCustomer;
	}
	
	/*
    * toString(): traverse the myAccounts array and call the Account's toString() 
    */
	public String toString()
	{
		String str = "Bank: " + name + "\n";
		for (int k=0; k<nextNewCustomer; k++)
		{
        	String entry = myAccount[k].toString();
	     	str += "" + entry + "\n";
		}
		return str;
	}

}