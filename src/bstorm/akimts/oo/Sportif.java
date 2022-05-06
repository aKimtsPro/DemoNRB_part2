package bstorm.akimts.oo;

public class Sportif extends Personne {

	private Sport sport;

	public Sportif(String nom, String prenom, String dateNaissance) {
		super(nom, prenom, dateNaissance);
		// this.sport = sport;
	}

	public Sport getSport() {
		return sport;
	}

	public void setSport(Sport sport) {
		this.sport = sport;
	}

	@Override
	public void manger() {
		System.out.println("Je mange comme un sportif");
	}
	
	// Signature type/ordre param - nom - Classe
	public void saluer(Personne p) {
		System.out.println("Bonjour " + p.getPrenom());
		super.saluer();
	}
	
	protected String saluer(Personne p, boolean b) {
		return "salut";
	}
	
	
	public static class Sport {
		
		private String nom;
		private boolean olympique;
		public Sport(String nom, boolean olympique) {
			super();
			this.nom = nom;
			this.olympique = olympique;
		}
		public String getNom() {
			return nom;
		}
		public void setNom(String nom) {
			this.nom = nom;
		}
		public boolean isOlympique() {
			return olympique;
		}
		public void setOlympique(boolean olympique) {
			this.olympique = olympique;
		}
		
	}
	
	
	
}
