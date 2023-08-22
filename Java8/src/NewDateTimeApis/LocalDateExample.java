package NewDateTimeApis;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class LocalDateExample {
	public static void main(String[] args) {
	LocalDate localDate1=	LocalDate.of(2001, 01, 25);
	System.out.println(localDate1);
	
	
		LocalDate localDate2=LocalDate.ofYearDay(2001, 8);
		System.out.println(localDate2);
		
		//get values from localdate
		
		System.out.println(localDate1.getDayOfWeek());
		System.out.println(localDate1.get(ChronoField.DAY_OF_MONTH));
		
		
		//modifying local Date
		
		LocalDate date=LocalDate.now();
		System.out.println(date.plusDays(2));
		System.out.println(date.plusMonths(2));
		System.out.println(date.minusMonths(3));
		System.out.println(date.withYear(2028));
		
		System.out.println(date.with(ChronoField.YEAR,2020));
		
		System.out.println(date.with(TemporalAdjusters.firstDayOfNextMonth()));
		
		System.out.println(date.minus(1,ChronoUnit.YEARS));
		
	/*
	 * Additional support methods
	 */
		
		System.out.println(date.isLeapYear());
		
		System.out.println(date.isEqual(localDate1));
		System.out.println(date.isAfter(localDate1));
		
		
		/*
		 * unsupported methods
		 */
		
		//System.out.println(date.minus(1,ChronoUnit.MINUTES)); //cannot perform time functionality on date
		
		System.out.println(date.isSupported(ChronoUnit.HOURS));
		
	}
	

}
