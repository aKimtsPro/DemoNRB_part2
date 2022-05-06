package bstorm.akimts.oo.exceptions;

public class CapacityExceededException extends RuntimeException {

	private final int capacity;

	public CapacityExceededException(int capacity) {
		super("La capacité a été excédée, la capacité max est de : " + capacity);
		this.capacity = capacity;
	}

	public int getCapacity() {
		return capacity;
	}
	
}
