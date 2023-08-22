package NewDateTimeApis;

import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class LocalTimeExample {
	
	public static void main(String [] args) {
	System.out.println(	LocalTime.now());
	
	LocalTime localTime1=LocalTime.of(23, 33);
	LocalTime localTime2=LocalTime.of(21, 33,8);
	LocalTime localTime3=LocalTime.of(21, 33,8,1);
	
	System.out.println(localTime1);
	System.out.println(localTime2);
	System.out.println(localTime3);

	/*
	 * getting values from localtime instance
	 */
	
	System.out.println(localTime1.getHour());
	System.out.println(localTime1.getMinute());
	System.out.println(localTime1.get(ChronoField.CLOCK_HOUR_OF_DAY));

	System.out.println(localTime1.toSecondOfDay());
	
	
	//modifying values of local time
     System.out.println(localTime1.minusHours(4));	
     
     System.out.println(localTime1.minus(2,ChronoUnit.HOURS));	

	System.out.println(localTime1.with(LocalTime.MIDNIGHT));
	
	System.out.println(localTime1.with(ChronoField.HOUR_OF_DAY,22));
	System.out.println(localTime1.plusMinutes(10));
	
	System.out.println(localTime1.withHour(10));
	
	
	}

	
}
