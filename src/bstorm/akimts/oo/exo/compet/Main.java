package bstorm.akimts.oo.exo.compet;

import java.time.LocalDate;

public class Main {
	
	public static void main(String[] args) {
		
		Competition<Athlete> compet = new Competition<>("golf cup", 10);
		compet.inscrire(new Athlete("a", LocalDate.now()));
		compet.inscrire(new Athlete("b", LocalDate.now()));
		compet.inscrire(new Athlete("c", LocalDate.now()));
		compet.inscrire(new Athlete("e", LocalDate.now()));
		compet.inscrire(new Athlete("f", LocalDate.now()));
		compet.inscrire(new Athlete("g", LocalDate.now()));
		compet.inscrire(new Athlete("h", LocalDate.now()));
		compet.inscrire(new Athlete("i", LocalDate.now()));
		compet.terminer();
		
		System.out.println( compet.getPodium().getOr().getNom() );
		System.out.println( compet.getPodium().getArgent().getNom() );
		System.out.println( compet.getPodium().getBronze().getNom() );
		
	}

}
