package bstorm.akimts.oo.exo.encaps;

public class Compte {
	
	private final String numCompte;
	private Client proprietaire;
	private double ligneCredit;
	private double solde;
	
	public Compte(String numCompte, Client proprietaire) {
		super();
		this.numCompte = numCompte;
		this.proprietaire = proprietaire;
	}

	public Compte(String numCompte, Client proprietaire, double ligneCredit) {
		super();
		this.numCompte = numCompte;
		this.proprietaire = proprietaire;
		setLigneCredit(ligneCredit);
	}
	
	
	public void retrait(double montant) {
		if(montant > 0)
			setSolde( solde - montant );
	}
	
	public void depot(double montant) {
		if(montant > 0)
			setSolde( solde + montant );
	}

	public String getNumCompte() {
		return numCompte;
	}

	public Client getProprietaire() {
		return proprietaire;
	}

	public void setProprietaire(Client proprietaire) {
		this.proprietaire = proprietaire;
	}

	public double getLigneCredit() {
		return ligneCredit;
	}

	public void setLigneCredit(double ligneCredit) {
		if( ligneCredit >= 0 )
			this.ligneCredit = ligneCredit;
	}

	public double getSolde() {
		return solde;
	}

	private void setSolde(double solde) {
		if( solde >= -ligneCredit )
			this.solde = solde;
	}

}
