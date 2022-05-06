package bstorm.akimts.oo.exo.compet.amel;

import bstorm.akimts.oo.exo.compet.Sportif;

public class Performance<T extends Sportif> implements Comparable<Performance<T>>{
	
	private final T sportif;
	private final int perf;
	
	public Performance(T sportif, int perf) {
		super();
		this.sportif = sportif;
		this.perf = perf;
	}
	
	public T getSportif() {
		return sportif;
	}
	public int getPerf() {
		return perf;
	}

	@Override
	public int compareTo(Performance<T> o) {
		return this.perf - o.perf;
	}
	
	

}
