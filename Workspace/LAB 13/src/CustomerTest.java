

import java.util.Scanner;

public class CustomerTest
{
   static Customer [] myCustomers = new Customer[10];
   static int nextCustomer = 0;
   static Scanner input = new Scanner (System.in);
   
   public static String promptCustomerName()
   {
      input = new Scanner (System.in);    
      System.out.print("Enter Customer Name: ");
      String name = input.nextLine();
      return name;
   }
   
   public static Customer lookUpCustomer ( String name )
   {
      for (int k=0; k<nextCustomer; k++)
      {
         String custName = myCustomers[k].getFullName();
         if (custName.equals(name))
            return myCustomers[k];
      }
      return null;
   }
   public static void listCustomers()
   {
      System.out.println( Customer.getHeader() );
      for (int k=0; k<nextCustomer; k++)
      {
         System.out.println ( myCustomers[k] );
      }
   }

   
   public static boolean addCustomer( Customer cust )
   {   
      if (nextCustomer < myCustomers.length )
      {
         myCustomers[nextCustomer++] = cust;
         return true;
      }
      else 
         return false;
   }
   
   public static boolean addCustomer ()
   {
      String name = promptCustomerName();
      Customer cust = lookUpCustomer( name );
      if (cust != null)
      {
         System.out.println("Customer already exists: " + cust );
         return false;
      }
      cust = new Customer ( name );
       
      return addCustomer ( cust );
   }
   
   public static void accessCustomer()
   {
      String name = promptCustomerName();
      Customer cust = lookUpCustomer( name );
      if (cust == null)
      {
         System.out.println("Customer does not exist: " );
         return;
      }
      //Testing Customer accessor methods
      System.out.println("Name:  " + cust.getFullName() );
      System.out.println("First: " + cust.getFirstName() );
      System.out.println("ID:    " + cust.getId() );
      System.out.println("date:  " + cust.getDateCreated() );
      System.out.println();
      System.out.println("Do you want to set the Password (y or n)? ");
      String answer = input.next();
      answer = answer.toLowerCase();
      if (answer.length () > 0 && answer.charAt(0) == 'y')
      {
         System.out.println("Enter password: ");
         System.out.println("      at least 8 chars");
         System.out.println("      at least 1 number");
         System.out.println("      at least 1 capital letter");
         System.out.println("      at least 1 lower case letter");
         String password = input.next();
           
         if (cust.setPassword( password ))
            System.out.println("password was set successfully");
         else 
            System.out.println("invalid password???");
      }
      
   }
   public static void loginCustomer()
   {
      String name = promptCustomerName();
      Customer cust = lookUpCustomer( name );
      if (cust == null)
      {
         System.out.println("Customer does not exist: " );
         return;
      }
      
      System.out.println("Enter password: ");
      String password = input.next();
           
      if (cust.login( password ))
         System.out.println("login was successful");
      else 
         System.out.println("invalid password");
      
      
   }

   
   public static void menu()
   {
      while (true) 
      {
         System.out.println();
         System.out.println("Customer Test Menu");
         System.out.println("1 .... List Customers");
         System.out.println("2 .... Add Customer");
         System.out.println("3 .... Set a Customer's password");
         System.out.println("4 .... Login as a Customer");
         System.out.println("5 .... Exit");
         int choice = input.nextInt();
         switch (choice) {
            case 1:
               listCustomers();
               break;
            case 2:
               addCustomer();
               break;
            case 3:
               accessCustomer();
               break;
            case 4:
               loginCustomer();
               break;
            case 5:
               System.exit(0);
               break;
            default:
               System.out.println("Invalid choice");
         }
      }
   }
   public static void setCustomerPassword( Customer cust, String pswd )
   {
	   if (cust.setPassword(pswd))
		   System.out.println("password was successfully set for " + cust.getFullName());
	   else 
		   System.out.println("invalid password for "+ cust.getFullName());
   }
   public static void main (String [] args)
   {
	  //create customer, set password, add to customer array
      Customer cust1 =  new Customer ("Samuel L Jackson");
      setCustomerPassword( cust1, "Sammy123Valid");
      addCustomer (cust1);
      
      //create customer, add to customer array.
      //similar to above, but we do not save off a reference to the object
      addCustomer (new Customer ("Jimmy James Fallon"));
      
      //Invalid password, only 6 characters.
      Customer cust3 =  new Customer ("Jon Anthony Stewart");
      setCustomerPassword( cust3, "Abc123");
      addCustomer (cust3);
      
      //Invalid password, no capital letters
      Customer cust4 =  new Customer ("Tina Fey");
      setCustomerPassword( cust4, "abc123no_caps");
      addCustomer (cust4);
      
      //Invalid password, no numbers
      Customer cust5 =  new Customer ("Stephen Scott Colbert");
      setCustomerPassword( cust5, "lateNight@NBC");
      addCustomer (cust5);
      
      menu();
      
   }
   
   
}
