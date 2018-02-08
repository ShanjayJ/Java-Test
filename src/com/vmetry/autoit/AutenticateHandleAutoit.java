package com.vmetry.autoit;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.firefox.FirefoxDriver;

public class AutenticateHandleAutoit {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver",
				"F:\\Java Files\\Browser Drivers\\geckodriver-v0.19.0-win64\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.engprod-charter.net/");
		Runtime.getRuntime().exec(System.getProperty("user.dir") + File.separator + "Config Files" + File.separator + "AuthenticateHandle.exe");	
		
		

	}

}
