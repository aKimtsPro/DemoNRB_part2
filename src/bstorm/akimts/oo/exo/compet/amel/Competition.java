package bstorm.akimts.oo.exo.compet.amel;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import bstorm.akimts.oo.exo.compet.Sportif;


public class Competition<T extends Sportif> {
	
	private String nom;
	private final int capaMax;
	private final Map<T, Performance<T>> participants = new HashMap<>();
	private Podium podium = null;
	
	
	public Competition(String nom, int capaMax) {
		super();
		this.setNom(nom);
		this.capaMax = capaMax < 3 ? 3 : capaMax;
	}
	
	public Competition(String nom, int capaMax, Collection<T> participants) {
		this(nom, capaMax);
		for (T t : participants) {
			this.participants.put(t, null);
		}
	}

	public boolean inscrire( T aInscrire ) {
		if( !estTerminee() && participants.size() < capaMax && !participants.containsKey(aInscrire) ) {
			participants.put(aInscrire, null);
			return true;
		}	
		return false;
	}
	
	public boolean desinscrire( T aDesinscrire ) {
		if( !estTerminee() && participants.containsKey(aDesinscrire) ) {
			participants.remove(aDesinscrire);
			return true;
		}
		return false;
	}
	
	public Performance<T> perfDe(T sportif) {
		return participants.get(sportif);
	}
	
	public boolean estTerminee() {
		return podium != null;
	}
	
	public boolean terminer() {
		if( estTerminee() )
			return false;
		
		Performance<T>[] top3perf = new Performance[3];
		
		for(T s : participants.keySet()) {
			Performance<T> perf = new Performance<>(s, s.perform());
			participants.put(s, perf);
			
			if( perf.compareTo(top3perf[0]) > 0 ) {
				top3perf[2] = top3perf[1];
				top3perf[1] = top3perf[0];
				top3perf[0] = perf;
			}
			else if (perf.compareTo(top3perf[1]) > 0) {
				top3perf[2] = top3perf[1];
				top3perf[1] = perf;
			}
			else if (perf.compareTo(top3perf[2]) > 0) {
				top3perf[2] = perf;
			}
		}
		
		this.podium = new Podium(top3perf[0], top3perf[1], top3perf[2]);
		return true;
	}

	public Podium getPodium() {
		return podium;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getCapaMax() {
		return capaMax;
	}

	public class Podium {
		
		private final Performance<T> or;
		private final Performance<T> argent;
		private final Performance<T> bronze;
		
		public Podium(Performance<T> or, Performance<T> argent, Performance<T> bronze) {
			super();
			this.or = or;
			this.argent = argent;
			this.bronze = bronze;
		}

		public Performance<T> getOr() {
			return or;
		}

		public Performance<T> getArgent() {
			return argent;
		}

		public Performance<T> getBronze() {
			return bronze;
		}
		
	}

}

