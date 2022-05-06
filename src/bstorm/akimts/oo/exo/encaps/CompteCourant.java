package bstorm.akimts.oo.exo.encaps;

public class CompteCourant extends Compte {
	
	private double ligneCredit;
	
	public CompteCourant(String numCompte, Client proprietaire) {
		super(numCompte, proprietaire);
	}

	public CompteCourant(String numCompte, Client proprietaire, double ligneCredit) {
		super(numCompte, proprietaire);
		setLigneCredit(ligneCredit);
	}
	
	
	@Override
	public void retrait(double montant) {
		if( getSolde() - montant >= -ligneCredit )
			super.retrait(montant);
	}


	public double getLigneCredit() {
		return ligneCredit;
	}

	public void setLigneCredit(double ligneCredit) {
		if( ligneCredit >= 0 )
			this.ligneCredit = ligneCredit;
	}


}
