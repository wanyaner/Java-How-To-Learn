
/**
 * The sum of two rational numbers can be computed as e1/d1 + e2/d2 = (e1*d2 +
 * e2*d1) / (d1*d2) the product as e1/d1 * e2/d2 = (e1*e2)/(d1*d2). 
 */
 
public class Fractions {

	public static void a(int es,int ds,int ep,int dp) {
		int x1 = es * dp + ep * ds;
		int y1 = ds * dp;
		System.out.println("The result is " + x1 + " / " + y1);
	}
	
	public static void b(int es,int ds,int ep,int dp) {
		int x2 = es * ep ;
		int y2 = ds * dp;
		System.out.println("The result is " + x2 + " / " + y2);
	}
	
	public static void main(String argo[] ) {
		a(1,2,1,3);
		a(1,3,3,4);
		b(1,2,2,3);
		b(1,4,2,3);
	}
}