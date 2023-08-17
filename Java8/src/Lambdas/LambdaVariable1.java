package Lambdas;

import java.util.function.Consumer;

public class LambdaVariable1 {
	
	public static void main(String[] args) {
		
		//you are not allowed to use local variable name in lambda expression or body
		
		int i=0;
		Consumer<Integer> consumer1=(i1)->System.out.println(i1);
		
		//not allowed to declare same variable in lambda body
		
		//trying to reassign value to variable is not allowed
		
		//instance variables does not have such restrictions
		
		
		/*
		 * advantages of effectively final:::
		 * 1.easy to perform concurrency operations
		 * 2.promotes functional programming and demotes the imperative style programming
		 * 
		 */
		
		
		
		
		
	}
	
	

}
