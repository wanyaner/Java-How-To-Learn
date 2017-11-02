/**
 * The variable A and r are declared as double and A is computed
 * from r as Math.PI * r * r and printed suitably.
 */
 
public class Circle {

	 /** 
     *  The methods computes the area of a circle.
     *  @param r The radius of the circle.
     *  @return The area of the circle with radius r. 
     */
	public static double area(double r){
		return Math.PI*r*r;
	}
	public static void printArea(double r){
		System.out.println("The area A is " + area(r));
	}
	public static void main(String[] args){
		printArea(5);
	}
}
