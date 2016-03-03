//credit account which will be linked to checking account
//extends the Account Class 

public class CreditAccount extends Account{
	
	private static double annualServiceRate = 0;
	
	
	//2 arg constructor which calls the 2 arg constructor from the Accounts
	public CreditAccount(String name, double balance){
		super (name, balance * -1);
		//balance = balance * -1;
		
	}
	
	public static void setAnnualServiceCharge(double rate){
		annualServiceRate = rate;
		
	}
	
	//Overide the withdraw method and allow a negative balance
	public boolean withdraw(double amount){
		
		double bal = getBalance() - amount;  
		setBalance(bal);
				
		return true;
	}
	
	//Add a monthly event which will charge the monthly service charge to the account. 
	//You can call the withdraw method to modify the balance.  
	
	public void monthlyEvent(){
		
		double monthlyService = (annualServiceRate/12);
		double charges = monthlyService * -getBalance();
		
		withdraw(charges);
				
	}
	
	public String getStringType(){
		return "Credit";
	}
	
	public int getNumType(){
		return CREDIT_TYPE;
			}
	
	
	
	
}
	