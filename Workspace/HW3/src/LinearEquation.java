//Solve a Linear equation using cramer's rule
public class LinearEquation {
	
	//define the variables
	private double a = 0;
	private double b = 0;
	private double c = 0;
	private double d = 0;
	private double e = 0;
	private double f = 0;
	
	
	//constructor method
	
	public LinearEquation(double a, double b, double c, double d, double e, double f){
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
		
		}
	
	
	
	//getter methods
	double getA(){
		return a;
	}
	
	double getB(){
		return b;
	}
	
	
	double getC(){
		return c;
	}
	
	double getD(){
		return d;
	}
	
	double getE(){
		return e;
	}
	
	double getF(){
		return f;
	}
	
	
	//isSolvable method
	
	boolean isSolvable(){
		if ((a*d) - (b*c)!=0)
			return true;
		
		return false;
	}
	
	//solve for x
	double getX(){
		double x = ((e * d) - (b * f)) / ((a * d) - (b * c));

		return x;
	}
		
	
	//solve for y
	double getY(){
		double y = ((a * f) - (e * c)) / ((a * d) - (b * c));
		return y;
	}
	
	
	//toString
	public String toString(){
		return "a is: " + getA() + "\nb is: " + getB() + "\nc is: " + getC() +
				"\nd is: " + getD() + "\ne is: " + getE() + "\nf is: " + getF() +
				"\nisSolvable ?: " + isSolvable() + "\nx is: " + getX() + "\ny is: " + getY(); 
				
	}
	

}
