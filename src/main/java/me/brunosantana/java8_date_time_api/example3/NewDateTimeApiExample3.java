package me.brunosantana.java8_date_time_api.example3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class NewDateTimeApiExample3 {

	public static void main(String[] args) {
		
		LocalDateTime todayAtElevenAM = LocalDate.now().atTime(11,0);
		
		System.out.println(todayAtElevenAM);
		
		LocalTime now = LocalTime.now();
		LocalDate today = LocalDate.now();
		LocalDateTime dateAndTime = today.atTime(now);
		
		System.out.println(dateAndTime);

	}

}
