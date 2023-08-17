package Streams;

import java.util.Optional;

import Data.Student;
import Data.StudentDatabase;

public class StreamsFindExample {
	
	/*
	 * findFirst() findAny()
	 * 
	 * used to find an element in the stream
	 * both the functions  returns result of type optional
	 * findFirst(): Returns first element in stream
	 * findAny() :Returns first encountered element in stream
	 * 
	 */
	
	public static Optional<Student> findAny() {
		
	return StudentDatabase.getAllStudents()
		.stream()
		.filter(student->student.getGpa()>=3.9)
		.findAny();
		
	
	}
	
	public static Optional<Student> findFirst() {
		
		return StudentDatabase.getAllStudents()
			.stream()
			.filter(student->student.getGpa()>=3.9)
			.findFirst();
			
		
		}
	
	public static void main(String[] args) {
		System.out.println(findAny().get());
		System.out.println(findFirst().get());
		
	}

}
