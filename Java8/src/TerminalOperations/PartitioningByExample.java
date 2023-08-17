package TerminalOperations;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import Data.Student;
import Data.StudentDatabase;

public class PartitioningByExample {
	/*
	 * partioningBy() collector is also kind of groupingBy()
	 * accepts predicate as input
	 * return type is Map<k,v>
	 * has 2 versions
	 */
	
	public static Map<Boolean, List<Student>> partitioningBy1() {
		Predicate<Student> gpaPredicate=(s)->s.getGpa()>=3.8;
		return StudentDatabase.getAllStudents().stream().collect(Collectors.partitioningBy(gpaPredicate));
	}
	
	public static Map<Boolean, Set<Student>> partitioningBy2() {
		Predicate<Student> gpaPredicate=(s)->s.getGpa()>=3.8;
		return StudentDatabase.getAllStudents().stream().collect(Collectors.partitioningBy(gpaPredicate,Collectors.toSet()));
	}
	
	public static void main(String[] args) {
		
		
		System.out.println(partitioningBy1());
		
		
	}

}
