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

	
}
