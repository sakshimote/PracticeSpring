package FunctionalInterfaces;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
	
	static UnaryOperator<String> u=(s)->s.concat("default");
	
	public static void main(String[] args) {
		
		System.out.println(u.apply("hiiiiiiiiiiiiiiiii "));
		
	}

}
