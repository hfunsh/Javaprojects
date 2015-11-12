//accounts class

import java.util.*;
public class Accounts {
	
	//Data variables
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated;
	
	
	
	//default no arg constructor
	public Accounts(){
		id = 0;
		balance = 0;
	}
	
	//construct an account with an id and balance
	public Accounts(int id, double balance){
		this.id = id;
		this.balance = balance;
	}
	
	//get the account id (accessor)
	int getId(){
		return id;
	}
		
	//get the account balance (accessor)
	double getBalance(int id){
		return balance;
	}
	
	//get the annual interest rate 
	double getAnnualInterestRate(){
		return annualInterestRate;
	}
		
	//get the date account was created
	Date getDateCreated(int id){
		return dateCreated;
	}
			
	//get the Monthly Interest rate
	double getMonthlyInterestRate(int id){
		return annualInterestRate/12;
	}
	
	//get Monthly Interest
	double getMonthlyInterest(int id){
		return getMonthlyInterestRate(id) * balance;
	}
	
	//set the account id
	void setId(int newId){
		this.id = newId;
	}
	
	//set the account balance
	void setBalance(int id, double newBalance){
		this.balance = newBalance;
	}
		
	//set the annual interest rate
	void setAnnualInterestRate(int id, double newAnnualInterestRate){
		this.annualInterestRate = newAnnualInterestRate;
	}
		
	//withdraw from the account
	void withdraw(int id, double amount){
		
	}
	
	//deposit to the account
	void deposit(int id, double newDeposit){
		
	}
		
	//toString method
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	

}
