package MethodReference;

import java.util.function.Function;

public class FunctionMethodReference {
	
	public static void main(String[] args) {
		//using lambda expression
		
		Function<String, String> function=(s)->s.toUpperCase();
		System.out.println(function.apply("helloo java8"));
		
		//using method references
		Function<String, String> toUpperCaseMethodRef=String::toUpperCase;
		System.out.println(toUpperCaseMethodRef.apply("helloo java8"));

	}

}
