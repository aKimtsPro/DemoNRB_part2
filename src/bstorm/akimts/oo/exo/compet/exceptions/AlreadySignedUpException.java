package bstorm.akimts.oo.exo.compet.exceptions;

import bstorm.akimts.oo.exo.compet.Sportif;

public class AlreadySignedUpException extends RuntimeException {

	private final Sportif toSignUp;
	
	public AlreadySignedUpException(Sportif toSignUp) {
		super("Impossible d'inscrire {" + toSignUp + "} car il est déjà inscrit");
		this.toSignUp = toSignUp;
	}

	public Sportif getToSignUp() {
		return toSignUp;
	}
}
