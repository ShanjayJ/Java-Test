package com.vmetry.webdrivers;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CropScreenShotFrmLocal {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"F:\\Java Files\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		Dimension dim = new Dimension(1200, 800);
		driver.manage().window().setSize(dim);
		Thread.sleep(2000);
		File src = new File("F:\\Java Files\\Source code\\Selinium Java\\ScreenShot\\Facebook.png");

		BufferedImage srcImg = ImageIO.read(src);
		WebElement logo = driver.findElement(By.cssSelector(".fb_logo.img.sp_ex0C8BIsLat.sx_7401de"));
		Point pt;
		int xAxis, yAxis, width, height;
		pt = logo.getLocation();
		xAxis = pt.getX();
		yAxis = pt.y;
		width = logo.getSize().width;
		height = logo.getSize().getHeight();
		BufferedImage destImg;
		destImg = srcImg.getSubimage(xAxis, yAxis, width, height);
		ImageIO.write(destImg, "png", src);
		FileUtils.copyFile(src,
				new File("F:\\Java Files\\Source code\\Selinium Java\\ScreenShot\\FacebookLogo2.png"));


	}

}
