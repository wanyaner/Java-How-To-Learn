public class Capital {
	public static void main(String args[] ) {
		double capital = 100;
		int year = 5;
		double rate = 2.3 * 0.01;
		
		System.out.println("The balance after each of the first " + year + " years are:");
		
		for(int x = 1; x<= year; x++) {
			double total = capital * Math.pow(1 + rate, x);
			System.out.println("Year " + x + ": " + total);
		}
		
		double y = 500;
		double total5 = capital * Math.pow(1 + rate, y);
		System.out.println("The balance after 500 years is: " + total5);
	}
}
		