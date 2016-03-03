//Given a string, if the String returns a "red" or "blue" return the color. Otherwise return an empty string


public class TestColor {
	
	public static String seeColor(String str){
		
		//check the length of the string and compare the substring to red
		if (str.length() >= 3  && str.substring(0,3).equals("red"))
			return "red";
		
		//check the length of the string and compare the substring to blue
		if(str.length() >= 4  && str.substring(0,4).equals("blue"))
			return "blue";
				
		return "";
	}

	public static void main(String[] args) {
		
		System.out.println(seeColor("bluexxxxxx"));

	}

}
