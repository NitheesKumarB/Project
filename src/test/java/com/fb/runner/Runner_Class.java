package com.fb.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import io.github.bonigarcia.wdm.WebDriverManager;



@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\facebook\\feature\\Facebook.Feature"
,glue = "org.facebook.stepdefinition"
,monochrome = true

)


		

public class Runner_Class {
	
	
	public static WebDriver driver;
	
	@BeforeClass   // to execute this method before the execution of test scenarios
	public static void browser() {
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		
	}
	@AfterClass   // to execute this method after the execution of test scenarios
	public static void close() {
//		driver.close();
		
	}
	
	
	
	

}
