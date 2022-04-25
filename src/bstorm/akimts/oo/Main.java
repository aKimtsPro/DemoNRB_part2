package bstorm.akimts.oo;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		
		Employe e = new Employe("dubois","luc");
		e.saluer(); // salue comme un employe
		
		Personne p = e;
		p.saluer(); // salue comme une personne
		
		Object o = e;
		if( o instanceof Employe )
			e = (Employe)o;
		
		
		List<> list = new ArrayList<>();
	
	}

}
