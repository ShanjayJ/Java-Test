package com.java.windows;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingDemo2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"F:\\Java Files\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://toolsqa.com/automation-practice-switch-windows/");

		String parent = driver.getWindowHandle();

		System.out.println("Parent Window ID is " + parent);

		driver.findElement(By.id("button1")).click();

		Set<String> allWindows = driver.getWindowHandles();

		for (String child : allWindows) {

			if (!parent.equalsIgnoreCase(child)) {
				driver.switchTo().window(child);
				System.out.println("Child Window ID is " + child);
				Thread.sleep(3000);
				driver.close();
			}
		}
		
		Thread.sleep(5000);

		driver.switchTo().window(parent);

		driver.close();

	}

}
