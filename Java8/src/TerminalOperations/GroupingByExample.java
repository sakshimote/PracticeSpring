package TerminalOperations;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import Data.Student;
import Data.StudentDatabase;

public class GroupingByExample {
	/*
	 * groupingBy(): collector is equivalent to the groupBy() operation in sql
	 * used to group elements  based on property
	 * the output of groupingBy() is going to be a Map<K,V>
	 * has 3 diff versions of groupingBy()
	 */
	public static Map<String, List<Student>> groupStudentsByGender() {
	   return	StudentDatabase.getAllStudents().stream().collect(Collectors.groupingBy(Student::getGender));
	}
	
	
	public static Map<String, List<Student>> customizedGroupingBy() {
		   return StudentDatabase.getAllStudents().stream().collect(Collectors.groupingBy(student->student.getGpa()>=3.9?"outstanding":"average"));
		}
	
	
	public static Map<Integer, Map<String, List<Student>>> twoLevelGrouping1() {
	return StudentDatabase.getAllStudents().stream().collect(Collectors.groupingBy(Student::getGradeLevel, Collectors.groupingBy(student->student.getGpa()>=3.9?"outstanding":"average")));
		//two level mapping
	}
	
	
	public static Map<Integer, Integer> twoLevelGrouping2() {
		return StudentDatabase.getAllStudents().stream().
				collect(Collectors.groupingBy(Student::getGradeLevel, 
						Collectors.summingInt(Student::getNoteBooks)));
			
		}
	
	public static LinkedHashMap<String, Set<Student>> threeArgGroupBy() {
	return	StudentDatabase.getAllStudents().stream().collect(Collectors.groupingBy(Student::getName, LinkedHashMap::new, Collectors.toSet()));
	}
	
	
	public static Map<Integer, Object> topLevelGpaStudent() {
		return StudentDatabase.getAllStudents().stream().collect(Collectors.groupingBy(Student::getGradeLevel,
				Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Student::getGpa)), Optional::get) ));
	}
	
	
	
	public static void main(String[] args) {
		
		System.out.println(groupStudentsByGender());
		
		System.out.println(customizedGroupingBy());
		
		
		System.out.println(twoLevelGrouping1());
		System.out.println(twoLevelGrouping2());
		System.out.println(threeArgGroupBy());
		
		System.out.println(topLevelGpaStudent());
	}

}
