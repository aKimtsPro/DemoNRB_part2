package bstorm.akimts;

public class DemoConditionnelles {
	
	public static void main(String[] args) {
		
		
		int age = 82;
		final int ageRetraite = 67;
		
		
		if( age < 0 ) {
			System.out.println("vous n'existez pas");
		}
		else if( age <= 18 ) {
			System.out.println("Vous êtes un enfant");
		}
		else if( age < 40 ) {
			System.out.println("Jeune adulte");
		}
		else {
			System.out.println("Vous êtes adulte");
		}
		
		age = 12;
		
		switch(age) {
			case 0:
				System.out.println("Vous venez de naitre");
				break;
			case 11:
			case 12:
			case 13:
				System.out.println("Adolescence");
				break;
			case 18:
				System.out.println("Adulte");
				break;
			default:
				System.out.println("Pas de valeur particulière");	
		}
	}

}
