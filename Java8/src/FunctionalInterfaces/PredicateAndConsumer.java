package FunctionalInterfaces;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

import Data.Student;
import Data.StudentDatabase;

public class PredicateAndConsumer {
	
	BiPredicate<Integer, Double> biPredicate=(gradeLevel,gpa)->{
		
		return gradeLevel>=3 && gpa>=3.9;
		
		
	};
	
	BiConsumer<String, List<String>> 
	studentBiConsumer=(name,activities)->System.out.println(name+":"+activities);
	
	
	
	
	Predicate<Student> predicateStudent1=(student)->{
		return student.getGpa()>=3.9;
		
	};
	
	Predicate<Student> predicateStudent2=(student)->{
		return student.getGradeLevel()>=3;
		
	};
	
	
	
	Consumer<Student> consumerStudent=(student)->{
		
		if(biPredicate.test(student.getGradeLevel(),student.getGpa())) {
			studentBiConsumer.accept(student.getName(), student.getActivities());
		}
		
	};
	
	public void printNameActivity(List<Student> studentList) {
		studentList.forEach(consumerStudent);
	}
	public static void main(String[] args) {
		
		List<Student> studentList=StudentDatabase.getAllStudents();
		
		new PredicateAndConsumer().printNameActivity(studentList);
		
		
	}

}
