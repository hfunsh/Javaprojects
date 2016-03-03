//Testing the Die class
public class DieRoll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Die d1 = new Die(6);  //create a new die object
		
		//for (int i = 0; i < 100 ; i++){
			//d1.roll();
		
		System.out.println(d1);  //print the default value of the die object
		//System.out.println("The new Set Value of d1 is " + d1.setValue(1));
		System.out.println(d1.getValue());  //call the get value method of the object
		System.out.println("Flipped value is: " + d1.flip());  //call the flip method to flip the die
		System.out.println("The new Set Value of d1 is " + d1.setValue(1)); //overide the value of the die
		System.out.println(d1);
		//}
	}

}
