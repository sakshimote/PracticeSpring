package Streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import Data.Student;
import Data.StudentDatabase;

public class StreamsExample {
	
	public static void main(String[]args) {
		//student name & their activities in a map
		
		
		Map<String,List<String>> map= StudentDatabase.getAllStudents().stream()
				.peek(s->{
					System.out.println(s);
				})
				.filter(s->s.getGradeLevel()>=3) 
				//passing predicate
				.peek(s->{
					System.out.println("after fist filter: ");
				})
				.filter(s->s.getGpa()>3.9)                //passing another predicate
				.collect(Collectors
				.toMap(Student::getName, Student::getActivities));
		
		System.out.println(map);
		
		
		
	}

}
