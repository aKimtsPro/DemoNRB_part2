package bstorm.akimts.oo.exceptions;

public class NotEnoughParticipantsException extends RuntimeException {

	private final int nbrParticipants;
	
	public NotEnoughParticipantsException(int nbrParticipants) {
		super( "Pas assez de participants pour lancer la compétition ("+ nbrParticipants+"/3min)" );
		this.nbrParticipants = nbrParticipants;
	}

	public int getNbrParticipants() {
		return nbrParticipants;
	}
	
}
