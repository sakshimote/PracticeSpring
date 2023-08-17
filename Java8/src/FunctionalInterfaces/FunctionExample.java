package FunctionalInterfaces;

import java.util.function.Function;

public class FunctionExample {
	
	static Function<String, String> function=(name)->{;
	
	
	return name.toUpperCase();
	
	
	};
	
	static Function<String , String> addSomeString=(name)->name.toUpperCase().concat("default");
	
	public static void main(String[] args) {
		System.out.println(function.apply("helllo sakshi welcome to java8 community!!"));
		
		System.out.println(addSomeString.apply("by----"));
		System.out.println(function.apply("Result of and then")+function.andThen(addSomeString).apply("byeeeeeeeeeeeeeeeeeeeeeeeee"));
		System.out.println(function.apply("Result of and then")+function.compose(addSomeString).apply("byeeeeeeeeeeeeeeeeeeeeeeeee"));
	}

}
