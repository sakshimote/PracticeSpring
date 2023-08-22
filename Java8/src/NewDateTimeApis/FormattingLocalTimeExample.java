package NewDateTimeApis;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class FormattingLocalTimeExample {
	
	public static void parseTime() {
		String time="13:00";
	LocalTime localTime=	LocalTime.parse(time);
	System.out.println(localTime);
	
LocalTime localTime2=LocalTime.parse(time, DateTimeFormatter.ISO_LOCAL_TIME);
System.out.println(localTime2);
	
//custom defined format

		String time1="13*00";
		
		DateTimeFormatter  dateTimeFormatter=DateTimeFormatter.ofPattern("HH*mm");
		LocalTime localTime3=	LocalTime.parse(time1, dateTimeFormatter);
		System.out.println(localTime3);
		
		String time2="13*00*02";
		DateTimeFormatter  dateTimeFormatter2=DateTimeFormatter.ofPattern("HH*mm*ss");
		LocalTime localTime4=	LocalTime.parse(time2, dateTimeFormatter2);
		System.out.println(localTime4);
	}
	
	public static void formatTime() {
		DateTimeFormatter  dateTimeFormatter2=DateTimeFormatter.ofPattern("HH*mm*ss");
		LocalTime localTime=LocalTime.now();
		String time=localTime.format(dateTimeFormatter2);
		System.out.println(time);
		
		
		
	}
	public static void main(String[] args) {
		
		parseTime();
		formatTime();
		
		
	}

}
