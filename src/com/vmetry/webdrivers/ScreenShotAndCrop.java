package com.vmetry.webdrivers;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotAndCrop {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		File screenshot;
		System.setProperty("webdriver.chrome.driver",
				"F:\\Java Files\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://jqueryui.com");
		Dimension dim = new Dimension(1200, 800);
		driver.manage().window().setSize(dim);
		Thread.sleep(2000);

		

		 screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(screenshot, new File("F:\\Java Files\\Source code\\Selinium Java\\ScreenShot\\JQueryUI.png"));
		
		 Thread.sleep(3000);

			BufferedImage srcImg = ImageIO.read(screenshot);
			WebElement logo = driver.findElement(By.xpath(".//*[@id='logo-events']/h2/a"));
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
					new File("F:\\Java Files\\Source code\\Selinium Java\\ScreenShot\\JqueryLogo.png"));
			Thread.sleep(3000);
			driver.quit();

	}

}
