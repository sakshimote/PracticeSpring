import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//removing duplicates from list of integers
public class ImperativeVsDeclarative2 {
	public static void main(String[] args){
		
		
		List<Integer> integerList=Arrays.asList(1,2,4,3,4,2,2);
		
		/*
		 * imperative approach
		 */
		
		List<Integer> uniqueList=new ArrayList<>();
		for(Integer i:integerList) {
			if(!uniqueList.contains(i)) {
				uniqueList.add(i);
			}
		}
		
		System.out.println(uniqueList+" using imperative approach");
		
		/*
		 * declarative approach
		 */
		 
		 
		List<Integer> list2=new ArrayList<>();
		list2=integerList.stream().distinct().collect(Collectors.toList());
		System.out.println(list2+" using declartive approach");
	}
	

}
