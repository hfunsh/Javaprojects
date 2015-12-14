//return true if the array is sorted
public class ArrayIsSorted {

	public static boolean isSorted(int []a){
		//iterate through the array and return false if the next element is less than the current
		for (int i = 0; i < a.length-1; i++){
			if (a[i] > a[i+1]){
				return false;
			}
			}

			return true;
		}
	
	public static int minVal(int []a ){
		int min = a[0];
		
		for (int i = 1; i < a.length; i++){
			if (min > a[i])
				min = a [i];}
		
		
		return min;
	}
	
	public static int maxVal(int []a){
		int max = a[0];
		
		for (int i = 1; i < a.length; i++){
			if (max < a[i])
				max = a[i];
		}
		return max;
	}
	
	public static double medVal(int []a){
		double midVal = 0;
		int alength = a.length;
		if (alength % 2 == 0){
			midVal = (a[alength/2] + a[(alength/2)-1])/2;
		}
		if (alength % 2 != 0 ){
				midVal = a[(alength/2)];
		}
		return midVal;
	}
	
	public static int oddSix(int []a){
		int count = 0;
		
		for (int i = 0; i < a.length; i++){
			if (a[i] > 6 && a[i] % 2 == 0)
				count ++;
		}
		
		return count;
				
	}
	
	public static int centAvg(int []a){
		int avg = 0;
		int sum = 0;
		int centSum =0;
		
		int min = minVal(a);
		int max = maxVal(a);
		
		for (int i = 0; i < a.length; i++){
			sum+=a[i];}
		
		centSum = sum - min - max;
	
		avg = centSum /(a.length-2);
		
		return avg;
		
	}
	
	public static boolean modThree(int [] a){
		int evenCount = 0;
		int oddCount = 0;
		
		for (int i = 0; i < a.length-2; i++){
			if (a[i] % 2 == 0 && a[i+1] % 2 == 0 && a[i+2] % 2 ==0)
				return true;
			if (a[i] % 2 != 0 && a[i+1] % 2 != 0 && a[i+2] % 2 !=0)
				return true;
			
		}
			if (oddCount >= 3 || evenCount >= 3)
				return true;
		
		
		
		return false;
	}
	

		public static void main(String[] args) {

			int [] b = {1, 2, 2, 4, 5, 5, 5, 7, 9, 9, 9, 9, 9, 9, 12};
			
			int [] c = {1, 2, 3, 4, 100};
			
			int [] d = {2, 4, 2, 5};

			System.out.println(isSorted(b));
			
			System.out.println(minVal(b));
			
			System.out.println(maxVal(b));
			
			System.out.println(medVal(b));
			
			System.out.println(oddSix(b));
			
			System.out.println(centAvg(b));
			
			System.out.println(centAvg(c));
			
			System.out.println(modThree(d));

		}

	}
