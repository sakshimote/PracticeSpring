import java.util.Comparator;

public class ComparatorUsingLambda {
	
	public static void main(String[] args) {
		/*
		 * prior java 8
		 */
		
		
		Comparator<Integer> comparator=new Comparator<Integer>() {
			
			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2); //0: if o1==o2  1:if o1>o2   -1:if o2<o1
				
			}
		};
		
		System.out.println("Result of comparator is: "+comparator.compare(2, 4));
		
		/*
		 * lambda way
		 */
		
		
		Comparator<Integer> comparatorLambda=(Integer a,Integer b)->a.compareTo(b);
		System.out.println("Result of comparator using lambda is: "+comparatorLambda.compare(6, 4));
		
		Comparator<Integer> comparatorLambda2=( a, b)->a.compareTo(b);
		System.out.println("Result of comparator using lambda is: "+comparatorLambda2.compare(7, 7));
		
	}

}
