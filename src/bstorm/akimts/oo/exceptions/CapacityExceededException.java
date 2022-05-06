package bstorm.akimts.oo.exceptions;

public class CapacityExceededException extends RuntimeException {

	private final int capacity;

	public CapacityExceededException(int capacity) {
		super("La capacit� a �t� exc�d�e, la capacit� max est de : " + capacity);
		this.capacity = capacity;
	}

	public int getCapacity() {
		return capacity;
	}
	
}
