package bstorm.akimts.oo;

import bstorm.akimts.oo.interfaces.Travailleur;

public class Employe extends Personne implements Travailleur {
	
	private double salaire;
	int nbrAcces = 0;
	
	public Employe(){
		super("inconnu", "inconnu", "inconnu");
	}
	
	Employe(String nom, String prenom){
		super(nom, prenom, null);
	}
	
//	@Override
//	public void saluer() {
//		super.saluer();
//		System.out.println("Je suis employé");
//	}
	
	@Override
	public void manger() {
		System.out.println("Je mange comme un employe");
	}

	public double getSalaire() {
		nbrAcces++;
		return salaire;
	}
	
	protected void setSalaire(double salaire) {
		if( salaire > 0 ) {
			this.salaire = salaire;
		}
	}
	
	int getNbrAcces() {
		return this.nbrAcces;
	}

	@Override
	public void travailler() {
		System.out.println("L'employe travaille");
	}
}
