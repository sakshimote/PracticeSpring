package NewDateTimeApis;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateFormatterExample {
	
	/*
	 * introduced in java 8  & part of  java.time.format package
	 * used to parse & format the localdate , localtime, localdatetime
	 * 
	 * parse & format::
	 * parse:Converting a string to a localDate /localtime/localdatetime
	 * format:converting localDate /localtime/localdatetime to string
	 * 
	 */
	public static void parseLocalDate() {
		String date="2018-04-08";
		LocalDate localDate=LocalDate.parse(date);
		System.out.println(localDate);
		
		LocalDate localDate2=LocalDate.parse(date, DateTimeFormatter.ISO_LOCAL_DATE);
		System.out.println(localDate2);
		
		String date1="20230914"; //yyyymmdd
		
		LocalDate localDate3=LocalDate.parse(date1, DateTimeFormatter.BASIC_ISO_DATE);
		
		System.out.println(localDate3);
		
		//cannot include # in pattern reserved keyword
		//custom defined date format
		String date3="2018|04|10";
		
		
		DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("yyyy|MM|dd");
		LocalDate localDate4=LocalDate.parse(date3,dateTimeFormatter);
		System.out.println(localDate4);
		
		
		
	}
	
        public static void formatLocalDate() {
		
        	DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("yyyy|MM|dd");
        	LocalDate localDate=LocalDate.now();
        	String date= localDate.format(dateTimeFormatter);
        	
        	System.out.println(date);
        	
        	
        	
	}
	
	public static void main(String[] args) {
		parseLocalDate();
		formatLocalDate();
	}

}
