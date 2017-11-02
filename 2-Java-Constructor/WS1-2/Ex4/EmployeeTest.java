import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * There are 6 texts for Ex4.
 * @author zhouyanan
 */

public class EmployeeTest {

	private Employee emp1;
	private final static double EPSILON = 1e-6;
	
	@Before 
	public void setUp() {
		emp1 = new Employee("Vivi", 8, 30);
	}

	@Test
	public void test1() {
		emp1.setNumberOfHours(40);
		
		String extended = "Vivi has an hourly salary of 8.0 \u00a3 and has worked last month for 40 hours.";
		assertEquals(extended, emp1.toString());
	}
	
	@Test
	public void test2() {
		emp1.setName("Tom");
		emp1.setHourlySalary(10);
		emp1.setNumberOfHours(40);

		assertEquals("Tom", emp1.getName());
		assertEquals(10, emp1.getHourlySalary(), EPSILON);
		assertEquals(40, emp1.getNumberOfHours());
	}

	@Test
	public void test3() {

		emp1.setHourlySalary(10);
		emp1.setNumberOfHours(40);

		assertEquals(320, emp1.monthlySalary(20), EPSILON);
	}
	
	@Test
	public void test4() {

		emp1.setHourlySalary(10);
		emp1.setNumberOfHours(20);
		emp1.increaseSalary(20);

		assertEquals(12, emp1.getHourlySalary(), EPSILON);

		String expected = "Vivi has an hourly salary of 12.0 \u00a3 and has worked last month for 20 hours.";
		assertEquals(expected, emp1.toString());
	}
	
	@Test
	public void test5() {
		emp1.increaseSalary(20);
		assertEquals(9.6, emp1.getHourlySalary(), EPSILON);
	}
	
	@Test
	public void test6() {

		emp1.setHourlySalary(0);
		emp1.setNumberOfHours(0);

		emp1.increaseSalary(0);
		emp1.increaseSalary(0);
		assertEquals(0.0, emp1.monthlySalary(0), EPSILON);

		String expected = "Vivi has an hourly salary of 0.0 \u00a3 and has worked last month for 0 hours.";

		assertEquals(expected, emp1.toString());

	}
}
