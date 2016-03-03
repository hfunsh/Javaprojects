/*
 * 
Given a string, return true if it ends in "ly". 

endsLy("oddly") → true
endsLy("y") → false
endsLy("oddy") → false
 */
public class EndsLy {

	public static boolean endsLy(String str){
		String str2 = " ";
		
		//check the length of the string to ensure it is at least 2
		if (str.length() < 2)
			return false;
		
		if(str.length() >= 2){
			str2 = str.substring(str.length()-2);
		}
		
		str2.toLowerCase();
		if (str2.equals("ly"))
			return true;
		
		return false;
	}
	
	
	public static void main(String[] args) {
		System.out.println(endsLy("oddly"));
		System.out.println(endsLy("y"));
		System.out.println(endsLy("oddy"));

	}

}
