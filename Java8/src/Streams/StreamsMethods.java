package Streams;

import java.util.List;
import java.util.stream.Collectors;

import Data.Student;
import Data.StudentDatabase;

public class StreamsMethods {
public static List<String> getStudentActivities(){
		
		List<String> StudentActivities=StudentDatabase.getAllStudents().stream() //stream<Student>
		.map(Student::getActivities)//Stream<List<String>>
		.flatMap(List::stream)//stream<String>
		.distinct()//removes duplicates
		.sorted()//sorts result alphabetically
		.collect(Collectors.toList());
		return StudentActivities;
	}


public static long getStudentActivitiesCount(){
	
	return StudentDatabase.getAllStudents().stream() //stream<Student>
	.map(Student::getActivities)//Stream<List<String>>
	.flatMap(List::stream)//stream<String>
	.distinct()//removes duplicates//sorts result
	.count();

}
	

	public static void main(String[] args) {
		//distinct:return a stream with unique elements
		//count:returns a long with total number of elements in stream
		//sorted:sort the elements in stream
		
		System.out.println("student unique activities: "+getStudentActivities());
		System.out.println("student activities count: "+getStudentActivitiesCount());
		
		
	}

}
