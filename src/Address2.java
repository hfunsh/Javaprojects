//create an address class

public class Address2{

	private static int count = 0;
	private int number;
	private String street;
	private String city;
	private int zip;
	private String state;


	public Address2(int number, String street, String city, String state, int zip){
	
	if(String.valueOf(zip).length() != 5){
	throw new IllegalArgumentException("Zip code not five digits");
	}

	count++;
	this.number = number;
	this.street = street;
	this.city = city;
	this.zip = zip;
	this.state = state;
}

	public static int getCount(){

	return count;
}

	public String toString(){
	
	return String.format("%d %s %s %d %s %n", number, street, city, zip, state);
}

}
