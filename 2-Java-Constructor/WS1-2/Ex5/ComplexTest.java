import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * There are 6 texts for Ex5.
 * @author zhouyanan
 */

public class ComplexTest {
	private Complex c1, c2;
	private final static double EPSILON = 1e-6;
	
	@Before 
	public void setUp() {
		c1 = new Complex(2,4);
		c2 = new Complex(4,6);
	}
	
	@Test
	public void test1() {
		assertEquals(2, c1.getRealPart(), EPSILON);
		assertEquals(6, c2.getImaginaryPart(), EPSILON);
	}
	
	@Test
	public void test2() {
		String extended = "2.0 + 4.0i";
		assertEquals(extended, c1.toString());
	}
	
	@Test
	public void test3() {
		Complex c3 = c1.add(c2);
		assertEquals(6, c3.getRealPart(), EPSILON);
		assertEquals(10, c3.getImaginaryPart(), EPSILON);
	}
	
	@Test
	public void test4() {
		Complex c3 = c1.multiply(c2);
		assertEquals(-16, c3.getRealPart(), EPSILON);
		assertEquals(28, c3.getImaginaryPart(), EPSILON);
	}
	
	@Test
	public void test5() {
		Complex c3 = c1.add(c2);
		String extended = "6.0 + 10.0i";
		assertEquals(extended, c3.toString());
	}
	@Test
	public void test6() {
		Complex c3 = c1.multiply(c2);
		String extended = "-16.0 + 28.0i";
		assertEquals(extended, c3.toString());
	}

}
