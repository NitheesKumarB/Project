package com.fb.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.fb.runner.Runner_Class;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Def {
	
	public static WebDriver driver = Runner_Class.driver;
	
	@Given("^user Login Into The Adactin Application$")
	public void user_Login_Into_The_Adactin_Application() throws Throwable {
	   driver.get("https://adactinhotelapp.com/index.php");
	}

	@When("^user Enter The Username In The Username Field$")
	public void user_Enter_The_Username_In_The_Username_Field() throws Throwable {
		driver.findElement(By.id("username")).sendKeys("NitheesGopii");
	    	}

	@When("^user Enter The Password In The Password Field$")
	public void user_Enter_The_Password_In_The_Password_Field() throws Throwable {
	    driver.findElement(By.id("password")).sendKeys("Bgopi@1711");
	}

	@Then("^user Click On Login Button And It Navigates To The Search Hotel Page$")
	public void user_Click_On_Login_Button_And_It_Navigates_To_The_Search_Hotel_Page() throws Throwable {
	    driver.findElement(By.id("login")).click();
	}
	@When("^user Select The Location In The Location Field$")
	public void user_Select_The_Location_In_The_Location_Field() throws Throwable {
		WebElement location = driver.findElement(By.xpath("//select[@name='location']"));
		Select s = new Select(location);
		s.selectByIndex(1);
	}

	@When("^user Select The Hotels In The Hotels Field$")
	public void user_Select_The_Hotels_In_The_Hotels_Field() throws Throwable {
		WebElement hotels = driver.findElement(By.xpath("//select[@name='hotels']"));
		Select s1 = new Select(hotels);
		s1.selectByIndex(1);
	}

	@When("^user Select The Room Type In The Room Type Field$")
	public void user_Select_The_Room_Type_In_The_Room_Type_Field() throws Throwable {
		WebElement  roomtype= driver.findElement(By.xpath("//select[@name='room_type']"));
		Select s2 = new Select(roomtype);
		s2.selectByIndex(2);
		
	}

	@When("^user Select The Number Of Rooms In The Number Of Rooms Field$")
	public void user_Select_The_Number_Of_Rooms_In_The_Number_Of_Rooms_Field() throws Throwable {
		WebElement nor = driver.findElement(By.xpath("//select[@name='room_nos']"));
		Select s3 = new Select(nor);
		s3.selectByIndex(3);
	}

	@When("^user Select The Number of Adults Per Room In The Adults Per Room Field$")
	public void user_Select_The_Number_of_Adults_Per_Room_In_The_Adults_Per_Room_Field() throws Throwable {
		WebElement apr = driver.findElement(By.xpath("//select[@name='adult_room']"));
		Select s4 = new Select(apr);
		s4.selectByIndex(2);
	}

	@When("^user Select The Number of Children Per Room In The Children Per Room Field$")
	public void user_Select_The_Number_of_Children_Per_Room_In_The_Children_Per_Room_Field() throws Throwable {
		WebElement cpr = driver.findElement(By.xpath("//select[@name='child_room']"));
		Select s5 = new Select(cpr);
		s5.selectByIndex(3);
	}

	@Then("^user Click On The Search Button And It Navigates To Select Hotel Page$")
	public void user_Click_On_The_Search_Button_And_It_Navigates_To_Select_Hotel_Page() throws Throwable {
		WebElement search = driver.findElement(By.xpath("//input[@name='Submit']"));
		search.click();
	}


}
