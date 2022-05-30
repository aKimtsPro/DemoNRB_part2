package bstorm.akimts.oo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import bstorm.akimts.oo.Sportif.Sport;
import bstorm.akimts.oo.exceptions.CapacityExceededException;
import bstorm.akimts.oo.exceptions.EmployeAlreadyThereException;
import bstorm.akimts.oo.interfaces.Mangeur;
import bstorm.akimts.oo.interfaces.Sociable;

public class Main {
	
	public static void main(String[] args) {
		
		Entreprise entreprise = new Entreprise();
		Scanner sc = new Scanner(System.in);
		try {
			String nom = sc.next();
			Employe aEngager = new Employe();
			aEngager.setNom(nom);
			entreprise.engager(aEngager);

			nom = sc.next();
			aEngager = new Employe();
			aEngager.setNom(nom);
			entreprise.engager(aEngager);
			
			return;
		}
		catch( CapacityExceededException | IllegalArgumentException exc ) {
			System.out.println("CapacityExceededException - "+ exc.getMessage());
		}
		catch( EmployeAlreadyThereException exc ) {
			System.out.println("EmployeAlreadyThereException -" + exc.getMessage());
		}
		catch( Exception e ) {
			e.printStackTrace();
		}
		finally {
			sc.close();
		}
			
		System.out.println("salut");

		
	
	}
	
	

}
