package com.example.bootcamp.util;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class BootUtil {
	
	public static String dateConverter(Date dateString) {
		SimpleDateFormat formatter = new SimpleDateFormat("dd MMM YYYY");
		return formatter.format(dateString);

	}

}
