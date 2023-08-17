package NumericStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamsBoxingUnboxingMapToInt {
	
	public static List<Integer> boxing() {
		return IntStream.rangeClosed(1, 50).
		//int
		boxed()
		//Integer
		.collect(Collectors.toList());
	}
	
	public static int unBoxing(List<Integer> list) {
		//wrapper to primitive
		
		return list.stream().mapToInt(Integer::intValue)//int value of wrapper class
		//int stream
		.sum();
		
		
		
	}
	
	public static void main(String[] args) {
		
		/*
		 * Boxing():converting a primitive type to wrapper class type
		 * e.g:int to Integer
		 * 
		 * UnBoxing():converting a wrapper class type to primitive type
		 * e.g:Integer to int
		 */
		
		System.out.println(boxing());
		
		List<Integer> list=boxing();
		System.out.println(unBoxing(list));
		
		
		
	}

}
