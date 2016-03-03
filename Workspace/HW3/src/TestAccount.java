//Test the Account class 
public class TestAccount {

	public static void main(String[] args) {
		
		//Create a new Account and test the accessor and mutator methods
		Account act1 = new Account();
		System.out.printf("The default account is created with the ID:%d\nThe default balance is: $%-9.2f\nThe default Annual Interest is: %f\nDate created is: %s", 
				act1.getId(), act1.getBalance(),act1.getAnnualInterestRate(), act1.getDateCreated());
		
		
		//Test the mutator methods
		act1.setId(1122); //set the id to 12
		act1.setBalance(20000);//set the balance to 1100
		act1.setAnnualInterestRate(.12);
		
		
		
		System.out.println();
		System.out.println();
		System.out.printf("The new account ID is: %d\nThe new balance is: $%-9.2f\nNew annual interest rate is: %2.1f\nThe monthly interest rate is %2.3f\nThe monthly interest is: $%-9.2f\n",
				act1.getId(), act1.getBalance(), act1.getAnnualInterestRate(), act1.getMonthlyInterestRate(), act1.getMonthlyInterest());
		
		
		//withtdraw and deposit to/from the account
		System.out.printf("Balance after withdrawing $2500: $%-9.2f\nBalance after depositing $3000: $%-9.2f\n", act1.withdraw(2500), act1.deposit(3000));
	    
		System.out.println(act1.toString());
				
		
		System.out.println();
		
		Account act2 = new Account(1123, 1200);
		System.out.printf("Newly created account using account id and balance: %d $%-9.2f\n", act2.getId(), act2.getBalance());
		
		System.out.println(act2.toString());
		
		
		
	}

}
