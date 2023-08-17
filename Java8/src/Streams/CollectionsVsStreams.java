package Streams;

import java.util.ArrayList;

public class CollectionsVsStreams {
	
	public static void main(String[] args) {
		ArrayList<String> names=new ArrayList<>();
		names.add("jim");
		names.add("pam");
		names.add("michael");
		
		
		names.remove(2);
		
		System.out.println(names);
		
	
	}

}
