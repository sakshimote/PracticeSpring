package FunctionalInterfaces;

import java.util.List;
import java.util.function.Predicate;

import Data.Student;
import Data.StudentDatabase;

public class PredicateStudentExample {
	
	
	static Predicate<Student> p1=(s)->s.getGradeLevel()>=3;
	
	static Predicate<Student> p2=(s)->s.getGpa()>=3.9;
	
	
	public static void main(String[] args) {
		
		filterStudentByGradeLevel();
		filterStudentByGpaLevel();
		filterStudents();
	}
	
	public static void filterStudentByGradeLevel() {
List<Student> studentList=StudentDatabase.getAllStudents();
		
		studentList.forEach((student)->{
			if(p1.test(student)) {
				System.out.println(student);
			}
		});
		
	}
	
	public static void filterStudents() {
		List<Student> studentList=StudentDatabase.getAllStudents();

		studentList.forEach((student)->{
			if(p1.and(p2).test(student)) {
				System.out.println(student);
			}
		});
		
		
	}
	
	public static void filterStudentByGpaLevel() {
		List<Student> studentList=StudentDatabase.getAllStudents();
				
				studentList.forEach((student)->{
					if(p2.test(student)) {
						System.out.println(student);
					}
				});
				
			}


}
