
/**
 * In order to practice getter, setter, toString, this class uses these methods.
 */

public class Film {
	private String title;
	private int year;
	private int length;
	
	/**
	 * This is constructor creates a film from the three parts: 
	 * title(string), year(int), the length of string(int).
	 * @param title The title as string.
	 * @param year The year such as 2017.
	 * @param length The length of types, shown as int.
	 */

	public Film (String title,
				int year,
				int length) {
		this.title = title;
		this.year = year;
		this.length = length;
	}
	
	/**
	 * Now I use accessor methods.
	 */
	
	/**
	 * @return The title of the film.
	 */
	
	public String getTitle() {
		return title;
	}
	
	/**
	 * @return The year of the film.
	 */
	
	public int getYear() {
		return year;
	}
	
	/**
	 * @return The length of the types.
	 */
	
	public int getLength() {
		return length;
	}
	
	/**
	 * Now I use setters methods.
	 */
	
	/**
	 * @param newLength The length is set to newLength.
	 */
	
	public void setLength(int newLength) {
		length = newLength;
	}
	
	/**
	 * Now I use toString methods to print the film.
	 */
	
	public String toString() {
	return title + " " + year + " " + length;
	}
}
