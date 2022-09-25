package com.lms.ui.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	
	WebDriver driver;
	
	public  WebDriver initialiseDriver()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://lms-frontend-phase2.herokuapp.com/");
		driver.manage().window().maximize();
		return driver;
	}
}
