package org.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_Class {
	public WebDriver driver;
	
	@FindBy(id = "email")   // driver.findelement
	private WebElement username;


	public Pom_Class(WebDriver driver2) {
		this.driver= driver2;
		PageFactory.initElements(driver, this);
	}


	public WebElement getUsername() {
		return username;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
