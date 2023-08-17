package NumericStreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamsMapToExample {
	
	public static List<Integer> mapToObject() {
		return IntStream.rangeClosed(1, 50).mapToObj((i)->{
			return new Integer(i);
		}).collect(Collectors.toList());
	}
	
	public static long mapToLong() {
	 return IntStream.rangeClosed(1, 60).mapToLong((i)->i).sum(); //converts int stream to long stream
	}
	
	public static double mapToDouble() {
		 return IntStream.rangeClosed(1, 60).mapToDouble((i)->i).sum();//converts int stream to double stream
	}
	
	public static void main(String[] args) {
		
		/*
		 * mapToObj:Convert a each element numeric stream to some object
		 * mapToLong:convert a numeric stream to a long stream
		 * mapToDouble:convert a numeric stream to a Double stream
		 * 
		 */
		
		System.out.println(mapToObject());
		System.out.println(mapToLong());
		System.out.println(mapToDouble());
	}

}
