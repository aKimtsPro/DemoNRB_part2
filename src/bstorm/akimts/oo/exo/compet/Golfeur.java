package bstorm.akimts.oo.exo.compet;

import java.time.LocalDate;

public class Golfeur extends Sportif{
	
	private int anneeExp;

	public Golfeur(String nom, LocalDate dateNaiss,int anneeExp) {
		super(nom, dateNaiss);
		this.anneeExp = anneeExp;
	}

	@Override
	public int perform() {
		return anneeExp + (int)( (Math.random()*60)+1 );
	}
	
	public int getAnneeExp() {
		return anneeExp;
	}

	public void setAnneeExp(int anneeExp) {
		this.anneeExp = anneeExp;
	}


}
