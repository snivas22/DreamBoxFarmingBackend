package com.astute.ecommerce.utility;

import java.util.Calendar;
import java.util.Random;

public class RandomID {

	
	public static String getRandomID(){
		Calendar now = Calendar.getInstance();
	    int year = now.get(Calendar.YEAR);
	    int month = now.get(Calendar.MONTH) + 1; // Note: zero based!
	    int day = now.get(Calendar.DAY_OF_MONTH);
	    int hour = now.get(Calendar.HOUR_OF_DAY);
	    int minute = now.get(Calendar.MINUTE);
	    int second = now.get(Calendar.SECOND);
	    int millis = now.get(Calendar.MILLISECOND);
	    String recordID = Integer.toString(year) + Integer.toString(month) + Integer.toString(day)
	        + Integer.toString(hour) + Integer.toString(minute) + Integer.toString(second)
	        + Integer.toString(millis);
	    
	    return recordID;
	}
	
	public static String getDocumentNo(){
		
		Random rnd = new Random();
		int n = 100000 + rnd.nextInt(900000);
		
		return n+"";
	}
}
