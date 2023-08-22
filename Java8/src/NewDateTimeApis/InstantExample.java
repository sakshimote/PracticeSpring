package NewDateTimeApis;

import java.time.Duration;
import java.time.Instant;

public class InstantExample {
	/*
	 * represent time in machine readable format
	 * represent the time in seconds 
	 */
	
	public static void main(String[] args) {
		
	Instant instant=	Instant.now();
	System.out.println(instant);
	
	//jan 1st 1970 ->epoch->86400 seconds
	System.out.println(instant.getEpochSecond());
	
	System.out.println(instant.ofEpochSecond(0));
	Instant instant2=	Instant.now();
	
		
		System.out.println(Duration.between(instant, instant2).getNano());
	}

}
