package bstorm.akimts.oo.exo.compet.amel;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import bstorm.akimts.oo.exceptions.CapacityExceededException;
import bstorm.akimts.oo.exceptions.NotEnoughParticipantsException;
import bstorm.akimts.oo.exo.compet.Sportif;
import bstorm.akimts.oo.exo.compet.exceptions.AlreadySignedUpException;
import bstorm.akimts.oo.exo.compet.exceptions.CompetitionInvalidStateException;


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
	
	public Competition(String nom, TypeCompet type) {
		this.setNom(nom);
		this.capaMax = type.getMaxParticipant();
	}
	
	public Competition(String nom, int capaMax, Collection<T> participants) {
		this(nom, capaMax);
		for (T t : participants) {
			this.participants.put(t, null);
		}
	}

	public void inscrire( T aInscrire ) {
		
		if( estTerminee() ) 
			throw new CompetitionInvalidStateException(CompetStatus.TERMINE);
		
		if( participants.size() >= capaMax )
			throw new CapacityExceededException(capaMax);

		if( participants.keySet().contains(aInscrire) )
			throw new AlreadySignedUpException(aInscrire);
		
		participants.put(aInscrire, null);
	}
	
	public boolean desinscrire( T aDesinscrire ) {

		if( estTerminee() ) 
			throw new CompetitionInvalidStateException(CompetStatus.TERMINE);
		
		if( participants.containsKey(aDesinscrire) ) {
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
			throw new CompetitionInvalidStateException(CompetStatus.TERMINE);
		
		int size = participants.size();
		if( size < 0 ) // TODO retirer
			throw new NotEnoughParticipantsException(size);
		
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
		if( !estTerminee() ) 
			throw new CompetitionInvalidStateException(CompetStatus.EN_COURS);
		
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
	
	public int getNbrInscrits() {
		return participants.size();
	}
	
	public List<T> getParticipants() {
		return List.copyOf( participants.keySet() );
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

