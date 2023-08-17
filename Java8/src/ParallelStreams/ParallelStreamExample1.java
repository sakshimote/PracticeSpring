package ParallelStreams;

import java.util.List;
import java.util.stream.Collectors;

import Data.Student;
import Data.StudentDatabase;

public class ParallelStreamExample1 {
	
	
	public static List<String> sequentialGetStudentActivities(){
		long startTime=System.currentTimeMillis();
		List<String> StudentActivities=StudentDatabase.getAllStudents().stream() //stream<Student>
		.map(Student::getActivities)//Stream<List<String>>
		.flatMap(List::stream)//stream<String>
		.collect(Collectors.toList());
		long endTime=System.currentTimeMillis();
		System.out.println("duration for sequential stream: "+(endTime-startTime));
		return StudentActivities;
	}
	
	public static List<String> parallelGetStudentActivities(){
		long startTime=System.currentTimeMillis();
		List<String> StudentActivities=StudentDatabase.getAllStudents().stream()
				.parallel()//stream<Student>
		.map(Student::getActivities)//Stream<List<String>>
		.flatMap(List::stream)//stream<String>
		.collect(Collectors.toList());
		long endTime=System.currentTimeMillis();
		
		System.out.println("duration for parallel stream: "+(endTime-startTime));
		return StudentActivities;
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(sequentialGetStudentActivities());
		System.out.println(parallelGetStudentActivities());
		
		
	}

}
