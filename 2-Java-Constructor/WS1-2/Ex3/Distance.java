
public class Distance {
	private double kilometres;
	
	/**
	 * This is the constructor of distance.
	 * @param kilometres A distance given in kilometers.
	 */
	
	public Distance (double kilometres) {
		this.kilometres = kilometres;
	}
	
	/**
	 * Now I'll use accesstor methods.
	 */
	
	/**
	 * @return Distance is represented as kilometres.
	 */
	
	public double getKilometres() {
		return kilometres;
	}
	
	/**
	 * @return Distance is represented as Miles.
	 */
	
	public double getMiles() {
		return kilometres / 1.60934;
	}

	/**
	 * @return Distance is represented as metres.
	 */
	
	public double getMetres() {
		return kilometres / 0.001;
	}
	
	/**
	 * @return Distance is represented as yards.
	 */
	
	public double getYards() {
		return (kilometres / 1.60934) * 1760;
	}	
}
