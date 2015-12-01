
import java.util.Scanner;

public class BankApplication {
   
   static final int MAX_ACCOUNTS = 10;
   static Scanner input;
   static Bank myBank;
   	
   	      /*
   	 * addAccount: 
   	 *     if there is room in the array, prompt the user for an id and balance,
   	 *     create an Account object, and then add it into the array
   	 */
   public static void addAccount()
   {
         
            //prompt user for the id
      System.out.println();
      System.out.print("Enter id: ");
      int id = input.nextInt();
         	
         	//verify account with same id does not already exist
      Account acct = myBank.findAccount(id);
      if (acct != null)
      {
         System.out.println("Account already exists");
         return;
      }
         	
         	//prompt user for balance
      System.out.println();
      System.out.print("Enter balance: ");
      double balance = input.nextDouble();
         	
         	//create a new account object
      acct = new Account(id, balance);
         	
         	//add account to the array and increment nextAcountIndex
      boolean result = myBank.addAccount(acct);
      if (!result)
         System.out.println("error when adding new Account");
                     	 
        
   }
      /*
   	 * accessAccount:
   	 *      prompt user for an id and find the account.
   	 *      allow user to make deposits and withdrawals
   	 *      display account after every transaction.
   	 *      similar to an ATM machine.
   	 */ 
   public static void accessAccount()
   {
         //prompt user for ID
      System.out.print("Enter id: ");
      int id = input.nextInt();
      	
      	//find the account
      Account acct = myBank.findAccount(id);
      	
      	// if it does not exist, notify user and return
      if (acct == null)
      {
         System.out.println("Account does not exist");
         return;
      }
      	
      	//display menu
      int choice = 0;
      do
      {
         System.out.println();
         System.out.println("1 .. make deposit");
         System.out.println("2 .. make withdraw");
         System.out.println("3 .. show balance");
         System.out.println("4 .. exit");
         System.out.print("choice: ");
         
         choice = input.nextInt();
         if (choice == 1)
         {
            System.out.print("Enter amount to deposit: ");
            double amount = input.nextDouble();
            if (amount < 0){ //Ensure the user cannot deposit a negative amount
            	System.out.println("Deposit failed, please enter an amount greater than 0");}
            else acct.deposit(amount);
            System.out.println(acct);
         }
         else if (choice == 2)
         {
            System.out.print("Enter amount to withdraw: ");
            double amount = input.nextDouble();
            if (amount > acct.getBalance()) //Ensure that the withdrawal cannot exceed current balance
            	System.out.println("Withdraw failed");
            else acct.withdraw(amount);
            System.out.println(acct);
         }
         else if (choice == 3)
         {
            System.out.println(acct.getBalance());
         }
      } while (choice != 4);
      
   }
   	/*
   	 * listAccounts
   	 *    traverse array, listing all accounts
   	 */
   public static void listAccounts()
   {
      System.out.println(myBank);
   }
   	
   public static void printMenu()
   {
      System.out.println();
      System.out.println("1 .. list accounts");
      System.out.println("2 .. add account");
      System.out.println("3 .. access account");
      System.out.println("4 .. apply monthly interest");
      System.out.println("5 .. exit");
      System.out.print("choice: ");
   }
   public static void main(String[] args) {
      
      input = new Scanner (System.in); 
      myBank = new Bank("NovaBank", MAX_ACCOUNTS);
      Account.setAnnualInterestRate(.12);
      int choice = 0;
      do 
      {
         printMenu();
         choice = input.nextInt();
         switch (choice) {
            case 1: 
               listAccounts();
               break;
            case 2: 
               addAccount();
               break;
            case 3:
               accessAccount();
               break;
            case 4:
               myBank.processMonthlyEvent();
               break;
            case 5:
               break;
            default:
               System.out.println("Invalid choice");
         }
         
            
      } while (choice != 5);
      
   }
   
}