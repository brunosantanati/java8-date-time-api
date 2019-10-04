package me.brunosantana.java8_date_time_api.example4;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class NewDateTimeApiExample4 {

	public static void main(String[] args) {
		
		convertFromZonedDateTimeToOtherTypes();
		
		convertFromOneTimezoneToAnother();
		
		compareDateTimeFromDifferentTimezones();
		
	}

	private static void convertFromZonedDateTimeToOtherTypes() {
		LocalDateTime localDateTime = LocalDateTime.now();
		ZonedDateTime zonedDateTime = localDateTime.atZone(ZoneId.of("America/Sao_Paulo"));
		LocalDate localDate = zonedDateTime.toLocalDate();
		LocalTime localTime = zonedDateTime.toLocalTime();
		LocalDateTime localDateTime2 = zonedDateTime.toLocalDateTime();
		
		System.out.println(localDate);
		System.out.println(localTime);
		System.out.println(localDateTime2);
	}

	private static void convertFromOneTimezoneToAnother() {
		LocalDateTime dateTime = LocalDateTime.now();
		
		ZonedDateTime saoPauloTimezone = dateTime.atZone(ZoneId.of("America/Sao_Paulo"));
		System.out.println(saoPauloTimezone);
		
		ZonedDateTime seoulTimezone = saoPauloTimezone.withZoneSameInstant(ZoneId.of("Asia/Seoul"));
		System.out.println(seoulTimezone);
	}
	
	private static void compareDateTimeFromDifferentTimezones() {
		ZonedDateTime tokyo = ZonedDateTime
				.of(2011, 5, 2, 10, 30, 0, 0, ZoneId.of("Asia/Tokyo"));
		
		ZonedDateTime saoPaulo = ZonedDateTime
				.of(2011, 5, 2, 10, 30, 0, 0, ZoneId.of("America/Sao_Paulo"));
		
		tokyo = tokyo.plusHours(12);
		System.out.println(tokyo.isEqual(saoPaulo));
	}

}
