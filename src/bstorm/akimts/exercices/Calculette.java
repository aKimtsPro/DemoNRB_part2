package bstorm.akimts.exercices;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Calculette {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<String> list = new ArrayList<>();
		Map<Character, String> operations = new HashMap<>();
		
		// recommencer tant que volonté de continuer
		char reponseContinue;
		do {
			boolean opValid = true;
			// Calculatrice basique
			System.out.println("Veuillez entrer le calcul à réaliser:");
			int terme1 = sc.nextInt();
			char operation = sc.next().charAt(0);
			int terme2 = sc.nextInt();
			
			double rslt;
			
			switch( operation ) {
			case '+':
				rslt = terme1 + terme2;
				break;
	
			case '-':
				rslt = terme1 - terme2;
				break;
	
			case '*':
				rslt = terme1 * terme2;
				break;
	
			case '/':
				rslt = (double)terme1 / terme2;
				break;
	
			case 'D':
				rslt = terme1 / terme2;
				break;
	
			case '%':
				rslt = terme1 % terme2;
				break;
				
			default:
				rslt = 0;
				opValid = false;
				System.out.println("opération invalide");
			}
			// fin calculatrice
			
			if( opValid ) {
				String rsltString = terme1 + " " + operation + " " + terme2 + " = " + rslt;
				System.out.println(rsltString);
				
				// Enregistrement en mémoire des calculs
				System.out.println("Souhaitez-vous enregistrer ce calcul? (O/n)");
				if( sc.next().charAt(0) != 'n' ) {
					list.add(rsltString);
					operations.put(operation, rsltString);
				}
			}
		
			System.out.println("Voulez-vous continuer ? (O/n)");
			reponseContinue = sc.next().charAt(0); 
		
		} while( reponseContinue != 'n' );
		// fin recommencer
		
		// Affichage des calculs mémorisés
		System.out.println("-- CALCULS REALISES --");
		for (String calcul : list) {
			System.out.println(calcul);
		}
		
		System.out.println("-- CALCULS REALISES PAR OPERATIONS --");
		for (Entry<Character, String> calcul : operations.entrySet()) {
			System.out.println(calcul.getKey() + " -> " + calcul.getValue());
		}
	}

}
