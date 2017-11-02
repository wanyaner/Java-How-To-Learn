
public class ClubMember {
	private String name;
	private String dateOfBirth;
	private String registrationNumber;
	private String membershipType;
	
	/**
	 * This is constructor creates a ClubMember from the following parts: 
	 * @param name The club member's name.
	 * @param dateOfBirth The club member's birthday.
	 * @param registrationNumber The club member's registration number;
	 * @param membershipType The club member's membership type.
	 * All the variables are represented as string.
	 */
	
	public ClubMember (String name,
					  String dateOfBirth,
					  String registrationNumber,
					  String membershipType) {
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.registrationNumber = registrationNumber;
		this.membershipType = membershipType;
	}
	
	/**
	 * Now I use accessor methods.
	 */
	
	/**
	 * @return The club member's name.
	 */
	
	public String getName() {
		return name;
	}
	
	/**
	 * @return The club member's birthday.
	 */
	
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	
	/**
	 * @return The club member's registration number.
	 */
	
	public String getRegistrationNumber() {
		return registrationNumber;
	}
	
	/**
	 * @return The club member's membership type.
	 */
	
	public String getMembershipType() {
		return membershipType;
	}
	
	/**
	 * Now I use toString methods to print.
	 */
	
	public String toString() {
	return "[" + name + ", " + dateOfBirth + ", ID: " + registrationNumber + ", " + membershipType + "]";
	}
}
