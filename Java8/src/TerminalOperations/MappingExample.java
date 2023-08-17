package TerminalOperations;

import java.util.List;
import java.util.Set;
import java.util.TooManyListenersException;
import java.util.stream.Collectors;

import Data.Student;
import Data.StudentDatabase;

public class MappingExample {
	
	/*
	 * mapping():collector applies a transformation function first and then 
	 * collects the data in collection (could be any type of collection)
	 */
	
	public static void main(String[] args) {
		
		List<String> studentNames=StudentDatabase.getAllStudents().stream().collect(Collectors.mapping(Student::getName, Collectors.toList()));
		
		
		List<String> studentNames3=StudentDatabase.getAllStudents().stream().map(Student::getName).collect(Collectors.toList());
		System.out.println(studentNames3);
		System.out.println(studentNames);
		
		
		Set<String> studentNames2=StudentDatabase.getAllStudents().stream().collect(Collectors.mapping(Student::getName, Collectors.toSet()));
		System.out.println(studentNames2);
	}

}