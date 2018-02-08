package com.vmetry.webdrivers;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"F:\\Java Files\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-form/");
		driver.manage().window().maximize();

		WebElement area = driver.findElement(By.xpath("//label[text() = 'Continents']"));
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView();", area);
		Thread.sleep(3000);

		WebElement commands = driver.findElement(By.id("selenium_commands"));
		Select dropdown = new Select(commands);
		// dropdown.selectByIndex(1);
		dropdown.selectByVisibleText("Wait Commands");
		Thread.sleep(3000);
		driver.quit();

	}

}
