package Streams;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import Data.Student;
import Data.StudentDatabase;

public class StreamsMapExample {
	//map converts stream to another stream
	//converts one type to another
	public static List<String> nameList(){
		
		List<String> nameList=
				StudentDatabase.getAllStudents().stream().//stream of student
				map(Student::getName).//stream of string
				map(String::toUpperCase).
				collect(Collectors.toList());//collecting in list
		
		return nameList;
		
	}
	
	public static Set<String> nameSet(){
		
		Set<String> nameSet=
				StudentDatabase.getAllStudents().stream().//stream of student
				map(Student::getName).//stream of string
				map(String::toUpperCase).
				collect(Collectors.toSet());//collecting in list
		
		return nameSet;
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(nameList());
		System.out.println(nameSet());
	}

}
