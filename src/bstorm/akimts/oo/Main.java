package bstorm.akimts.oo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import bstorm.akimts.oo.Sportif.Sport;
import bstorm.akimts.oo.exceptions.CapacityExceededException;
import bstorm.akimts.oo.exceptions.EmployeAlreadyThereException;
import bstorm.akimts.oo.interfaces.Mangeur;
import bstorm.akimts.oo.interfaces.Sociable;

public class Main {
	
	public static void main(String[] args) {
		
		Entreprise entreprise = new Entreprise();
		try {
			entreprise.engager(new Employe());
			entreprise.engager(new Employe());
		}
		catch( CapacityExceededException exc ) {
			System.out.println("CapacityExceededException - "+ exc.getMessage());
		}
		catch( EmployeAlreadyThereException exc ) {
			System.out.println("EmployeAlreadyThereException -" + exc.getMessage());
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("salut");

		
	
	}
	
	

}
