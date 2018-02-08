package com.vmetry.autoit;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleFileUploadAutoit {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver",
				"F:\\Java Files\\Browser Drivers\\geckodriver-v0.19.0-win64\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.vmetry.com/Upload.aspx");
		driver.manage().window().maximize();
		driver.findElement(By.id("ContentPlaceHolder1_FileUpload1")).click();
		Runtime.getRuntime().exec("F:\\Java Files\\Source code\\Java Test\\Config Files\\File Upload Multiple.exe" + " "
				+ "C:\\Users\\shanj\\Desktop\\Shanjay\\Shanjay_pic.jpg");
		Thread.sleep(3000);
		driver.findElement(By.id("ContentPlaceHolder1_FileUpload1")).click();
		Runtime.getRuntime().exec("F:\\Java Files\\Source code\\Java Test\\Config Files\\File Upload Multiple.exe" + " "
				+ "C:\\Users\\shanj\\Desktop\\Shanjay\\Resume\\Shanjayj.jpg");

	}

}
