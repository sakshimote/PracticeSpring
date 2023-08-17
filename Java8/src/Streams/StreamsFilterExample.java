package Streams;

import java.util.List;
import java.util.stream.Collectors;

import Data.Student;
import Data.StudentDatabase;

public class StreamsFilterExample {
	
	public static List<Student> filterStudents(){
		return StudentDatabase.getAllStudents().stream()
				.filter(student->
		student.getGender().equalsIgnoreCase("female")) //filters & send only whose gender is female
				.filter(student->student.getGradeLevel()>=3)
		.collect(Collectors.toList());
		
	}
	
	public static void main(String[] args) {
		
		//filter:filters the elements in stream
		//input to filter function is predicate
		
		
		//System.out.println(filterStudents());
		filterStudents().forEach(System.out::println);
		
	}

}
