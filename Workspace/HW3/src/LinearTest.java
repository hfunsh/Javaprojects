//test the linear equation class
//any of the commands can be uncommented for testing
public class LinearTest {
	
	public static String noSolution(LinearEquation l1, boolean solveIt){
		solveIt = l1.isSolvable();
		if (!solveIt)
		return "The equation has no solution";
		
		return null;
	}

	public static void main(String[] args) {
		
	
		LinearEquation l1 = new LinearEquation(3.4, 50.2, 2.1, .55, 44.5, 5.9);
        
		//System.out.println(l1.getY());
		//System.out.println(l1.isSolvable());
		//System.out.println(l1);
		
		//boolean solveIt = l1.isSolvable();
		//if (!solveIt) 
		//	System.out.println("The equation has no solution");
		
		
		LinearEquation l2 = new LinearEquation(9.0, 4.0, 3.0, -5.0, -6.0, 21.0);
		//System.out.println(l2.getY());
		//System.out.println(l2.isSolvable());
		//System.out.println(l2);
		
		//boolean solveIt2 = l2.isSolvable();
		//if (!solveIt2) 
		//	System.out.println("The equation has no solution");
		
		LinearEquation l3 = new LinearEquation(1.0, 2.0, 2.0, 4.0, 4.0, 5.0);
		//System.out.println(l2.getY());
		//System.out.println(l2.isSolvable());
		System.out.println(l3);
		
		boolean solveIt3 = l3.isSolvable();
		if (!solveIt3) 
			System.out.println("The equation has no solution");
		
		     
		
		
	}

}
