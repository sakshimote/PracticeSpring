package NewDateTimeApis;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class LocalDateTimeExample {
	
	public static void main(String[] args) {
		
		LocalDateTime localDateTime=LocalDateTime.now();
		
		System.out.println(localDateTime);
		
	 LocalDateTime localDateTime2=	LocalDateTime.of(2023, 1, 8, 3, 2);
	 System.out.println(localDateTime2);
	 
	 LocalDateTime localDateTime3=LocalDateTime.of(LocalDate.now(),LocalTime.now());
	 System.out.println(localDateTime3);
		//getting date time from instance
	 
	 System.out.println(localDateTime.getYear());
	 System.out.println(localDateTime.getHour());
	 
	 System.out.println(localDateTime.get(ChronoField.DAY_OF_YEAR));
	 
	 /*
	  * converting localdate, localtime to localdatetime & vice-versa
	  */
	 
	 LocalDate localDate=LocalDate.of(2019, 1, 1);
	 
	
	 
	 System.out.println("local date time response"+ localDate.atTime(23,33));
	 
	 
	 LocalTime localTime=LocalTime.now();
	 
	 System.out.println("local date time response"+ localTime.atDate(localDate));
	 
	 System.out.println(localDateTime.toLocalDate());
	 
	 
	}

}
