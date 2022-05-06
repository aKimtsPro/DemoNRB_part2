package bstorm.akimts.oo.exo.encaps;

import java.time.LocalDateTime;

public class CompteEpargne extends Compte {

	private LocalDateTime dateDernierRetrait;

	public CompteEpargne(String numCompte, Client proprietaire) {
		super(numCompte, proprietaire);
	}
	
	@Override
	public void retrait(double montant) {
		if( getSolde() - montant >= 0  ) {
			super.retrait(montant);
			dateDernierRetrait = LocalDateTime.now();
		}
	}

	public LocalDateTime getDateDernierRetrait() {
		return dateDernierRetrait;
	}

	private void setDateDernierRetrait(LocalDateTime dateDernierRetrait) {
		this.dateDernierRetrait = dateDernierRetrait;
	}
}
