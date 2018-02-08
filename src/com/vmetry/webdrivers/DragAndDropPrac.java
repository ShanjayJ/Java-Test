package com.vmetry.webdrivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"F:\\Java Files\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://jqueryui.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Droppable")).click();

		WebElement frame;
		frame = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(frame);

		WebElement draggable = driver.findElement(By.id("draggable"));
		WebElement droppable = driver.findElement(By.id("droppable"));
		Actions act = new Actions(driver);
		// act.dragAndDrop(draggable, droppable).build().perform();

		act.clickAndHold(draggable).release(droppable).build().perform();

		driver.navigate().back();
		driver.quit();

	}

}
