package defaultStaticMethodsInInterface;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

import Data.Student;
import Data.StudentDatabase;

public class DefaultMethodsExample2 {
	
	static Consumer<Student> consumer=(s->System.out.println(s));
	static Comparator<Student> nameComparator=Comparator.comparing(Student::getName);
	static Comparator<Student> gradeComparator=Comparator.comparingDouble(Student::getGradeLevel);
	public static void sortByName(List<Student> studentList) {
		
	
		
		studentList.sort(nameComparator);
		studentList.forEach(consumer);
		
	}
	
	public static void sortByGrade(List<Student> studentList) {
		
		
		
			
			studentList.sort(gradeComparator);
			studentList.forEach(consumer);
	}
	
	public static void comparatorChaining(List<Student> studentList) {
		
		studentList.sort(gradeComparator.thenComparing(nameComparator));
		
		studentList.forEach(consumer);
	}
	
	public static void sortWithNullValues(List<Student> studentList) {
	Comparator<Student> comparator=	Comparator.nullsFirst(nameComparator);
	studentList.sort(comparator);
	
	studentList.forEach(consumer);
	}
	
	public static void main(String[] args) {
		
				List<Student> studentList=StudentDatabase.getAllStudents();
		
		//System.out.println(studentList);
		
		//studentList.forEach(consumer);
		
		//sortByName(studentList);
		
		
		//sortByGrade(studentList);
		
		//comparatorChaining(studentList);
				
				sortWithNullValues(studentList);
		
	}
}

