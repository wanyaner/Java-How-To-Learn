
public class Employee {
	private String name;
	private double hourlySalary;
	private int numberOfHours;
	
	/**
	 * This is constructor creates employee's information from the three parts: 
	 * @param name The employee's name as string.
	 * @param hourlySalary The employee's salary per hour.
	 * @param numberOfHours The employee's working hours, shown as int.
	 */
	
	public Employee (String name,
					double hourlySalary,
					int numberOfhours) {
		this.name = name;
		this.hourlySalary = hourlySalary;
		this.numberOfHours = numberOfHours;
	}

	/**
	 * Now I use getter methods.
	 */
	
	/**
	 * @return The employee's name.
	 */
	
	public String getName() {
		return name;
	}
	
	/**
	 * @return The employee's salary/hour.
	 */
	
	public double getHourlySalary() {
		return hourlySalary;
	}
	
	/**
	 * @return The employee's working hours.
	 */
	
	public int getNumberOfHours() {
		return numberOfHours;
	}
	
	/**
	 * Now I use setter methods.
	 */
	
	/**
	 * @param newName The employee's new name.
	 */
	
	public void setName(String newName) {
		name = newName;
	}
	
	/**
	 * @param newHourlySalary The employee's new salary/h.
	 */
	
	public void setHourlySalary(double newHourlySalary) {
		hourlySalary = newHourlySalary;
	}
	
	/**
	 * @param newNumberOfHours The employee's new working hours.
	 */
	
	public void setNumberOfHours(int newNumberOfHours) {
		numberOfHours = newNumberOfHours;
	}
	
	/**
	 * toString methods define how to print the employee's information.
	 * 
	 * @return the employee's information to print.
	 */
	
	public String toString() {
		return name + " has an hourly salary of " + hourlySalary + " £ and has worked last month for " + numberOfHours + " hours.";
	}
	
	/**
	 * Now I set monthly salary.
	 * 
	 * @param monthlySalary The employee's monthly salary.
	 * @param taxRate The tax computed at a fixed tax rate.
	 * @return the employee's monthly salary as changed with fixed variables.
	 */
	
	public double monthlySalary(double taxRate) {
		return hourlySalary * numberOfHours * (1 - taxRate * 0.01);
	}
	
	/**
	 * Now I set increase salary.
	 * 
	 * @param increaseSalary The increase of employee's hourly salary.
	 * @param percentage The percentage of increased hourly salary.
	 * @return the employee's increased hourly salary as changed with increased percentage.
	 */
	
	public void increaseSalary(double percentage) {
		setHourlySalary(getHourlySalary() * (1 + percentage * 0.01));
	}
}
