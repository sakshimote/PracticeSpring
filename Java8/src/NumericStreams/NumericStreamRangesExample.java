package NumericStreams;

import java.util.stream.IntStream;

public class NumericStreamRangesExample {
	
	public static void main(String[] args) {
		
		IntStream intStream=IntStream.range(1, 50);
		//System.out.println(intStream.count());
		
		intStream.forEach(System.out::println);
		System.out.println("count"+IntStream.rangeClosed(1, 50).count());
		IntStream.rangeClosed(1, 50).forEach(System.out::println);
		
		IntStream.range(1, 60).asDoubleStream().forEach(value->System.out.println(value));
		
		
	}

}
