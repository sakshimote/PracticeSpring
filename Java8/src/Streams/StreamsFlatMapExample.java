package Streams;

import java.util.List;
import java.util.stream.Collectors;

import Data.Student;
import Data.StudentDatabase;

public class StreamsFlatMapExample {
	
	public static List<String> getStudentActivities(){
		
		List<String> StudentActivities=StudentDatabase.getAllStudents().stream() //stream<Student>
		.map(Student::getActivities)//Stream<List<String>>
		.flatMap(List::stream)//stream<String>
		.collect(Collectors.toList());
		return StudentActivities;
	}
	
	public static void main(String[] args) {
		//flatMap: converts(transform) one type to another as like map() method
		//used in the context of stream where each element in the stream respresents multiple elements
		//e.g: Stream<List>  Stream<Arrays>
		
		System.out.println("student activities: "+getStudentActivities());
		
		
	}

}
