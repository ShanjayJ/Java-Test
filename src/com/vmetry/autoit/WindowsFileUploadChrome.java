package com.vmetry.autoit;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsFileUploadChrome {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"F:\\Java Files\\Browser Drivers\\chromedriver_win32_latest\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.tinyupload.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("uploaded_file")).click();
		Runtime.getRuntime().exec(System.getProperty("user.dir") + File.separator + "Config Files" + File.separator
				+ "File Upload Chrome.exe");

	}

}
