package com.testdemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.testdemo.utility.Helper;

public class Logout {

	WebDriver driver;
	By Welcomelink=By.xpath("//a[contains(text(),'Welcome')]");
	By Logoutlink= By.xpath("//a[text()='Logout']");
	
	public Logout(WebDriver ldriver)
	{
		driver=ldriver;
		
	}
	public void Welcomelink()
	{
		driver=Helper.waitandclick(driver, Welcomelink);
	}
	public void logoutlink()
	{
		driver=Helper.waitandclick(driver, Logoutlink);
	}
}
