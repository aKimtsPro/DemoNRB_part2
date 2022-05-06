package bstorm.akimts.oo;

import java.util.ArrayList;
import java.util.List;

import bstorm.akimts.oo.exceptions.CapacityExceededException;
import bstorm.akimts.oo.exceptions.EmployeAlreadyThereException;

public class Entreprise {
	
	private String nom;
	private String numeroTVA;
	private String adresse;
	private int capaMax = 1;
	private List<Employe> employes = new ArrayList<>();
	
	private static final int tva = 21;
	
	void engager(Employe employe){
		if( capaMax == employes.size() )
			throw new CapacityExceededException(capaMax);
			
		if( employes.contains(employe) )
			throw new EmployeAlreadyThereException();
			
		employes.add(employe);
	}
	
	public int getCapaMax() {
		return capaMax;
	}
	
	
	public static double calculateTTC(double montant) {
		return  montant * (100+tva) / 100;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getNumeroTVA() {
		return numeroTVA;
	}

	public void setNumeroTVA(String numeroTVA) {
		this.numeroTVA = numeroTVA;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public List<Employe> getEmployes() {
		return new ArrayList<>(employes) ;
	}
	
	

}
