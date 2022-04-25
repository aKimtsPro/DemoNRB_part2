package bstorm.akimts.oo;

public class Employe extends Personne {
	
	private double salaire;
	int nbrAcces = 0;
	
	public Employe(){
		super("inconnu", "inconnu", "inconnu");
	}
	
	Employe(String nom, String prenom){
		super(nom, prenom, null);
	}
	
	@Override
	public void saluer() {
		super.saluer();
		System.out.println("Je suis employé");
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

}
