package bstorm.akimts.oo;

import java.util.ArrayList;
import java.util.List;

public class Entreprise {
	
	String nom;
	String numeroTVA;
	String adresse;
	List<Employe> employes = new ArrayList<>();
	
	void engager(Employe employe) {
		if( !employes.contains(employe))
			employes.add(employe);
	}
	

}
