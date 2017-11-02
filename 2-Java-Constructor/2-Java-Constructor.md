
### Classes
Classes can be considered as generalized types. Classes are general and can be user defined. 

### Objetcs / Constructor
Objects are elements of Classes.  
Formally in Java:  

	public class Date{  		private int    day;  	 	private String month; 		private int    year;

Firstly, we **declare the variables** we use in this class. Sometimes not.  
* `private`  means that the variable cannot be accessed from outside the class.
* As opposed to `public` which means that it can be accessed.
##### Constructor   
 		public Date (int day, String month, int year) {  			this.day = day;			this.month = month;			this.year = year; 		}
This **constructor** creates a date from the three parts:   *  @param day The day of the month  *  @param month The month in the year  *  @param year The year ##### Getter Methods
	public int getDay() {    	return day;    }
@return The day of a Date  
##### Setter Methods
	public void setDay(int newDay) {    	day = newDay;	}
sets the day of a Date.  @param newDay is the new day to which the day is set.
##### toString Methods
	public String toString() {    	return day + " " + month + " " + year;
	}
this method says how to print a date.  @return A String how the object is printed.

##### equals Methods

	public boolean equals(Date date) {    	return (this.getDay() == date.getDay()) && (this.getMonth().equals(date.getMonth())) && (this.getYear() == date.getYear());
	}
This method **checks whether the date is equal** to a second date.   @param date The second Date.  @return true if the current date (*this*) is equal to the date it  is compared to. 
e.g. (4 < 3 || 4 < 5) && 3 == 4 false  
e.g. "test"`.equals`("test") true