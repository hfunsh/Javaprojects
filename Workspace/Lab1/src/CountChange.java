   import java.util.Scanner;

   /*
    * Convert a dollar amount to a number of quarters, dimes, 
    *      nickels, and pennies.
    */
    public class CountChange
   {
       public static void main(String[] args)
      {
      //create a Scanner object and open the keyboard for input
         Scanner input = new Scanner (System.in);
         System.out.print("Enter amount: ");
      
      //read in a double for the original amount
         double amount = input.nextDouble();
         System.out.println("you entered: "+ amount);
      
      //amount is in dollars, convert to pennies  
      //note the typecast of amount (double) to int
         amount = amount + .00001;              //prevents rounding errors
         int numPennies = (int)(amount * 100);  //amount is a double, storing into an int
      
      //compute number of quarters 
         int numQuarters = numPennies / 25;
         numPennies = numPennies % 25;
      
      //todo: compute number of dimes
         int numDimes = numPennies / 10;
         numPennies = numPennies % 10;
      
      //todo: compute number of nickels
         int numNickels = numPennies/5;
         numPennies = numPennies % 5;
      
         System.out.println("\nYour Change");
         System.out.println("Quarters: " + numQuarters);
         System.out.println("Dimes: " + numDimes);
         System.out.println("Nickels: " + numNickels);
         System.out.println("Pennies: " + numPennies);
      
      }
   }