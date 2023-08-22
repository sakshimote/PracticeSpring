package defaultStaticMethodsInInterface;

import java.util.Arrays;
import java.util.List;

public class MultiplierClient {
	

	public static void main(String[] args) {
		
		Multiplier multiplier=new MultiplierImpl();
		List<Integer> list=Arrays.asList(1,2,3,4);
		System.out.println("result is "+multiplier.multiply(list));
		
		System.out.println("default method result "+multiplier.size(list));
		
		
		System.out.println("static method result "+Multiplier.isEmpty(list));
		
	}

}
