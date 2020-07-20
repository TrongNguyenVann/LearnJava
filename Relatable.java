
public interface Relatable {
	
	/**
	 * Return 1, 0 or -1 if caller object is larger, equal or smaller than other object
	 */
	public int isLargerThan(Relatable other);

	default void defaultMethod() {
		System.out.println("This is default method");
	}
}