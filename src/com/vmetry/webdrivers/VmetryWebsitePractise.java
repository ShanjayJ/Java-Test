package com.vmetry.webdrivers;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VmetryWebsitePractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver",
				"F:\\Java Files\\Browser Drivers\\geckodriver-v0.19.0-win64\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.vmetry.com/Upload.aspx");
		String checkText = "Key Skills";
		String text = driver.findElement(By.xpath("//td[contains(text(),'Key Skills')]")).getText();
		System.out.println(text);

		if (checkText.equalsIgnoreCase(text)) {
			System.out.println("Text is matching");
		} else {
			System.out.println("Text is not matching");
		}

	} 

}
