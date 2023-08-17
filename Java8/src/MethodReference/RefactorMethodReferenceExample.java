package MethodReference;

import java.util.function.Predicate;

import Data.Student;
import Data.StudentDatabase;

public class RefactorMethodReferenceExample {
	
	static Predicate<Student> p1=RefactorMethodReferenceExample::greaterThanGradelevel;

	public static boolean greaterThanGradelevel(Student s) {
		return s.getGradeLevel()>=3;
	}
	
	

	public static void main(String[] args) {
		
		System.out.println(p1.test(StudentDatabase.studentSupplier.get()));
		
	}

}
