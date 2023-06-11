package com.bilgeadam.lesson022;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateOrnek {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		
		LocalDate date1= LocalDate.now();
		System.out.println(date1);
		LocalDateTime date3=LocalDateTime.now();
		System.out.println(date3);
		LocalDate date4=LocalDate.of(2001, Month.JULY, 31);
		System.out.println(date4);
		System.out.println(date4.getYear());
		
		System.out.println(DayOfWeek.valueOf("MONDAY"));
		
		System.out.println(LocalDate.now().getYear()-date4.getYear());
		LocalDate date5=LocalDate.parse("2023-12-15");
		System.out.println(date5);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyy");
		String date6 = LocalDate.now().format(formatter);
		System.out.println(date6);
	}

}
