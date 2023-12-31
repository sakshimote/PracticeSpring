package Streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import Data.Student;
import Data.StudentDatabase;

public class StreamsComparatorExample {
	
	
	public static List<Student> sortStudentsByName(){
		
		return StudentDatabase.getAllStudents().stream()
		.sorted(Comparator.comparing(Student::getName))
		.collect(Collectors.toList())
		;
		
		
	}
	
public static List<Student> sortStudentsByGpa(){
		
		return StudentDatabase.getAllStudents().stream()
		.sorted(Comparator.comparing(Student::getGpa))
		.collect(Collectors.toList())
		;
		
		
	}

public static List<Student> sortStudentsByGpaDesc(){
	
	return StudentDatabase.getAllStudents().stream()
	.sorted(Comparator.comparing(Student::getGpa).reversed())
	.collect(Collectors.toList())
	;
	
	
}
	public static void main(String[] args) {
	//	System.out.println(sortStudentsByName());
		System.out.println("students sorted by name:");
		sortStudentsByName().forEach(System.out::println);
		
		System.out.println("students sorted by gpa:");
		sortStudentsByGpa().forEach(System.out::println);
		
		System.out.println("students sorted by gpa in desc order:");
		sortStudentsByGpaDesc().forEach(System.out::println);
		
	}

}
