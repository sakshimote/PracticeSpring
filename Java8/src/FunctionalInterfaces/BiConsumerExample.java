package FunctionalInterfaces;

import java.util.List;
import java.util.function.BiConsumer;

import Data.Student;
import Data.StudentDatabase;

public class BiConsumerExample {
	
	public static void main(String[] args) {
		BiConsumer<String, String> biConsumer=(a,b)->System.out.println("a = "+a+" b = "+b);
		
		biConsumer.accept("java7", "java8");
		
		
		BiConsumer<Integer, Integer> biConsumer2=(a,b)->System.out.println("multiplication of two numbers: "+a*b);
		
		BiConsumer<Integer, Integer> biConsumer3=(a,b)->System.out.println("division of two numbers: "+a/b);
//		biConsumer2.accept(2, 6);
//		biConsumer3.accept(10, 5);
		
		biConsumer2.andThen(biConsumer3).accept(10, 5);
		
		
		nameAndActivities();
		
		
	}
	
	public static void nameAndActivities() {
		List<Student> studentList=StudentDatabase.getAllStudents();
		BiConsumer<String, List<String>> biConsumer5=(name,activities)->System.out.println("name: "+name+" activities: "+activities);
	
		studentList.forEach(
				student->biConsumer5.accept(student.getName(), student.getActivities()));
		
		
	}

}
