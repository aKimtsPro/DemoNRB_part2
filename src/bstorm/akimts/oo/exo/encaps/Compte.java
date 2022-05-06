package bstorm.akimts.oo.exo.encaps;

public class Compte {
	
	private final String numCompte;
	private Client proprietaire;
	private double solde;
	
	public Compte(String numCompte, Client proprietaire) {
		super();
		this.numCompte = numCompte;
		this.proprietaire = proprietaire;
	}
	
	public void retrait(double montant) {
		if(montant > 0)
			setSolde( solde - montant );
	}
	
	public void depot(double montant) {
		if(montant > 0)
			setSolde( solde + montant );
	}

	public Client getProprietaire() {
		return proprietaire;
	}

	public void setProprietaire(Client proprietaire) {
		this.proprietaire = proprietaire;
	}

	public double getSolde() {
		return solde;
	}

	private void setSolde(double solde) {
		this.solde = solde;
	}

	public String getNumCompte() {
		return numCompte;
	}
	
	

}
