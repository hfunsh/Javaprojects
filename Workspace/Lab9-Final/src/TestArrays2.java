public class TestArrays2
{
   
   /*
    * printArray
    *
    * input: an array of integers
    * output: (void)
    *
    * display all elements within an array, 4 spaces per element
    * print a new line after every 10 elements
    */ 
   public static void printArray(String msg, int [] a)
   {
      
      System.out.println( msg + ":");
      for (int k=0; k<a.length; k++) 
      {
         System.out.printf("%4d  ", a[k]);
         if ((k+1) % 10 == 0)
            System.out.println();
      }
      System.out.println();
   }
   
   /*
    * populateArray
    *		input: an array of integers
    *		output:  (void)
    *
    *    populate the array with random values for a given range and offset
    *    each element should be within:  offset <= x < offset+range 
    *
    *  if the range is 100 and the offset is 10
    *  then the elements should be between 10 and 109
    *
    *  you do not have to return anything.  You are passed a reference to
    *  an array and you are modifying the elements of the array.  
    */
   public static void populateArray(int [] a, int range, int offset)
   {
      for (int k=0; k<a.length; k++)
         a[k] = (int)(Math.random()*range + offset);		
   }
   
   /*
    * countOdd_Over50
    *		input: an array of integers
    *		output:  a count of elements that are odd AND greater than 50
    *
    *    countOdd_Over50 ( {6, 51, 90, 61, 12, 14} ) => 2
    *
    *    create and initialize a count variable to 0.
    *    traverse the list and test for odd AND over 50
    *       to test for 2 conditions use the && (and) operator
    *    
    *	   return the count
    */
   public static int countOdd_Over50(int [] a)
   {
      int cnt=0;
      //write a loop that iterates through the array and counts all the odd numbers over 50
      for (int i = 0; i < a.length; i++)
      		{if (a[i] > 50 && a [i] % 2 != 0){
      			cnt++;}
      		}
      return cnt;
   }
   
   
   /*
    * replaceNegatives
    *		input: an array of integers
    *		output: absolute value of all elements
    *
    *			modify the existing array.  If an element is negative, replace
    *			it with the absolute value ( multiply by -1).
    *
    *    replaceNegatives ( {6, 25, -8, 9, -12, -8} ) => {6, 25, 8, 9, 12, 8}
    */
   public static void replaceNegatives(int [] a)
   {
     	  
	  //write a loop to convert all negatives to positive
	  for (int i = 0; i < a.length; i++){
		  if (a[i] < 0){
			  a[i]*=-1;}
	 
	  }
	  
   }
     
   /*
    * removeNegatives
    *		input: an array of integers
    *		output: an array of integers with only positive elements
    *
    *    removeNegatives ( {10, -11, 12, -13} ) =>  {10, 12 }
    *
    *    traverse the array
    *       count the number of positive elements
    *
    *    create a new array 
    *    copy only the positive elements
    *     - note: you'll need a seperate index for the new array
    */
   
   public static int[] removeNegatives(int [] a)
   {
      int posCnt=0;
      //count the number of positive elements in an array
      for (int i = 0; i < a.length; i ++){
    	  if (a[i] >=0){
    		  posCnt++;}
    	  }
      
                      
      int [] b = new int[posCnt];
      int index=0;
      	  for (int i = 0; i < a.length; i++){
            if (a[i] >= 0){
    		  b[index] = a[i];
    	  		index++;}
      	 
      }
      
    return b;
   }   
   
    /*
    * shuffleArray
    *		input: an array of integers
    *		output: an array of integers with the original elements shuffled
    *
    *    shuffleArray ( {10, 18, -3, 9, -8} ) =>  {-3, -8, 10, 18, 9 }
    *
    *    traverse the array
    *       generate a random index
    *       swap the element of the current index with the random index
    */
   
   public static int[] shuffleArray(int [] a)
   {                
	   //loop to traverse the array
	   for (int i = 0; i <a.length ; i++){
		   int randIndex = (int)(Math.random()*a.length);
		   int temp = a[i];
		   a[i] = a[randIndex];
		   a[randIndex] = temp;
		 
		    }
	  	  
      return a;
   }      
   
    /*
    * getMedian
    *		input: an array of sorted integers
    *		output: double - median value
    *
    *    if the length of the array is odd, return the middle element
    *    if the length of the array is even, return the average of the 2 middle elements
    *
    *    getMedian ( {10, 12, 13, 20} ) => 12.5
    *    getMedian ( {10, 12, 14} ) => 12.0
    *
    *    if the length of the array is even
    *          - return the average of the 2 middle numbers
    *
    *    if the length of the array is odd
    *          - return the middle number (note: need to typecast the element to a double)
    */
    
    public static double getMedian(int [] a){
    	double medi = 0;
    	int half = 0;
    	
    	//find the length of the array and derive the middle element
    	if (a.length % 2 == 0 ){
    		half = a.length/2;
    		medi = (a[half] + a[half - 1])/2;
    	}else if (a.length % 2 != 0){
    		half = a.length/2;
    		medi = a[half];
    	}
    	
    	return medi;
    }
    

    /*
    * calculateAverage
    *		input: an array of integers
    *		output: double - average value
    *
    *    calculateAverage ( {10, 11, 12, 13} ) => 11.5
    *
    *    create a sum
    *    traverse the array
    *       add the element to sum
    *
    *    divide the sum by the number of elements (a.length)
    *    return the average
    */
   
   public static double calculateAverage(int [] a)
   {
      double sum = 0;
      
      //Iterate through the array and sum of the elements
      for (int i = 0; i < a.length; i++){
    	  sum += a[i];
      }
      
      ///return the average value
      return sum / a.length;
   }
    
    /*
    * calculate the standard deviation
    *		input: an array of integers
    *		output: standard deviation 
    *
    *    use the formula:
    *           http://standard-deviation.appspot.com
    *  	note: use Math.pow(x, y) to square a value and to take the square root.
    */
   public static double computeStandardDeviation(int [] a)
   {
      double avg = calculateAverage(a);
      double diffSum = 0;
      int arrayLength = a.length;
      //now compute the standard deviation
      
      //calculate x - avg(x) for each sample
      //use a loop to iterate through the array
      
      for (int i = 0; i < a.length; i++){
    	  diffSum += Math.pow(a[i]-avg, 2);
      }
    	 
      //calculate the standard deviation
      double s = Math.sqrt((diffSum) / (arrayLength - 1));
      
      return s;
   }
   	
  public static void printTestHeader( int testNum, String msg )
   {
      System.out.println("\n=================================================================");
      System.out.println("   Test: " + testNum + ". " + msg + "\n");	
   } 
   public static void printTestTrailer(  )
   {
      System.out.println("=================================================================\n");	
   }
    /*
     * Uncomment the sections of code in main after you have finished
     *    writing the corresponding methods above. 
     * I recommend you write a method, then test it. Don't try to write all
     *    methods first.  
     */
    
   public static void main(String[] args)
   {
      int [] my2ndArray = new int [20];
      int testCount = 1; 		
            
      printTestHeader(testCount++,  "count odd elements over 50"); 
      //populate the Array with random numbers: range=100, offset=10
      populateArray(my2ndArray, 100, 10);
      printArray("my2ndArray after poplating it with a range of 100 and an offset of 10", my2ndArray);
       
      //count the number of elements that are both odd and over 50
      int cnt = countOdd_Over50(my2ndArray);
      System.out.println("count of odd elements over 50: " + cnt);
      printTestTrailer();
      
      
      //replace all negatives with the absolute value
      printTestHeader(testCount++, "replace all negative elements with positive values");
      populateArray(my2ndArray, 100, -50);
      printArray("after populating with range=100, offset=-50", my2ndArray);
      replaceNegatives(my2ndArray);
      printArray("after modifying the negative elements", my2ndArray);
      printTestTrailer();
           
      
      
      printTestHeader(testCount++, "remove all negative elements in the array");
      //populate the array with negative values, range = 100, offset = -50
      populateArray(my2ndArray, 100, -50);
      printArray("after populating with range=100, offset=-50", my2ndArray);      
         //remove all negative values.  The new array can have a different length
      int [] modifiedArray = removeNegatives(my2ndArray);
      printArray("after call to removeNegative", modifiedArray); 
      printTestTrailer();
       
      
      
      
      printTestHeader(testCount++, "shuffle all elements in the array"); 
       //shuffle array
      populateArray(my2ndArray, 100, -50);
      printArray("after populating with range=100, offset=-50", my2ndArray);
      shuffleArray(my2ndArray);
      printArray("after calling shuffle array", my2ndArray);
      printTestTrailer();
      
      
      
      
      printTestHeader(testCount++, "find the median value of a sorted array");
      //find the median of an array
      int [] sortedOdd = {5, 8, 10, 12, 14, 18, 24};
      printArray("odd sorted array", sortedOdd);
      double median1 = getMedian(sortedOdd);
      System.out.println("median = " + median1);
      
      int [] sortedEven = {-4, -2, 0, 2, 8, 24};
      printArray("even sorted array", sortedEven);
      double median2 = getMedian(sortedEven);
      System.out.println("median = " + median2);
      printTestTrailer();    
       
       
       
         
      printTestHeader(testCount++, "compute the average of all elements in the array");    
      int [] myArray = {4, 2, 5, 8, 6 };  
      printArray("testing calculateAverage", myArray);   
      double avg = calculateAverage(myArray);
      System.out.printf("average value = %5.2f\n" ,avg);
      printTestTrailer();
      

          
         
      printTestHeader(testCount++, "compute the standard deviation of an array");    
      //int [] myArray = {4, 2, 5, 8, 6 };  
      printArray("testing computeStandardDeviation", myArray);   
      avg = calculateAverage(myArray);
      System.out.printf("average value = %5.2f\n" ,avg);
      double stdDev = computeStandardDeviation(myArray);
      System.out.printf("standard deviation = %5.2f\n" ,stdDev);
      printTestTrailer();
      
      
   }
   
}