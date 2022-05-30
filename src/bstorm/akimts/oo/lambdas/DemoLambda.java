package bstorm.akimts.oo.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class DemoLambda {

	public static void main(String[] args) {
		
		Mangeur m = new Mangeur() {
			
			@Override
			public void manger() {
				System.out.println("je mange");
			}
			
		};
		
		// lambda
		Mangeur m2 = () -> System.out.println("manger");
		// lambda/reference de methode
		Mangeur m3 = m2::manger;
		
		m3.manger();
		
		// Interfaces fonctionnelles
		// - Predicate<T> : (T) -> boolean
		// - Consumer<T>  : (T) -> void
		// - Supplier<T>  : (/) -> T
		// - Function<P,R>  : (P) -> R
		// - BiFunction<P1,P2,R>: (P1,P2) -> R
		//   ----
		// - UnaryOperator<T> : (T) -> T
		// - BinaryOperator : (T,T) -> T
		
		Predicate<String> predicate = (String chaine) -> {
			return chaine.length() > 5;
		};
		boolean testResult = predicate.test("ma chaine");
		
		Consumer<String> consumer = System.out::println;
		consumer.accept( "salut" );
		
		List<String> list = new ArrayList<>();
		list.forEach(consumer);
		list.forEach( System.out::println );
		
	}
	
}
