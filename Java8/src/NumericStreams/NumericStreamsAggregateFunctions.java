package NumericStreams;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamsAggregateFunctions {
	
	public static void main(String[] args) {
		
		/*
		 * sum()
		 * max()
		 * min()
		 * average()
		 */
		
		
		int sum=IntStream.rangeClosed(1, 50).sum();
		System.out.println(sum);
		
		
		OptionalInt max=IntStream.rangeClosed(1, 50).max();
		System.out.println(max.isPresent());
		System.out.println(max.getAsInt());
		
		OptionalLong min=LongStream.rangeClosed(1, 60).min();
		System.out.println(min.getAsLong());
		
		OptionalDouble avg=IntStream.rangeClosed(1, 70).average();
		System.out.println(avg.getAsDouble());
		
		
	}
	
	

}
