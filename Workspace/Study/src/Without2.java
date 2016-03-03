/*
 * 
Given a string, if a length 2 substring appears at both its beginning and end, return a string without the substring at the beginning, 
so "HelloHe" yields "lloHe". The substring may overlap with itself, so "Hi" yields "". Otherwise, return the original string unchanged. 

without2("HelloHe") → "lloHe"
without2("HelloHi") → "HelloHi"
without2("Hi") →
 */
public class Without2{

    public static String without2(String str){
    	String start = " ";
    	String end = " ";
    	//compare the 2 strings at the begining and end of the string
    	//if they are equal, return the string without the first 2
    	
    	//the string needs to be at least 2
    	if (str.length() < 2)
    	str = str;
    	
    	if(str.length() >=2){
    		start = str.substring(0,2);
    		end = str.substring(str.length()-2);
    	}
    	
    	if (start.equals(end))
    		str = str.substring(2);
    	
    	return str;
    }

	public static void main(String[] args) {
		
		System.out.println(without2("HelloHe"));
		System.out.println(without2("HelloHi"));
		System.out.println(without2("Hi"));
		

	}

}
