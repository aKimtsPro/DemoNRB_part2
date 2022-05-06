package bstorm.akimts.oo.exo.compet;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Competition<T extends Sportif> {
	
	private String nom;
	private final int capaMax;
	private final Set<T> participants = new HashSet<>();
	private Podium podium = null;
	
	public Competition(String nom, int capaMax) {
		super();
		this.nom = nom;
		this.capaMax = capaMax < 3 ? 3 : capaMax;
	}
	
	public Competition(String nom, int capaMax, Collection<T> participants) {
		this(nom, capaMax);
		this.participants.addAll(participants);
	}

	public boolean inscrire( T aInscrire ) {
		if( !estTerminee() && participants.size() < capaMax )
			return participants.add(aInscrire);
		
		return false;
	}
	
	public boolean desinscrire( T aDesinscrire ) {
		if( !estTerminee() )
			return participants.remove(aDesinscrire);
		
		return false;
	}
	
	public boolean estTerminee() {
		return podium != null;
	}
	
	public boolean terminer() {
		if( estTerminee() )
			return false;
		
		Sportif[] top3 = new Sportif[3];
		int[] top3perf = new int[3];
		
		for(T s : participants) {
			int perf = s.perform();
			System.out.println( s.getNom() + " - " + perf );
			if( perf > top3perf[0] ) {
				top3perf[2] = top3perf[1];
				top3[2] = top3[1];
				top3perf[1] = top3perf[0];
				top3[1] = top3[0];
				top3perf[0] = perf;
				top3[0] = s;
			}
			else if( perf > top3perf[1] ) {
				top3perf[2] = top3perf[1];
				top3[2] = top3[1];
				top3perf[1] = perf;
				top3[1] = s;
			}
			else if( perf > top3perf[2] ) {
				top3perf[2] = perf;
				top3[2] = s;
			}
		}
		
		this.podium = new Podium((T)top3[0], (T)top3[1], (T)top3[2]);
		return true;
	}

	public Podium getPodium() {
		return podium;
	}

	public class Podium {
		
		private final T or;
		private final T argent;
		private final T bronze;
		
		public Podium(T or, T argent, T bronze) {
			super();
			this.or = or;
			this.argent = argent;
			this.bronze = bronze;
		}

		public T getOr() {
			return or;
		}

		public T getArgent() {
			return argent;
		}

		public T getBronze() {
			return bronze;
		}
		
	}

}
