
public class CenteredAverage {
	
	public static int centeredAverage(int[] nums) {
		  //find the max value
		  int max = nums[0];
		  
		  for(int i = 1; i < nums.length; i++){
		  if(nums[i]> max) max = nums[i];}
		  System.out.println("The max is " + max);
		   
		  
		  //find the min value
		  int min = nums[0];
		  for(int i = 1; i < nums.length; i++){
		  if(min > nums[i]) min = nums[i];}
		  System.out.println("The min is " + min);
		  
		  
		  //find the sum of all values
		  int sum = 0;
		  for(int i = 0; i < nums.length; i++){
		   sum+= nums[i];}
		  
		  
		  //subtract the min and max values
		  int centSum = sum - max - min;
		  
		  
		  //find the average
		  int centAvg = (centSum)/(nums.length - 2);
		  
		  
		  return centAvg;
		}

	public static void main(String[] args) {
		
		int [] a =  {1, 2, 3, 4, 100};
		
			
		double [] newArray = new double [10];
		newArray[0] = 100;
		System.out.println(newArray[0]);
		System.out.println("The centered average for the array is " + centeredAverage(a));
		
		//shuffle the elements in an array
		System.out.print("The original array is: ");
		int temp = 0;
		int rand= 0;
		int [] shufA = new int [10];
		for (int i = 0; i < 10; i++){
			shufA[i] = i + 90;
			System.out.printf("%2d ", shufA[i]);
		}
		
		//now shuffle the array
		System.out.print("\nThe shuffled array is: " );
		for (int i = 0; i < shufA.length; i++){
			rand = (int)(Math.random()*i);
			//now move the element at the randomly generated element to temp
			temp = shufA[i];
			shufA[i] = shufA[rand];
			shufA[rand] = temp;
			}
		for (int i = 0; i < shufA.length; i++){
			System.out.printf("%2d ",shufA[i]);
		}
		
		
		 

	}

}
