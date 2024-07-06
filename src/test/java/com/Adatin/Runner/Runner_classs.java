package com.Adatin.Runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/com/adactin/Adactin.feature"
,glue = "com.step_def.adactin")
public class Runner_classs {
	
	public static WebDriver driver;
	@BeforeClass  // execute before all the methods will execute
	public static void browser() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		
	}
	@AfterClass   // execute after when all the methods are executed
	public static void clos() {
		driver.close();
	}
	
	
	
	

}
