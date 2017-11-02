/**
 * A minute has 60 seconds, that is, the proportion of seconds divided by 60.0
 * will give the corresponding minutes. Likewise an hour has 60 minutes, that
 * is, the minutes divided by 60.0 gives parts of an hour.
 */

public class Clock {
	public static void angle(int h,int m) {
		/** h means hours, between 0-12
		 *  m means minutes, between 0-59
		 */
		 
		double hangle = 0.5 * (h * 60 + m);
		double mangle = 6 * m;
		double angle = Math.abs(mangle - hangle);
		
		/** hour hand moves 0.5 degree per minute
		 *  minute hand moves 6 degree per minute
		 *  one clock cycle is 360 degree
		 *  counterclockwise angle is from hour hand to minute hand
		 *  this condition is applied for mangle > hangle 
		 */
	
		System.out.println("The clock angle is " + angle);
	}
	
		public static void angle2(int h,int m) {
		/** it is another condition when mangle < hangle
		 */ 
		double hangle = 0.5 * (h * 60 + m);
		double mangle = 6 * m;
		double angle2 = 360 - Math.abs(mangle - hangle);
		/** when mangle < hangle, angle = 360 - angle
		 */
	
		System.out.println("The clock angle is " + angle2);
	}
		
	public static void main(String[] args) {
		angle(9,0);
		angle(3,0);
		angle(6,0);
		angle(1,0);
		angle2(2,30);
		angle2(4,41);
	}
}
		   