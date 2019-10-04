package me.brunosantana.java8_date_time_api.example1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class NewDateTimeApiExample1 {

	public static void main(String[] args) {
		
		LocalDate localdate = LocalDate.now();
		System.out.println(localdate);
		
		LocalTime localTime = LocalTime.now();
		System.out.println(localTime);
		
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);
		
	}

}
