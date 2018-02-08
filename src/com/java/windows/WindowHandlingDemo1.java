package com.java.windows;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingDemo1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"F:\\Java Files\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://toolsqa.com/automation-practice-switch-windows/");

		String parent = driver.getWindowHandle();

		System.out.println("Parent ID is " + parent);

		driver.findElement(By.id("button1")).click();

		Set<String> allWindows = driver.getWindowHandles();

		ArrayList<String> tabs = new ArrayList<>(allWindows);

		driver.switchTo().window(tabs.get(1));

		System.out.println("Child ID is :" + tabs.get(1));

		Thread.sleep(5000);

		driver.switchTo().window(parent); // this is also parent window
		System.out.println("Parent ID is :" + parent);

		Thread.sleep(5000);

		driver.switchTo().window(tabs.get(1));
		System.out.println("Child ID is :" + tabs.get(1));

		Thread.sleep(3000);

		driver.close();

		driver.switchTo().window(tabs.get(0)); // this is also parent window
		System.out.println("Parent ID is :" + tabs.get(0));

		Thread.sleep(3000);

		driver.close();

	}

}
