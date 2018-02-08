package com.vmetry.webdrivers;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DatePicker {

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver",
				"F:\\Java Files\\Browser Drivers\\geckodriver-v0.19.0-win64\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.navigate().to("https://www.redbus.in/");
		driver.manage().window().maximize();

		Thread.sleep(2000);
		String inputdate = "12/15/2017";
		Date d = new Date(inputdate);
		SimpleDateFormat dt = new SimpleDateFormat("MMM/dd/yyyy");
		String date = dt.format(d);
		System.out.println(date);
		String[] split = date.split("/");
		System.out.println(split[0]+" "+ split[1]+ " "+ split[2]);
		String month = split[0]+" "+split[2];
		System.out.println("Month:" +month);
		String day = split[1];
		System.out.println("Date:" +day);
		
		Thread.sleep(2000);
		driver.findElement(By.id("onward_cal")).click();
		
		WebElement hdlr = driver.findElement(By.xpath(".//*[@id='rb-calendar_onward_cal']/table/tbody/tr[1]/td[3]/button"));
		hdlr.click();
		Thread.sleep(2000);
		WebElement monthpick = driver.findElement(By.xpath(monthloc(month)));
		Thread.sleep(2000);
		if (monthpick.isDisplayed()) {
			driver.findElement(By.xpath(dateloc(day)));
		}
		hdlr.click();
		Thread.sleep(2000);
		
		
		

	}
	
	public static String dateloc(String day) {
		String loc;
		loc = ".//*[@id='rb-calendar_onward_cal']/table/tbody/tr/td[contains(text(),'"+day+"')]";
		return loc;
		
	}
	
	public static String monthloc(String month) {
		String loc;
		loc = ".//*[@id='rb-calendar_onward_cal']/table/tbody/tr[1]/td[contains(text(),'"+month+"')]";
		return loc;
		
	}
	

}
