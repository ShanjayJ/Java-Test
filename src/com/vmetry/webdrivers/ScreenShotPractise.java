package com.vmetry.webdrivers;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotPractise {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"F:\\Java Files\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://in.yahoo.com/");
		driver.manage().window().maximize();

		File screenshot;
		screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot,
				new File("F:\\Java Files\\Source code\\Selinium Java\\ScreenShot\\Yahoo.png"));

		BufferedImage srcImg = ImageIO.read(screenshot);
		WebElement logo = driver.findElement(By.id("uh-logo"));
		Point pt;
		pt = logo.getLocation();
		int xAxis, yAxis, width, height;
		xAxis = pt.getX();
		yAxis = pt.y;
		width = logo.getSize().width;
		height = logo.getSize().getHeight();

		BufferedImage destImg = srcImg.getSubimage(xAxis, yAxis, width, height);
		ImageIO.write(destImg, "png", screenshot);
		FileUtils.copyFile(screenshot,
				new File("F:\\Java Files\\Source code\\Selinium Java\\ScreenShot\\Yahoo_logo.png"));

		Thread.sleep(3000);
		driver.quit();

	}

}
