package me.brunosantana.java8_date_time_api.example10;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class NewDateTimeApiExample10 {

	public static void main(String[] args) {
		
		LocalDateTime now = LocalDateTime.now();

		//LocalDateTime to String representations
		System.out.println(now.format(DateTimeFormatter.ISO_LOCAL_TIME));		
		System.out.println(now.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		//String to date or time representations
		String dateString = "19/09/2019";
		LocalDate backToDate = LocalDate.parse(dateString, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.println(backToDate);
	}

}
