package com.vmetry.webdrivers;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String dateInput = "12/21/2017";
		Date dte = new Date(dateInput);
		SimpleDateFormat dt = new SimpleDateFormat("MMM/dd/yyyy");
		String date = dt.format(dte);
		System.out.println(date);
		String[] split = date.split("/");
		String month = split[0]+" "+split[2];
		System.out.println("Month is: " +month);
		String day = split[1];
		System.out.println("Date is: " +day);
	
	}

}
