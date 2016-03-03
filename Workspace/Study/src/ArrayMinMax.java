//find the smallest and largest elements in an array
public class ArrayMinMax {

	public static void main(String[] args) {
		//declare a new array
		
		int [] c = new int[10];
		
		//populate the array with a for loop
		int x = 0;
		for (int i = 0; i < c.length; i++){
			c[i]= i;
			x++;
		}
		
		//print the array
		
		for (int i = 0; i < c.length; i++){
		System.out.println(c[i]);
		}
		
		
		//find the max element in the array
		int arrInd = 0;
		int max = c[0];
		for (int i = 1; i < c.length; i++){
			if (c[i] > max) {max = c[i];
			arrInd++;
			 
			}
					}
		System.out.println("The max value in the array is " + max);
		System.out.println("The array index is " + arrInd);
		
		//find the min element in the array
		
		int minIndex = 0;
		int min = c[0];
		for (int i = 1; i < c.length; i++){
			//if the current min is greater than the next value, make that value the new min. meaning if the next number is smaller, it is the min
			if (min > c[i]) {
				min = c[i];
				minIndex++;
			}
		
		}
		System.out.println("The min value of this array is " + min);
		System.out.println("The array  index is " + minIndex);
		
		
		//find the average of the numbers ignoring the largest and the smallest
		
		int sum = 0;
		
		for (int i = 0; i < c.length; i ++){
			sum+=c[i];
		}
		
		int avg = sum / c.length;
		
		System.out.println("The sum of this array is " + sum);
		System.out.println("The average of this array is " + avg);
		
		//the center weighted average is the average of the middle three numbers
		//Copy the middle three elements into an array
		
		int middle = c.length/2;
		
		int centSum = c[middle - 1] + c[middle] + c[middle + 1];
		int centAvg = centSum/3;
		
		System.out.println("The sum of the three middle elements in the array is " + centSum);
		System.out.println("The centered average of this array is " + centAvg);
		
				
		
		
		

	}

}
