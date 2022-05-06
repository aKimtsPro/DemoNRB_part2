package bstorm.akimts.oo;

public abstract class Personne {

	private String nom;
	private String prenom;
	private String dateNaissance;
	
	public Personne(String nom, String prenom, String dateNaissance) {
		// super();
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
	}
	
	public void saluer() {
		System.out.println("Bonjour je suis " + this.getPrenom() + " " + getNom());
	}
	
	public abstract void manger();
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	
}
