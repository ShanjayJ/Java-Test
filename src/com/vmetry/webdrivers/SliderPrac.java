package com.vmetry.webdrivers;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.SkipException;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SliderPrac {
	WebDriver driver;
	WebElement frame, slideHdlr, slideScale;

	@Test(priority = 0)
	public void init() {
		System.setProperty("webdriver.chrome.driver",
				"F:\\Java Files\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("http://jqueryui.com/slider/");
		driver.manage().window().maximize();
		driver.quit();
		throw new SkipException("This Testcase is Skipped");
	}

	@Test(priority = 1)
	public void Slider() {
		System.setProperty("webdriver.chrome.driver",
				"F:\\Java Files\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("http://jqueryui.com/slider/");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, 10);

		frame = driver.findElement(By.className("demo-frame"));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frame));

		slideScale = driver.findElement(By.id("slider"));
		System.out.println(slideScale.getSize().getWidth());
		int totWidth = slideScale.getSize().getWidth();

		slideHdlr = driver.findElement(By.xpath(".//*[@id='slider']/span"));

		int sliderWidth = 370;
		if (sliderWidth <= totWidth) {
			Actions act = new Actions(driver);
			act.clickAndHold(slideHdlr).moveByOffset(sliderWidth, 0).release().build().perform();
		}

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.quit();

	}

	@Test(priority = 2)
	@Parameters({ "browser", "url", "srchkey", "srchwrd" })
	public void AutoComplete(String browser, String url, String srchKey, String srchwrd) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"F:\\Java Files\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"F:\\Java Files\\Browser Drivers\\geckodriver-v0.19.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.navigate().to(url);
		driver.manage().window().maximize();

		WebDriverWait wait = new WebDriverWait(driver, 10);

		driver.findElement(By.linkText("Autocomplete")).click();

		frame = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(frame);

		WebElement textBox = driver.findElement(By.id("tags"));
		textBox.sendKeys(srchKey);

		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.className("ui-menu-item")));

		List<WebElement> autoCpltOpt = driver.findElements(By.className("ui-menu-item"));
		for (WebElement opt : autoCpltOpt) {
			if (opt.getText().trim().equalsIgnoreCase(srchwrd)) {
				opt.click();
				break;
			}
		}

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.quit();

	}

}
