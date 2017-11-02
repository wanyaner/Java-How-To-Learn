import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * There are 6 texts for Ex3.
 * @author zhouyanan
 *
 */

public class DistanceTest {
	private Distance d1, d2;
	
	@Before
	public void setUp() {
		d1 = new Distance(4.0);
		d2 = new Distance(3.1);
	}

	@Test
	public void test1() {
		double expected = 4.0;
		assertEquals(expected, d1.getKilometres(), 0.00000001);
	}

	@Test
	public void test2() {
		double expected = 2.48549095;
		assertEquals(expected, d1.getMiles(), 0.00000001);
	}

	@Test
	public void test3() {

		double expected = 4000;
		assertEquals(expected, d1.getMetres(), 0.000001);
	}

	@Test
	public void test4() {

		double expected = 4374.46406601464;
		assertEquals(expected, d1.getYards(),  0.000001);
	}

	@Test
	public void test5() {

		double expected = 3100;
		assertEquals(expected, d2.getMetres(), 0.000001);
	}

	@Test
	public void test6() {

		double expected = 1.92625548;
		assertEquals(expected, d2.getMiles(),  0.000001);
	}

}
