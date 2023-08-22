package NewDateTimeApis;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class TimeZonesExample {
	/*
	 * ZonedDateTime, ZoneID, ZoneOffset
	 * 
	 * ZonedDateTime:represents the date/time with its time zone
	 * 
	 */
	public static void main(String[] args) {
		
		ZonedDateTime zoDateTime= ZonedDateTime.now();
		System.out.println(zoDateTime);
		System.out.println(zoDateTime.getOffset());
		
		System.out.println(zoDateTime.getZone());
		
		
	//System.out.println(ZoneId.getAvailableZoneIds());	
	//	ZoneId.getAvailableZoneIds().stream().forEach((s)->System.out.println(s));
		
	System.out.println(	ZoneId.getAvailableZoneIds().size());
	
	//CST,EST,MST,PST
	System.out.println("Chicago CST "+ZonedDateTime.now(ZoneId.of("America/Chicago")));
	
	System.out.println(ZonedDateTime.now(Clock.system(ZoneId.of("America/Chicago"))));
	
	LocalDateTime localDateTime=LocalDateTime.now(ZoneId.of("America/Chicago"));
	System.out.println(localDateTime);
	LocalDateTime localDateTime2=LocalDateTime.ofInstant(Instant.now(), ZoneId.systemDefault());
	System.out.println(localDateTime2);
	
	//convert localdatetime, instant to zonedlocaldate
	LocalDateTime localDateTime3=LocalDateTime.now();
	System.out.println(localDateTime3);
	
	ZonedDateTime zonedDateTime= localDateTime3.atZone(ZoneId.of("America/Chicago"));
	System.out.println(zonedDateTime);
	
	ZonedDateTime zonedDateTime2=  Instant.now().atZone(ZoneId.of("America/Detroit"));
	System.out.println(zonedDateTime2);
	
	OffsetDateTime offsetDateTime=localDateTime3.atOffset(ZoneOffset.ofHours(-6));
	System.out.println(offsetDateTime);
	}

}
