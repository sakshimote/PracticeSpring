import java.util.stream.IntStream;

public class ImperativeVsDeclarative1 {
	
	public static void main(String[] args) {
		
		
		//problem: summation of first 100 numbers:
		
		
		/*
		 * imperative style
		 */
		
		int sum=0;
		for(int i=0;i<=100;i++) {
			sum+=i;
		}
		System.out.println("sum using imperative approach: "+sum);
		
		
		/*
		 * Declarative
		 */
		
		int summation=IntStream.rangeClosed(0, 100).sum();
		System.out.println("sum using declarative approach: "+summation);
		
	}

}
