package org.facebook.runner;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(Cucumber.class)
@CucumberOptions(features = "org"
,glue = "org.facebook.stepdefinition")
public class Runner_Class {
	
	public static WebDriver driver;
	
	public static void browser() {
		WebDriverManager.chromedriver().setup();
		
		 driver = new ChromeDriver();		
	}
	
	public static void close() {
		driver.close();
		
	}
	
	
	
	
	
	
	
}
