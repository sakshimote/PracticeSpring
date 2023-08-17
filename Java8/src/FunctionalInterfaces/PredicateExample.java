package FunctionalInterfaces;

import java.util.function.Predicate;

public class PredicateExample {
	
	
	static Predicate<Integer> predicate=(a)->{
		return a%2==0;
	};
	
	static Predicate<Integer> predicate2=(a)->a%2==0;
	
	static Predicate<Integer> predicate3=(a)->a%5==0;
	
	public static void main(String[] args) {
	
		

		System.out.println(predicate.test(4));
		System.out.println(predicate.test(5));
		
		System.out.println(predicate2.test(4));
		System.out.println(predicate2.test(5));
		
		predicateAnd();
		predicateOr();
		predicateNegate();
		
		
	}
	
	
	public static void predicateAnd() {
		System.out.println(predicate2.and(predicate3).test(8));//predicate chaining
		
	}
	
	public static void predicateOr() {
		System.out.println(predicate2.or(predicate3).test(8));
	}
	
	public static void predicateNegate() {
		System.out.println(predicate2.or(predicate3).negate().test(8));
	}

}
