import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * public test for Ex2.
 * There are 6 tests for ClubMember.
 * @author zhouyanan
 *
 */

public class ClubMemberTest {
	private ClubMember c1;
	
	@Before 
	public void setUp() {
		c1 = new ClubMember("Yanan", "16 October 1980", "54321", "Gold");	
	}

	@Test
	public void test1() {
		assertEquals("Yanan", c1.getName());
		assertEquals("Gold", c1.getMembershipType());
	}
	
	@Test
	public void test2() {
		assertEquals("54321", c1.getRegistrationNumber());
		assertEquals("16 October 1980", c1.getDateOfBirth());	
	}

	@Test
	public void test3() {
		String expented = "[Yanan, 16 October 1980, ID: 54321, Gold]";
		assertEquals(expented, c1.toString());
	}
	
	@Test
	public void test4() {
		
		c1 = new ClubMember("Trump", "9 October 1960", "07721", "Gold");

		String extended = "[Trump, 9 October 1960, ID: 07721, Gold]";
		assertEquals(extended, c1.toString());
	}
	
	@Test
	public void test5() {
		
		c1 = new ClubMember("Vivian", "30 October 1989", "07721", "Silver");

		String extended = "[Vivian, 30 October 1989, ID: 07721, Silver]";
		assertEquals(extended, c1.toString());
	}
	
	@Test
	public void test6() {
		
		c1 = new ClubMember("Bran", "01 May 2009", "00001", "Silver");

		String extanded = "[Bran, 01 May 2009, ID: 00001, Silver]";
		assertEquals(extanded, c1.toString());
	}
}


