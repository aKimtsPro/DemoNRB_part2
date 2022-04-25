package bstorm.akimts.base;

import bstorm.akimts.oo.Employe;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		// Declaration de variables
		int maVariable = 2, var2 = 5, var3;
		long autreVariable = 900000000000L;
		
		System.out.println(5 + maVariable);
		
		// Les types primitifs
		
		// entier
		byte tresPetitEntier = 127; 		// 1o : -128;127
		short petitEntier = 32_000; 		// 2o : -32000;32000
		int entier = 2_000_000_000; 		// 4o : -2_000_000_000;2_000_000_000
		long longEntier = 4_000_000_000L; 	// 8o : beaucoup
		
		// reel
		
		float reel = 2.F;					// 4o
		double reelPrecis = 2.; 			// 8o
		
		// autre
		
		char caractere = 'a'; 				// 2o : 0;64_000
		boolean bool = true;				// 1bit
		String chaine = "ma chaine de caractère";
		
		// La conversion
		// - implicite
		
		entier = petitEntier;
		
		// - explicite
		
		petitEntier = (short)entier;
		
		// Autoboxing
		
		Integer entierObj = 2;
		Integer entier2 = 2;
		Character charObj = 'c';
		Double doubleObj = null;
		
		int value = entierObj * entier2;
		
		System.out.println(value);
		
		// Conversion d'un String en primitifs

		int deLaChaine = Integer.parseInt("5");
		double dFromString = Double.parseDouble("5.");
		boolean bFromString = Boolean.parseBoolean("true");
		char cFromString = chaine.charAt(0);
		
		
		// Opérations:
		// - arithmétiques
		// - affectation
		// - comparaison
		// - logique
		
		// arithmétiques
		
		int a = 7, b = 0, c;
		
		c = a + b; // = 12
		c = a - b; // = 2
		c = a / b; // = 1
		double rslt = (double)a / b; // 1.4
		c = a * b; // = 35
		c = a % b; // = 2
		
		// affectation
		
		int d = 5;
		d += c;
		d -= c;
		d *= c;
		d /= c;
		d /= rslt; // 
		d %= c;
		
		d += 1;
		
		d = 0;
		System.out.println(d++); // 0
		System.out.println(++d); // 2
		System.out.println(d--); // 2
		System.out.println(--d); // 0
		
		System.out.println(d); // 0
		
		// comparaison
		
		System.out.println( c < d );
		System.out.println( c <= d );
		System.out.println( c >= d );
		System.out.println( c > d );
		
		System.out.println( c == d );
		System.out.println( c != d );	
		
		// logique
		boolean b1 = true, b2 = false;
		
		// OU
		System.out.println( b1 || b2 );
		
		// ET
		System.out.println( b1 && b2 );
		
		// NON
		System.out.println( !b1 );
		
		// XOR
		System.out.println( b1 ^ b2 );
		
		// Loi de De Morgan
		boolean estBleu = true, estLigne = false;
		
		boolean bRslt = !(estLigne || estBleu);
		bRslt = !estLigne && !estBleu;
		
		bRslt = !(estLigne && estBleu);
		bRslt = !estLigne || !estBleu;
		
		Employe e = new Employe();
		
	}

}
