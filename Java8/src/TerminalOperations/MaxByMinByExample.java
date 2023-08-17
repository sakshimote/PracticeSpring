package TerminalOperations;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

import Data.Student;
import Data.StudentDatabase;

public class MaxByMinByExample {
	/*
	 * takes comparator as input parameter  and Optional as output
	 * 
	 * maxBy():this collector is used in conjunction with comparator .
	 * Returns the max element based on property passed to comparator 
	 * 
	 * minBy():this collector is used in conjunction with comparator .
	 * Returns the min element based on property passed to comparator 
	 */
	
	public static Optional<Student> MinBy(){
		return StudentDatabase.getAllStudents().stream().collect(Collectors.minBy(Comparator.comparing(Student::getGpa)));
	}
	
	
	public static Optional<Student> MaxBy(){
		return StudentDatabase.getAllStudents().stream().collect(Collectors.maxBy(Comparator.comparing(Student::getGpa)));
	}
	
	public static void main(String[] args) {
		
		System.out.println(MinBy());
		System.out.println(MaxBy());
	}

}
