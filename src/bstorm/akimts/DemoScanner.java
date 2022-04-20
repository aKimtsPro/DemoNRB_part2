package bstorm.akimts;

import java.util.Scanner;

public class DemoScanner {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quel est votre nom?");
		String nom = sc.next();
		System.out.println("Quel est votre age?");
		int age = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Qu'aimez vous dire pour salut?");
		String phrase = sc.nextLine();
		
		System.out.println("Bonjour "+ nom);
		System.out.println("Vous avez " + age + " ans.");
		
		
	}

}
