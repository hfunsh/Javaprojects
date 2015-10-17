/*This application will display information about a Triangle, given 3 points. 
 * For each side, we will display the length, slope and opposite angle. 
 * After determining each angle, we will decide if the triangle is Obtuse, right or acute
 * We will accomplish all of this by writing various methods
 */

import java.util.*;


public class TriangleLab {
	
	static Scanner input = new Scanner (System.in);
	

//Write a method to compute the Distance between 2 points, given 4 inputs (doubles)

public static double distance(double x1, double y1, double x2, double y2)
{
	//calculate the distance
	double dist = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
	
	//return the results
	return dist;
}

//Write a method to compute the Slope between 2 point, given 4 inputs (doubles)

public static double slopeOfTri(double x1, double y1, double x2, double y2)
{
	double slop = (y2 - y1) / (x2 - x1);
	
	return slop;
	
}

//Write a method to compute the Opposite angle, given 3 side lengths of a triangle

public static double oppAngle(double a, double b, double c){
	
	//calculate the Arc of the Cosine using the Math.acos method
	double arcosA = Math.acos((Math.pow(a, 2)- Math.pow(b, 2) - Math.pow(c, 2)) / (-2 * b * c));
		
	//Convert the Arc from Radians to degrees using the Math.degrees method
	
	double  oppAngA = Math.toDegrees(arcosA);
	
	return oppAngA;
	
	}

//Write a method to compute the area of a Triangle to display all the information from the triangle. 

public static double areaTri(double sideA, double sideB, double sideC)
{
	double s = (sideA + sideB + sideC) / 2;
	double area = Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
	
	return area;
	
}


//write a method displayTriangle 
//This method should accept 3 points (x1, y1, x2, y2, x3, y3) and display in a specified format
//This method should call the previous methods above

public static void displayTriangle(double x1, double y1, double x2, double y2, double x3, double y3)
{
	
	//Use the distance method to calculate the length of each side
	
	double sideA = distance(x1, y1, x2, y2); //Calculate the length of the first side
	double sideB = distance(x2, y2, x3, y3); //Calculate the length of the second side
	double sideC = distance(x3, y3, x1, y1); //Calculate the length of the third side
	
	
	//Use the slope method to calculate the slope
	
	double slpA = slopeOfTri(x1, y1, x2, y2);
	double slpB = slopeOfTri(x2, y2, x3, y3);
	double slpC = slopeOfTri(x3, y3, x1, y1);
	
	
	//Use the opposite angle method to calculate the opposite angle
	double angleA = oppAngle(sideA, sideB, sideC);
	double angleB = oppAngle(sideB, sideA, sideC);
	double angleC = oppAngle(sideC, sideB, sideA);
	
	
	//use the area method to compute the area 
	double areaOfTri = areaTri(sideA, sideB, sideC);
	
	
	//Determine the perimeter by summing up the sum of the sides
	
	double length = sideA + sideB + sideC;  //Calculate the total length of the triangle 
	
	
	//determine if it is a right angle, acute or obtuse triangle
	
	String triType = " "; //empty string to capture the triangle type
	
	if ((angleA > 89.99 && angleA < 90.01) || (angleB > 89.99 && angleB < 90.01) || (angleC > 89.99 && angleC < 90.01))
		{triType = "right";} 
	
	else if ((angleA > 90.01) || (angleB > 90.01) || (angleC > 90.01))
	   {triType = "obtuse";}
	
	else triType = "acute";
	
	
	//display the output
	
	
	System.out.printf("          cordinates      length     slope   oppAngle\n");
	
	System.out.printf("(% 1.1f, % 1.1f) (% 1.1f, % 1.1f)      % 1.2f     % 1.2f  % 9.1f\n" 
			        + "(% 1.1f, % 1.1f) (% 1.1f, % 1.1f)      % 1.2f     % 1.2f  % 9.1f\n"
			        + "(% 1.1f, % 1.1f) (% 1.1f, % 1.1f)      % 1.2f     % 1.2f  % 9.1f\n" + "type: " + triType + "\n",
			        x1,  y1, x2, y2, sideA, slpA, angleA, x2,  y2, x3, y3, sideB, slpB, angleB,  x3,  y3, x1, y1, sideC, slpC, angleC);
   
	//System.out.println("Side A= " +  sideA);
	//System.out.println("Side B= " +  sideB);
	//System.out.println("Side C = " + sideC);

}

	public static void main(String[] args) {
		
		//System.out.println("The answer is");
		
		 displayTriangle(1.0, 1.0, -4.0, 4.0, 4.75, 4.5);
		

	}

}
