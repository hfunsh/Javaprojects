//Testing the Bank class
public class TestBank {

	public static void main(String[] args) {

		int testAccounts = 10;
		//testAccounts[1].setId(1144); 
		//Account acct2 = new Account(1122, 1200); //create a new account object
		//Account acct3 = new Account();
		
		Bank b1 = new Bank("testBank", testAccounts); //Bank object with an array of accounts
		System.out.println(b1);
		//b1.addAccount(acct2);
		System.out.println(b1);
		System.out.println("Next new customer: " + b1.getNextNewCustomer());
	
		//Account acct5 = myAccount
		
		/*System.out.println(acct2.getBalance());
		System.out.println(acct2.getId());
		acct2.setId(1123);
		System.out.println(acct2.getId());
		System.out.println(acct3.getId());
		System.out.println(acct3.getBalance());
		acct3.setBalance(99);
		System.out.println(acct3.getBalance());
		
		
		//System.out.println(b1);
		
		//System.out.println(b1.findAccount(1122));
		
		//testAccounts[1].getId();*/
		
		
		
		

	}

}
