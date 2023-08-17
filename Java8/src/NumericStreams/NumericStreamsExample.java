package NumericStreams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class NumericStreamsExample {
	
	/*
	 * Numeric Stream Ranges::::::::::::::::
	 * 
	 * IntStream.range(1,50):Return an IntStream of 49 elements from 1 to 49
	 * IntStream.rangeClosed(1,50):Returns an IntStream of 50 elements from 1 to 50
	 * 
	 * LongStream.range(1,49):Return an LongStream of 49 elements from 1 to 49
	 * LongStream.rangeClosed(1,50):Returns an LongStream of 50 elements from 1 to 50
	 * 
	 * DoubleStream.range(1,490):Return an DoubleStream of 49 elements from 1 to 49
	 * DoubleStream.range(1,50):Return an DoubleStream of 50 elements from 1 to 50
	 */
	
	public static int sumOfNNumbers(List<Integer> list) {
		return list.stream().reduce(0,(a,b)->a+b);//unboxing op to convert Integer to int
		
	}
	
	public static int sumOfNNumbersIntStream() {
		return IntStream.rangeClosed(1, 6).sum();
		
	}
	public static void main(String[] args) {
		
		
		List<Integer> list=Arrays.asList(1,2,3,4,5,6);
		System.out.println(sumOfNNumbers(list));
		
		System.out.println(sumOfNNumbersIntStream());
		
	}

}
