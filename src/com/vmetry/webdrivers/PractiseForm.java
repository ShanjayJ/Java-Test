package com.vmetry.webdrivers;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PractiseForm {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"F:\\Java Files\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-form/");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, 10);

		String sex = "Male", exp = "4", Todate = "14-10-1993", prof = "Automation Tester", tools = "Selenium Webdriver",
				conti = "South America";

		WebElement fname, lname, commands;
		fname = driver.findElement(By.cssSelector("input[name^='first']"));
		fname.sendKeys("Sanjay");

		lname = driver.findElement(By.xpath("//input[@name='lastname']"));
		lname.sendKeys("Joe");

		WebElement sexcd = driver.findElement(By.xpath(getSexcd(sex)));
		if (sexcd.getAttribute("Value").equalsIgnoreCase(sex)) {
			if (sexcd.isDisplayed()) {
				if (sexcd.isEnabled()) {
					if (!sexcd.isSelected()) {
						sexcd.click();
					}
				}
			}

		}
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		List<WebElement> expr = driver.findElements(By.xpath("//input[@name='exp']"));
		for (WebElement experience : expr) {
			if (experience.getAttribute("Value").equalsIgnoreCase(exp)) {
				if (experience.isDisplayed()) {
					if (experience.isEnabled()) {
						if (!experience.isSelected()) {
							experience.click();
							break;
						}
					}
				}
			}
		}

		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("datepicker"))); // explicit wait
		WebElement date = driver.findElement(By.id("datepicker"));
		date.sendKeys(Todate);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		WebElement profession = driver.findElement(By.xpath(getProfession(prof)));
		if (profession.getAttribute("Value").equalsIgnoreCase(prof)) {
			if (profession.isDisplayed()) {
				if (profession.isEnabled()) {
					if (!profession.isSelected()) {
						profession.click();
					}
				}
			}

		}
		driver.findElement(By.id("photo")).sendKeys("C:\\Users\\shanj\\Desktop\\Shanjay\\Shanjay_pic.JPG");

		driver.findElement(By.linkText("Selenium Automation Hybrid Framework")).click();

		driver.findElement(By.partialLinkText("Test File to")).click();

		// List<WebElement> autoTool = driver.findElements(By.name("tool"));
		// for (WebElement tool : autoTool) {
		// if (tool.getAttribute("Value").equalsIgnoreCase(tools)) {
		// if (tool.isDisplayed()) {
		// if (tool.isEnabled()) {
		// if (!tool.isSelected()) {
		// tool.click();
		// break;
		// }
		// }
		// }
		// }
		// }

		WebElement continent = driver.findElement(By.id("continents"));
		Select dropdown = new Select(continent);
		dropdown.selectByVisibleText(conti);

		commands = driver.findElement(By.id("selenium_commands"));
		Select dropdown2 = new Select(commands);
		dropdown2.selectByIndex(2);

		driver.findElement(By.id("submit")).click();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.quit();

	}

	public static String getSexcd(String sex) {
		String loc;
		loc = "//input[@value='" + sex + "']";
		System.out.println(loc);
		return loc;
	}

	public static String getProfession(String Profes) {
		String loc;
		loc = "//input[@value='" + Profes + "']";
		return loc;

	}

}
