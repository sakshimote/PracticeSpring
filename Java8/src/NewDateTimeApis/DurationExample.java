package NewDateTimeApis;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DurationExample {
	
	public static void main(String[] args) {
		/*
		 * time based representation in hours minutes, secodns, nanoseconds
		 * compatible with localtime, localdatetime
		 */
		
		
		LocalTime time1=LocalTime.of(7,20);
		LocalTime time2=LocalTime.of(23,20);
	long diff=	time1.until(time2,ChronoUnit.MINUTES);
		System.out.println(diff);
		
	Duration duration=Duration.between(time1, time2);
		System.out.println(duration);
		System.out.println(duration.toMinutes());
		
		
	}

}
