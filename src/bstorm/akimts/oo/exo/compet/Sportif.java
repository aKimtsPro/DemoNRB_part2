package bstorm.akimts.oo.exo.compet;

import java.time.LocalDate;

public abstract class Sportif {
	
	private String nom;
	private LocalDate dateNaiss;
	
	public Sportif(String nom, LocalDate dateNaiss) {
		super();
		this.nom = nom;
		this.dateNaiss = dateNaiss;
	}
	
	
	public abstract int perform();
	

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public LocalDate getDateNaiss() {
		return dateNaiss;
	}

	public void setDateNaiss(LocalDate dateNaiss) {
		this.dateNaiss = dateNaiss;
	}
	
	
	
	

}
