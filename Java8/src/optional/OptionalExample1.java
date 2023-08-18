package optional;

import java.util.Optional;

import Data.Student;
import Data.StudentDatabase;

public class OptionalExample1 {
	
	/*
	
		
	 * Introduced as part of java 8 to represent non null value
	 * avoids null pointer exception & unnecessary  null checks
	 * concept of optional inspired frome new languages such as scala, Groovy etc
	 * 
	 */
	public static String getStudentName() {
		Student student= StudentDatabase.studentSupplier.get();
		
		if(student!=null) {
			return student.getName();
	}else {
		return null;
	}
		
	}
	
	
	public static Optional<String> getStudentNameOptional() {
		Optional<Student> opt= Optional.ofNullable(StudentDatabase.studentSupplier.get());
		if(opt.isPresent()) {
			return 
					//opt.get() //returns student object
					opt.map(Student::getName); //optional<String>
		}else {
			return opt.empty();  //Represents optional object with no value
		}
	}
	
	
	public static void main(String[] args) {
		
		String name=getStudentName();
		System.out.println(name.length());
		
		Optional<String> opt=getStudentNameOptional();
		if(opt.isPresent()) {
			System.out.println(opt.get().length());
		}
		
	}
	
	}
	

