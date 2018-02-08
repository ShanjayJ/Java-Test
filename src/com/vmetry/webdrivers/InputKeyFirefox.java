package com.vmetry.webdrivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InputKeyFirefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver",
				"F:\\Java Files\\Browser Drivers\\geckodriver-v0.19.0-win64\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/login/");
		WebElement password, login, scroll;
		driver.findElement(By.id("email")).sendKeys("sanjayjoe2020@gmail.com");
		password = driver.findElement(By.id("pass"));
		password.sendKeys("shanjayjo");
		login = driver.findElement(By.xpath(".//*[@id='loginbutton']"));
		login.click();
		scroll = driver.findElement(By.xpath(".//*[@id='userNavigationLabel']"));
		scroll.click();

	}

}
