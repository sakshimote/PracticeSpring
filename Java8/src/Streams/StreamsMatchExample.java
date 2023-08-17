package Streams;

import Data.StudentDatabase;

public class StreamsMatchExample {
	
	//anyMatch(), allMatch(), noneMatch()
	//all this functions takes in a predicate as input & returns booleans as output
	
	//anyMatch(): returns true if any one of the element matches the predicate ,otherwise false
	//allMatch(): returns true if  all the element in stream matches the predicate , otherwise false
	//noneMatch():just opposite to allMatch(), 
	//  returns true if none of the elements in stream matches predicate,otherwise false
	
	
	public static boolean allMatch() {
		return StudentDatabase.getAllStudents().stream().allMatch(student->student.getGpa()>=3.4);
		
	}
	
	public static boolean anyMatch() {
		return StudentDatabase.getAllStudents().stream().anyMatch(student->student.getGpa()>=4.0);
		
	}
	
	public static boolean noneMatch() {
		return StudentDatabase.getAllStudents().stream().noneMatch(student->student.getGpa()>=5.2);
		
	}
	
	
	
	public static void main(String[] args) {
		
		System.out.println(allMatch());
		System.out.println(anyMatch());
		System.out.println(noneMatch());
	
	}

}
