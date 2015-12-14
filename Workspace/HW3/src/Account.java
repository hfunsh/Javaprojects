//accounts class
//12-01-15 - Updating the class to add new data fields

import java.util.*;
public class Account {
	
	//constants
	public static final int SAVINGS_TYPE = 1;
	public static final int CHECKING_TYPE = 2;
	public static final int CREDIT_TYPE = 3;
	
	//Data variables
	private int id = 0;
	private double balance = 0;
	private static double annualInterestRate = 0;
	private Date dateCreated = new Date();
	private String name = " ";   
	private static int nextId = 100;
	
		
	//default no arg constructor
	public Account(){
		id = 0;
		balance = 0;
		//annualInterestRate = 0;
		dateCreated.getTime();
	}
	
	//construct an account with an id and balance
	public Account(int id, double balance){
		this.id = id;
		this.balance = balance;
		//annualInterestRate = 0;
		dateCreated.getTime();
	}
	
	//new constructor 
	public Account (String name, double balance){
		this.name = name;
		this.balance = balance;
		this.id = nextId++;
		dateCreated.getTime();	
	}
	
	//name accessor 
	
	String getName(){
		return name;
	}
	
	//get the account id (accessor)
	int getId(){
		return id;
	}
		
	//get the account balance (accessor)
	double getBalance(){
		return balance;
	}
	
	//get the annual interest rate 
	double getAnnualInterestRate(){
		return annualInterestRate;
	}
		
	//get the date account was created
	Date getDateCreated(){
		return dateCreated;
	}
			
	//get the Monthly Interest rate
	double getMonthlyInterestRate(){
		return (annualInterestRate/12);
	}
	
	//get Monthly Interest
	double getMonthlyInterest(){
		return getMonthlyInterestRate()* balance;
	}
	
	//set the account id
	void setId(int newId){
		this.id = newId;
	}
	
	//set the account balance
	protected void setBalance(double amount){
		balance = amount;
	}
		
	//set the annual interest rate
	public static void setAnnualInterestRate(double newAnnualInterestRate){
		annualInterestRate = newAnnualInterestRate;
	}
		
	//withdraw from the account
	public boolean withdraw(double amount){
		if (amount > balance)
			return false;
		balance -= amount;
		
		return true;
	}
	
			
	//deposit to the account
	public boolean deposit(double amount){
		if (amount < 0)
			return false;
		this.balance = balance + amount;
		return true;
	}
	
	public boolean transferTo(Account acct, double amount){
				
	if (withdraw(amount)){
		acct.deposit(amount);
		return true;}
	
	return false;		
	}
	
	//process the monthly event
	public void monthlyEvent(){
	 this.balance = getMonthlyInterest() + balance;	
	}
		
	public String getStringType(){
		return " Savings ";
	}
		
	public int getNumType(){
		return  SAVINGS_TYPE;
	}
	
	//toString method
	public String toString(){
		return "id: " + getId() + ", balance: $" + getBalance() + ", created: " + getDateCreated();
	}
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	

}
