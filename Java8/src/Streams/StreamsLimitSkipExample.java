package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsLimitSkipExample {
	
	/*Short circuiting:
	 * all this function does not have to iterate the whole stream to evaluate the result
	 * 
	 * 
	 */
	
	
	
	public static Optional<Integer> limit(List<Integer> list){
		return list.stream().limit(2).reduce((a,b)->a+b);
		
	}
	
	public static Optional<Integer> skip(List<Integer> list){
		return list.stream().skip(4).reduce((a,b)->a+b);
		
	}
	
	public static void main(String[] args) {
		
		
		List<Integer> integerList=Arrays.asList(6,7,8,9,10);
		System.out.println(limit(integerList).get());
		
		
		System.out.println(skip(integerList).get());
	}
	
	
	

}
