package bstorm.akimts.oo.generics;

import bstorm.akimts.oo.Employe;

public class DemoGenerics {
	
	public static void main(String[] args) {
		
		Boite<Biscuit> b = new Boite<>(new Biscuit());
		b.setContenu(new Biscuit());
		
		Boite<Chocolat> b2;
		Boite<Bille> b3;
		
	}

}
