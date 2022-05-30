package bstorm.akimts.oo.exo.compet.amel;

import java.time.temporal.ChronoUnit;

public enum TypeCompet {
	
	PETIT(3, 10),
	MOYEN(3, 30),
	GRAND(3, 100);
	
	private final int minParticipant;
	private final int maxParticipant;
	
	private TypeCompet(int minParticipant, int maxParticipant) {
		this.minParticipant = minParticipant;
		this.maxParticipant = maxParticipant;
	}

	public int getMinParticipant() {
		return minParticipant;
	}

	public int getMaxParticipant() {
		return maxParticipant;
	}

}
