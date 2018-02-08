package com.vmetry.webdrivers;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandlingPrac {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"F:\\Java Files\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://toolsqa.com/automation-practice-switch-windows/");
		driver.manage().window().maximize();

		System.out.println("Initial Window:" + driver.getCurrentUrl());

		List<String> windows = new ArrayList<String>(driver.getWindowHandles());
		for (String str : windows) {
			System.out.println(str);
		}

		driver.findElement(By.xpath(".//*[@id='content']/p[4]/button")).click();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		System.out.println("Second Window:" + driver.getCurrentUrl());

		Thread.sleep(3000);
		driver.switchTo().window(windows.get(0));
		System.out.println(driver.getCurrentUrl());
		//
		// driver.quit();

	}

}
