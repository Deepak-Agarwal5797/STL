package com.phoenix.DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class DateTimeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// immutable follows IS0- 8601 calander format
		
		LocalDate date=  LocalDate.now();
		System.out.println(date);
		
		LocalDate dat1 = LocalDate.of(2020,4,5);
		System.out.println(dat1);
		
		LocalTime lt1=  LocalTime.now();
		System.out.println(lt1);
		
		LocalDateTime ltd1 = LocalDateTime.now();
		System.out.println(ltd1);
		
		LocalDateTime anyDateTime = LocalDateTime.of(date,lt1);
		System.out.println(anyDateTime);
	
		ZonedDateTime zdt = ZonedDateTime.now();
		System.out.println(zdt);
		
		// to change zone we have zone id class use that along with local date, localtime object
		
		ZoneId defualtId =  ZoneId.systemDefault();
		System.out.println(defualtId);
		
		Set<String> zones = ZoneId.getAvailableZoneIds();
	//	zones.stream().sorted().forEach(System.out::println);
		
		zones.stream().filter(z->z.startsWith("America") || z.startsWith("Indian")).sorted().forEach(System.out::println);
		
		
		
		ZoneId customId = ZoneId.of("US/Hawaii");
		ZonedDateTime zdt1 =ZonedDateTime.of(ltd1, customId);
		System.out.println(zdt1);
		
	}

}
