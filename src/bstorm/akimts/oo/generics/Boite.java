package bstorm.akimts.oo.generics;

public class Boite<C extends Contenable> {

	private C contenu;
	
	public Boite(C contenu) {
		super();
		this.contenu = contenu;
	}

	public C getContenu() {
		return contenu;
	}

	public void setContenu(C contenu) {
		this.contenu = contenu;
	}
	
	
	
}
