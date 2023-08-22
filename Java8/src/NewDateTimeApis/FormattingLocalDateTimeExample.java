package NewDateTimeApis;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattingLocalDateTimeExample {
	
	public static void parseLocalDateTime() {
		String dateTime="2018-04-18T15:33:33";
		
	LocalDateTime localDateTime=LocalDateTime.parse(dateTime);
	System.out.println(localDateTime);
	
	LocalDateTime localDateTime2=LocalDateTime.parse(dateTime,DateTimeFormatter.ISO_LOCAL_DATE_TIME);
	
	System.out.println(localDateTime2);
	
	
	//custom format
	String datetime1="2018-04-18T15|33|33";
	
	DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH|mm|ss");
	
	LocalDateTime localDateTime3=LocalDateTime.parse(datetime1,dateTimeFormatter);

	System.out.println(localDateTime3);

	
	
	}
	
	public static void formatLocalDateTime() {
		DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH|mm|ss");
		LocalDateTime
		 localDateTime=LocalDateTime.now();
		String dateTime=localDateTime.format(dateTimeFormatter);
		System.out.println(dateTime);

	}
	public static void main(String[] args) {
		parseLocalDateTime();
		formatLocalDateTime();
		
	}

}
