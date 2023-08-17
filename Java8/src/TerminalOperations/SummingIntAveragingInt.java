package TerminalOperations;

import java.util.stream.Collectors;

import Data.Student;
import Data.StudentDatabase;

public class SummingIntAveragingInt {
	/*
	 * summingInt():this collector returns the sum as result
	 * averagingInt():this collector returns the average as result
	 */
	
	public static int sum() {
		return StudentDatabase.getAllStudents().stream().collect(Collectors.summingInt(Student::getNoteBooks));
		
	}
	
	public static Double average() {
		return StudentDatabase.getAllStudents().stream().collect(Collectors.averagingInt(Student::getNoteBooks));
		
	}
	
	public static void main(String[] args) {
		System.out.println(sum());
		System.out.println(average());
		
	}

}
