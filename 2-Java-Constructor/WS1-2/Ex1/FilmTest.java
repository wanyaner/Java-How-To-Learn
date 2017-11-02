import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;


/**
 * public tests for Ex1.
 * There are 6 tests for Film.
 * @author zhouyanan
 */

public class FilmTest {
	private Film film1;
	
	@Before 
	public void setUp() {
		film1 = new Film("Tango", 1998, 88);
	}
	
	@Test
	public void test1() {
		film1.setLength(6);
		
		assertEquals("Tango", film1.getTitle());
		assertEquals(1998, film1.getYear());
		assertEquals(6, film1.getLength());
	}

	@Test
	public void test2() {
		film1.setLength(11);
		
		assertEquals("Tango", film1.getTitle());
		assertEquals(1998, film1.getYear());
		assertEquals(11, film1.getLength());
	}
	
	@Test
	public void test3() {
		film1.setLength(55);
		
		assertEquals("Tango", film1.getTitle());
		assertEquals(1998, film1.getYear());
		assertEquals(55, film1.getLength());
	}
	
	@Test
	public void test4() {
		film1.setLength(67);
		
		assertEquals("Tango", film1.getTitle());
		assertEquals(1998, film1.getYear());
		assertEquals(67, film1.getLength());
	}
	
	@Test
	public void test5() {
		film1.setLength(74);
		
		assertEquals("Tango", film1.getTitle());
		assertEquals(1998, film1.getYear());
		assertEquals(74, film1.getLength());
	}
	
	@Test
	public void test6() {
		film1.setLength(80);
		
		assertEquals("Tango", film1.getTitle());
		assertEquals(1998, film1.getYear());
		assertEquals(80, film1.getLength());
	}
}