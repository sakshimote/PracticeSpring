package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsMinMaxExample {
	
	public static int findMaxValue(List<Integer> list) {
		return list.stream().reduce(0,(x,y)->x>y?x:y);
		
		
	}
	
	public static int findMinValue(List<Integer> list) {
		return list.stream().reduce(0,(x,y)->x<y?x:y);
		
		
	}
	
	public static Optional<Integer> findMaxValueOptional(List<Integer> list) {
		return list.stream().reduce((x,y)->x>y?x:y);
		
		
	}
	
	public static Optional<Integer> findMinValueOptional(List<Integer> list) {
		return list.stream().reduce((x,y)->x<y?x:y);
		
		
	}
	
	public static void main(String[] args) {
		
		List<Integer> integerList=Arrays.asList(5,4,6,8,9,10);
		
		System.out.println((findMaxValue(integerList)));
		
		System.out.println((findMaxValueOptional(integerList)).get());
		
		
	System.out.println((findMinValue(integerList)));
		
		System.out.println((findMinValueOptional(integerList)).get());
		
		
		
		
	}

}
