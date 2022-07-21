package com.testdemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	WebDriver driver;
	By username= By.id("txtUsername");
	By password=By.id("txtPassword");
	By submit= By.name("Submit");
	
	public Login(WebDriver ldriver)
	{
		driver=ldriver;
		//this.driver=driver;
	}
	public void enterusername(String user)
	{
		driver.findElement(username).sendKeys(user);
	}
	public void enterpassword(String user)
	{
		driver.findElement(password).sendKeys(user);
	}
	public void submit()
	{
		driver.findElement(submit).click();
	}
	
	


}
