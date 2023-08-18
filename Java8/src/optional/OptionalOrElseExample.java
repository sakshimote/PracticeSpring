package optional;

import java.util.Optional;

import Data.Student;
import Data.StudentDatabase;

public class OptionalOrElseExample {
	
	/*
	 * orElse()
	 * orElseGet()
	 * orElseThrow()
	 */
	
	public static String optionalOrElse() {
		Optional<Student> optStudent= Optional.ofNullable(StudentDatabase.studentSupplier.get());
	//	Optional<Student> optStudent=Optional.ofNullable(null);
		String name=optStudent.map(Student::getName).orElse("Default");
		return name;
	}
	
	public static String optionalOrElseGet() {
		Optional<Student> optStudent= Optional.ofNullable(StudentDatabase.studentSupplier.get());
		String name=optStudent.map(Student::getName).orElseGet(()-> "Default");
		return name;
	}
	
	public static String optionalOrElseThrow() {
		Optional<Student> optStudent= Optional.ofNullable(null);
		String name=optStudent.map(Student::getName).orElseThrow(()->new RuntimeException("no data found"));
		return name;
	}
	
	
	
	
	public static void main(String[] args) {
		System.out.println(optionalOrElse());
		System.out.println(optionalOrElseGet());
		
		System.out.println(optionalOrElseThrow());
	}
	

}
