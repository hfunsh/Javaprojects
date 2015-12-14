import java.util.Scanner;

public class AreTheyEqual {

	public static String items [] = {"Sweater", "Socks", "pants", "shoes", "purse", "wallet"};
	public static double costs [] = {12.80, 4.25, 32.33, 102.44, 97.11, 300};

	public static boolean areTheyEqual(String str1, String str2)
	{
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		return str1.equals(str2);
	}  

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		boolean exit = false; 
		int costIndex = 0;
		int i = -1;

		/*do {
		      System.out.println("Please select an item to purchase: ");
		      String userSelect = input.next();
		      //  call areTheyEqual()
		      for (int i = 0; i < items.length; i++){
		    	  if (areTheyEqual(userSelect, items[i])){
		    		  System.out.println(costs[i]);
		    		  userSelect = input.nextLine();
		    			 } else System.out.println("item not found");
	                       userSelect =input.next();	    	  
		    	  //if we don't find a match, print an error and return to prompting the user to enter item
		      }
		      } while (!exit);*/
		do {
			System.out.println("Please select an item to purchase: ");
			i = 0;
			String userSelect = input.next();
			

			while (!areTheyEqual(userSelect, items[i])){
				i++;}
			
			System.out.println(costs[i]);
						

			/*for (int i = 0; i < items.length; i++){
			if (areTheyEqual(userSelect, items[i])){
				costIndex = i;
				}else {System.out.println("items not found");}
		}      System.out.println(costs[costIndex]);
			 */
			if (areTheyEqual(userSelect, "exit")){
				exit = true;
			}
		} while (!exit);



	}
}
