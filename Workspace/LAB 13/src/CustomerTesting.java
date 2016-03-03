
public class CustomerTesting {
	
	String password;
 public static boolean validatePassword ( String pword )
	   {
	       //declare the variables
		   int upperLetterCnt = 0;
		   int lowerLetterCnt = 0;
		   int numberCount = 0;
		    
		   	   	   
		   //verify the length of pwd >=8 
		  if (pword.length() < 8)
			   return false;
		   
		   else 
			   for (int i = 0; i < pword.length(); i++){
			   if (pword.charAt(i) >= '0' &&  pword.charAt(i) <= '9')
				    numberCount++;
			   if (pword.charAt(i) >= 'A' && pword.charAt(i) <= 'Z' )
				   upperLetterCnt++;
			   if (pword.charAt(i) >= 'a' && pword.charAt(i) <= 'z' )
				   lowerLetterCnt++;
			   		   
		   }
		   
		   if (numberCount > 0 && upperLetterCnt > 0 && lowerLetterCnt > 0)
		   
		   
		   return true;
		   
		   return false;
		   
		   
		   
		 
	   }
 
 
 public static boolean setPassword( String pword )
 {
	 String password;
	   //call the validatePassword method
    if (validatePassword( pword ))
    { 
  	  password = pword;    
  	      	  
       return true;
    }
    else 
       return false;
       
 }

 /*public static boolean login( String pword)
 {
	 
	
     //compare the string pword to the password instance variable
	   if (pword.equals(password))
		   return true;
	   
         return false;
 }
 */
 
 
	

	public static void main(String[] args) {
		
		
		
		//System.out.println(validatePassword("paPswo1d"));
		//System.out.println("password".length());
		
		String pword = "Tinafey1";
		String firstName = "Tina";
		
		
		
		String firstNameLower = firstName.toLowerCase();	
		String pwordLower = pword.toLowerCase();
		
		System.out.println(firstNameLower);
		System.out.println(pwordLower);
		
		int passCompare = pwordLower.indexOf(firstNameLower);
		System.out.println(passCompare);
		if (passCompare < 0)
			System.out.println("does not contain string");
		else 
			System.out.println("contains string");
		
		
		
		 
		  

	}

}
