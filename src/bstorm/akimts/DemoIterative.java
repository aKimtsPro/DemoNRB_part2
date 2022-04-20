package bstorm.akimts;

public class DemoIterative {
	
	public static void main(String[] args) {
		
		boolean continuer = false;
		
		
		// boucle
		while( continuer ) {
			System.out.println("passage dans la boucle");
		}
		
		do {
			System.out.println("passage dans la boucle");
		}while( continuer );
		
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
		
		int i = 0;
		while(i < 5) {
			System.out.println(i);
			i++;
		}
		
		// init
		int tab[] = new int[5];
		int[] tab2 = { 1,2,3,4,5 };
		// affect
		tab2 = new int[5];
		tab2 = new int[]{ 1,2,3,4,5 };
		
		for( int element : tab2  ) {
			element++;
		}
		
		for (int element : tab2) {
			System.out.println(element);
		}
		
		int[][] tabDeTab = {{1},{2},{3},{4},{5}};
		
		String[][][] tabString = new String[5][3][2];
		
		for (int[] sousTableau : tabDeTab) {
			sousTableau[0]++;
		}
		
		for (int[] sousTableau : tabDeTab) {
			System.out.println(sousTableau[0]);
		}
		
		
	}

}
