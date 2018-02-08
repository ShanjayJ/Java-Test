package com.vmetry.webdrivers;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ResizeWindowTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"F:\\Java Files\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		System.out.println(driver.manage().window().getSize().width);
		System.out.println(driver.manage().window().getSize().height);
		Dimension dim = new Dimension(1500, 600);
		driver.manage().window().setSize(dim);

	}

}
