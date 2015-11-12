//accounts class

import java.util.*;
public class Account {
	
	//Data variables
	private int id = 0;
	private double balance = 0;
	private static double annualInterestRate = 0;
	private Date dateCreated = new Date();
	
	
	
	//default no arg constructor
	public Account(){
		id = 0;
		balance = 0;
		annualInterestRate = 0;
		dateCreated.getTime();
	}
	
	//construct an account with an id and balance
	public Account(int id, double balance){
		this.id = id;
		this.balance = balance;
		annualInterestRate = 0;
		dateCreated.getTime();
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
		return (annualInterestRate/12)/100;
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
	void setBalance(double newBalance){
		this.balance = newBalance;
	}
		
	//set the annual interest rate
	void setAnnualInterestRate(double newAnnualInterestRate){
		this.annualInterestRate = newAnnualInterestRate;
	}
		
	//withdraw from the account
	double withdraw(double amount){
		return balance = balance - amount;
	}
	
	//deposit to the account
	double deposit(double newDeposit){
		return balance = balance + newDeposit;
	}
		
	//toString method
	public String toString(){
		return "Balance is " + getBalance() + "\n"+
	            "Monthly Interest Rate is: " + getMonthlyInterestRate() + "\n"+
				 "Date created is: " + getDateCreated();
	}
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	

}
