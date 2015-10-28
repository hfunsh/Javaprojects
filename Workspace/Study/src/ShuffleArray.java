//this method will shuffle the elements in an array

public class ShuffleArray {
	
	public static  void shuffleArray(int [] shufA){
		
		int rand =0;
		
		for (int i = 0; i < shufA.length; i++){
		rand = (int)(Math.random()*i);
		//now move the element at the randomly generated element to temp
		int temp = shufA[i];
		shufA[i] = shufA[rand];
		shufA[rand] = temp;
		}
	for (int i = 0; i < shufA.length; i++){
		if (i % 10 ==0){
			System.out.println();
			}
		System.out.printf("%4d",shufA[i]);
		
		}
}

	public static void main(String[] args) {
		
		
		System.out.println("The original array is: ");
		
		int [] testArray = new int [20];
		for (int i = 0; i < testArray.length; i++){
			testArray[i] = i;
			System.out.printf("%4d", i);
		}
		
		
		System.out.println("\nThe shuffled array is: ");
		shuffleArray(testArray);

	}

}
