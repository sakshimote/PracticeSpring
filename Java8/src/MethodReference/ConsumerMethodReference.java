package MethodReference;

import java.util.function.Consumer;

import Data.Student;
import Data.StudentDatabase;

public class ConsumerMethodReference {
	//using lambda
	static Consumer<Student> c1=(p)->System.out.println(p);
	//using class name
	static Consumer<Student> c2=System.out::println;
	
	//class name:: instance method name
	static Consumer<Student> c3=Student::printListOfActivities;
	
	
	public static void main(String[] args) {
		StudentDatabase.getAllStudents().forEach(c1);
		StudentDatabase.getAllStudents().forEach(c2);
		
		StudentDatabase.getAllStudents().forEach(c3);
	}
	
	

}
