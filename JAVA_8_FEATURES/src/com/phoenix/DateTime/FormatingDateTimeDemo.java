package com.phoenix.DateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class FormatingDateTimeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate dat1 = LocalDate.of(2021,7,15);
	//	System.out.println(dat1);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
		
	
		
		System.out.println(dat1.format(formatter));
	}

}
