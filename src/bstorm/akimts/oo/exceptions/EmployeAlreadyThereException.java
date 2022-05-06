package bstorm.akimts.oo.exceptions;

public class EmployeAlreadyThereException extends RuntimeException {

	public EmployeAlreadyThereException() {
		super("L'employé est déjà là");
	}
	
}
