package bstorm.akimts.oo.exo.compet.exceptions;

import bstorm.akimts.oo.exo.compet.amel.CompetStatus;

public class CompetitionInvalidStateException extends RuntimeException {
	
	private final CompetStatus currentState;
	
	public CompetitionInvalidStateException(CompetStatus currentState) {
		super("Action impossible quand la comp�tition est dans l'�tat {" + currentState +"}");
		this.currentState = currentState;
	}

	public CompetStatus getCurrentState() {
		return currentState;
	}

}
