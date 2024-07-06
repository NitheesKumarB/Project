package com.fb.runner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.pom.Pom_Class;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Runner_1 {
	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
//     WebElement username = driver.findElement(By.id("email"));
//		username.sendKeys("qwerty");
		
		Pom_Class c = new Pom_Class(driver);
		c.getUsername().sendKeys("awedfgh2");
		
		
		
	}
	
		
		
		
		
		
		
	}
		
	
	
	
	
	
	
	
	
		
		
	
	
	
	
	
	
	
	
	


