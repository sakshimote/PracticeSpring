package FunctionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

import Data.Student;
import Data.StudentDatabase;

public class SupplierExample {
	
	public static void main(String[] args) {
		
		Supplier<Student> studentSupplier=()->{
			return  new Student("Adam",2,3.6, "male",10,Arrays.asList("swimming", "basketball","volleyball"));
		};
		
		Supplier<List<Student>> studentSupplier2=()->{
			return StudentDatabase.getAllStudents();
		};
		
		System.out.println(studentSupplier.get());
		System.out.println(studentSupplier2.get());
		
		
	}

}
