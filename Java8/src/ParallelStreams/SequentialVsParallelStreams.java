package ParallelStreams;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class SequentialVsParallelStreams {

	/*
	 * parallel streams:splits the source of data  into multiple parts
	 * process them parallely
	 * combine the result
	 * 
	 * parallel stream uses the Fork/Join framework that got introduced in java 7
	 * number of threads created=number of processors available in machine
	 * 
	 * 
	 * 
	 */
	
	public static long checkPerformanceResult(Supplier<Integer> s,int numberOfTimes) {
		
		long startTime=System.currentTimeMillis();
		for(int i=0;i<numberOfTimes;i++) {
			s.get();
		}
		
		long endTime=System.currentTimeMillis();
		return endTime-startTime;
	}
	
	public static int sequentialSum() { 
		return IntStream.rangeClosed(1, 50).sum(); //sequential stream
	}
	
	public static int parallelSum() {
		return 	IntStream.rangeClosed(1, 50).parallel().sum(); //parallel stream
	}
	public static void main(String[] args) {
		
		System.out.println(Runtime.getRuntime().availableProcessors());
		
		
	System.out.println("sequential:::"+checkPerformanceResult(SequentialVsParallelStreams::sequentialSum, 20));	
		
	System.out.println("parallel:::"+checkPerformanceResult(SequentialVsParallelStreams::parallelSum, 20));	
	
		
		


	}

}
