package bstorm.akimts.oo.exo.compet;

import java.time.LocalDate;

public class Athlete extends Sportif {

	public Athlete(String nom, LocalDate dateNaiss) {
		super(nom, dateNaiss);
	}

	@Override
	public int perform() {
		return (int)((Math.random() * 100) + 1);
	}

	@Override
	public boolean equals(Object obj) {
		if( this == obj ) return true;
		if( obj == null ) return false;
		
		return obj instanceof Athlete && 
			this.getNom().equals( ((Athlete)obj).getNom() ) && 
			this.getDateNaiss().equals( ((Athlete)obj).getDateNaiss() );
	}

	@Override
	public String toString() {
		return "Athlete [nom =" + getNom() + ", date de naissance=" + getDateNaiss() + "]";
	}
	
	
	

	
}
