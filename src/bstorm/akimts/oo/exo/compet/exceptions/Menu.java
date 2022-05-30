package bstorm.akimts.oo.exo.compet.exceptions;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import bstorm.akimts.oo.exceptions.NotEnoughParticipantsException;
import bstorm.akimts.oo.exo.compet.Athlete;
import bstorm.akimts.oo.exo.compet.amel.Competition;

public class Menu {
	
	private final Scanner sc = new Scanner(System.in);
	private Competition<Athlete> competition;
	
	public void start() {
		welcomeSetup();
		
		int choice = -1;
		do {
			try {
				displayMenu();
				choice = promptChoice();
				mapChoice(choice);
			}catch(Exception e) {
				e.printStackTrace();
				System.out.println("Une exception inattendu s'est produite");
			}
		} while(choice != 5);
		
		byeTearDown();
	}
	
	private void welcomeSetup() {
		System.out.println("Bonjour, et bienvenue sur notre application de gestion de compétition");
		System.out.println("Veuillez entrer le nom de la compétition:");
		String nom = sc.nextLine();
		System.out.println("Veuillez entrer la capacité maximum de la compétition:");
		int capa = promptInteger(3);
		
		competition = new Competition<>(nom, capa); 
	}
	private void byeTearDown() {
		System.out.println("Au revoir!");
		sc.close();
	}
	
	private void displayMenu() {
		System.out.println("--- Menu ---");
		System.out.println("1 - inscrire");
		System.out.println("2 - annuler inscription");
		System.out.println("3 - terminer la competition");
		System.out.println("4 - afficher le podium");
		System.out.println("5 - quitter");
	}
	private int promptChoice() {
		System.out.println("Votre choix: ");
		return promptInteger(1,5);
	}
	private void mapChoice(int choice) {
		switch(choice) {
		case 1:
			addParticipant();
			break;
		case 2:
			deleteParticipant();
			break;
		case 3:
			finish();
			break;
		case 4:
			displayPodium();
			break;
		case 5:
			// quitter
			break;
		}
	}
	
	private void addParticipant() {
		
		if( competition.getNbrInscrits() >= competition.getCapaMax() ) {
			System.out.println("La compétition est déjà complete, impossible d'inscrire");
			return;
		}
		
		if( competition.estTerminee() ) {
			System.out.println("La compétition est terminée, impossible d'inscrire");
			return;
		}
		
		System.out.print("> nom : ");
		String nom = sc.nextLine();
		System.out.println("> date de naissance:");
		System.out.println("JOUR");
		int jour = promptInteger(1,31);
		System.out.println("MOIS");
		int mois = promptInteger(1, 12);
		System.out.println("ANNEE");
		int annee = promptInteger(1900, 2022);
		
		try {
			competition.inscrire( new Athlete(nom, LocalDate.of(annee, mois, jour)) );
			System.out.println("Athlete inscrit");
		}
		catch (AlreadySignedUpException e) {
			System.out.println("!! " + e.getToSignUp().getNom() + " est déjà inscrit à cette compétition !!");
		}
		
	}
	private void deleteParticipant() {
		if( competition.estTerminee() ) {
			System.out.println("Impossible, la compétition est terminée");
			return;
		}
		
		List<Athlete> l = competition.getParticipants();
		for(int i = 0; i < competition.getParticipants().size() ; i++) {
			System.out.println(i +" - "+ l.get(i));
		}
		System.out.println("Qui supprimer ?");
		int index = promptInteger(0, l.size()-1);
		competition.desinscrire( l.get(index) );
		
	}
	private void finish() {
		if(competition.estTerminee()) {
			System.out.println("La compétition est déjà terminée");
			return;
		}
		try {
			competition.terminer();
		}
		catch(NotEnoughParticipantsException ex) {
			System.out.println(ex.getMessage());
		}
		
	}
	private void displayPodium() {
		if( !competition.estTerminee() ) {
			System.out.println("La compétion n'est pas terminée...");
			return;
		}
		
		Competition<Athlete>.Podium p = competition.getPodium();
		
		System.out.println("--- PODIUM ---");
		System.out.println(">>> OR     : " + p.getOr().getSportif());
		System.out.println(">>  ARGENT : " + p.getArgent().getSportif());
		System.out.println(">   BRONZE : " + p.getBronze().getSportif());
	}
	
	private int promptInteger(int min) {
		return promptInteger(min,Integer.MAX_VALUE);
	}
	private int promptInteger(int min, int max) {
		
		int value;
		
		do {
			try {
				System.out.print("> [" + min +";" + max +"] : ");
				value = sc.nextInt();
				sc.nextLine();
			}
			catch(InputMismatchException ex) {
				value = min;
			}
			
			if( value < min || value > max )
				System.out.println("invalide");
			
		}while(value < min || value > max);
		
		return value;
		
	}

}
