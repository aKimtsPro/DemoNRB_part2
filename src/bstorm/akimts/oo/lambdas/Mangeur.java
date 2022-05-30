package bstorm.akimts.oo.lambdas;

public interface Mangeur {
	
	void manger();
	default void boire() {
		System.out.println("je bois");
	}

}
