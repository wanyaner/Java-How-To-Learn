
/**
 * This class represents complex numbers, and defines methods for performing
 * arithmetic on complex numbers.
 */

public class Complex {
	private double a;
	private double b;
	
	/**
	 * This is constructor creates complex numbers.
	 * @param a Variable a changed with the real() method.
	 * @param b Variable b changed with the imaginary() method.
	 */
	
	public Complex(double real,
				   double imaginary) {
		this.a = real;
		this.b = imaginary;
	}
	
	/**
	 * Now is the getters.
	 * 
	 * @return the real part of the complex number.
	 */
	
	public double getRealPart() {
		return a;
	}
	
	/**
	 * @return the imaginary part of the complex number.
	 */
	
	public double getImaginaryPart() {
		return b;
	}
	
	/**
	 * Now toString to print the complex number.
	 * @return A string representation of the complex number.
	 */
	
	public String toString() {
		return a + " + " + b + "i";
	}
	
	/**
	 * This is add method.
	 * @return a new complex number which value is (this + summand).
	 */
	
	public Complex add(Complex summand) {
		Complex a = this;
		double real = a.getRealPart() + summand.getRealPart();
		double imaginary = a.getImaginaryPart() + summand.getImaginaryPart();
		return new Complex(real, imaginary);
	}
	
	/**
	 * This is multiply method.
	 * @return a new complex number which value is 
	 */
	
	public Complex multiply(Complex factor) {
		Complex a = this;
		double real = a.getRealPart() * factor.getRealPart() - a.getImaginaryPart() * factor.getImaginaryPart();
		double imaginary = a.getRealPart() * factor.getImaginaryPart() + a.getImaginaryPart() * factor.getRealPart();
		return new Complex(real, imaginary);
	}
}
