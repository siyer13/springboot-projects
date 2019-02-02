package com.imf.utils;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;

import org.springframework.context.annotation.Bean;


public class Date {
	
	public String getDDMMMYYYYFormat() {
		final Calendar calendar = Calendar.getInstance();
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy"); 
		return formatter.format(calendar.getTime());
	}
	
	public String getCurrentDate() {
		LocalDate localDate = LocalDate.now();
		return localDate.toString();
	}
}
