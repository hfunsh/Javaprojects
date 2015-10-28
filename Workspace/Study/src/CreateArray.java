//this method will create a new array and populate it 
//Input is an int which will be one greater than the last element in the new array


public class CreateArray {
	
	public static int[] createArray(int a){
		//create the new array
		int [] newArray = new int [a];
		
		//populate the new array
		for (int i = 1; i < a; i++){
		newArray[i] = i;
		if(i % 10 == 0){
		System.out.println();}
		System.out.printf("%4d", i);
					}
		
		return newArray;
		}
		
			

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("The original array is: ");
		int [] thisArray = createArray(99);
		
		System.out.println("\nThe shuffled array is: ");
		ShuffleArray.shuffleArray(thisArray);

	}

}
