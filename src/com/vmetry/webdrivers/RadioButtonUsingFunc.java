package com.vmetry.webdrivers;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonUsingFunc {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"F:\\Java Files\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-form/");
		driver.manage().window().maximize();
		String exp = "6";
		WebElement area = driver.findElement(By.xpath(".//*[@id='content']/h1"));
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView();", area);
		Thread.sleep(3000);

		WebElement textbox = driver.findElement(By.xpath("//input[@name='firstname']"));
		jse.executeScript("arguments[0].setAttribute(\"style\", \"background-color: blue;\");", textbox);
		Thread.sleep(3000);

		WebElement experience = driver.findElement(By.xpath(getExpYrs(exp)));
		if (experience.isDisplayed()) {
			if (experience.isEnabled()) {
				if (!experience.isSelected()) {
					experience.click();
				}
			}
		}
		Thread.sleep(3000);
		driver.quit();

	}

	public static String getExpYrs(String expe) {
		String loc;
		loc = "//input[@value='" + expe + "']";
		System.out.println(loc);
		return loc;
	}

}
