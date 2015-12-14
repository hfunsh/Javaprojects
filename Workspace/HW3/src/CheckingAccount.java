//extends the account class

public class CheckingAccount extends Account{
	
	private static final double OVERDRAFT_CHARGE = 20;
	private CreditAccount refCredit;
	
	//constructor which will call the arg from the super class
	public CheckingAccount(String name, double balance){
		super (name, balance);
	}
	
	//mutator which will set the Credit Account Ref
	
	public void setCreditAccount(CreditAccount acct){
		this.refCredit = acct;
	}
	
	//override the withdraw method
	
	public boolean withdraw(double amount){
				
		if (amount > getBalance()){
			if (refCredit != null ){
				
				//find the difference between amount requested and balance
				double amtDiff = amount - getBalance();
				
				//withdraw the balance from the checking account
				double currBal = getBalance();
				double withBalance = getBalance() - currBal;
				
		     	setBalance(withBalance);
		     	
		     	//withdraw the difference from the credit account
		     	refCredit.withdraw(amtDiff);
		     	
		     	return true;
			}
			else{
				double odCharge = getBalance() - OVERDRAFT_CHARGE;
				setBalance(odCharge);
				return false;
				}
		}else super.withdraw(amount);
		return true;
	}
	
	public void monthlyEvent(){
		
	}
	
	
	public String getStringType(){
		return "Checking";
	}
	
	public int getNumType(){
		return CHECKING_TYPE;
			}
	

}
