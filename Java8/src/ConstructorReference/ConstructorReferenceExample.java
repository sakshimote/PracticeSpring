package ConstructorReference;

import java.util.function.Function;
import java.util.function.Supplier;

import Data.Student;

public class ConstructorReferenceExample {
	static Supplier<Student> studentSupplier=Student::new;
	
	
	static Function<String, Student> functionStudent=Student:: new;
	
	public static void main(String[] args) {
		
		
		
		System.out.println(studentSupplier.get());
		System.out.println(functionStudent.apply("helllo  "));
	}

}
