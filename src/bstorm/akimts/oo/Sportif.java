package bstorm.akimts.oo;

public class Sportif extends Personne {

	private String sport;

	public Sportif(String nom, String prenom, String dateNaissance, String sport) {
		super(nom, prenom, dateNaissance);
		this.sport = sport;
	}

	public String getSport() {
		return sport;
	}

	public void setSport(String sport) {
		this.sport = sport;
	}
	
}
