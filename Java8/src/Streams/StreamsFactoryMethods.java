package Streams;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamsFactoryMethods {
	
	public static void main(String[] args) {
		/*
		 * of(): creates a stream of certain values passed to this method
		 * 
		 * iterate(), generate(): used to create infinite streams
		 * 
		 * generate() takes supplier
		 * Stream.generate(<Supplier>);
		 */
		
		Stream<String> streamString=Stream.of("hello","java 8","you're","amazing");
		streamString.forEach(System.out::println);
		
		Stream.iterate(1, x->x*2).limit(10).forEach(System.out::println);
		
		Supplier<Integer> supplier=new Random()::nextInt;
		Stream.generate(supplier).limit(10).forEach(System.out::println);
		
	}

}
