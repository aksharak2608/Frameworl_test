package com.testdemo.utility;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Helper {
	public static String getdate()
	{
		DateFormat df= new SimpleDateFormat("YYMMddHHmmss"); 
		Date d= new Date();
		String date=df.format(d);
		return date;
		
	}
	public static String Screenshoot(WebDriver driver)
	{
				 
		TakesScreenshot ts= (TakesScreenshot)driver;
		File src =ts.getScreenshotAs(OutputType.FILE);
		
		File dest=new File(System.getProperty("user.dir")+"/Screenshot/selenium"+getdate()+".png");
		try {
			FileHandler.copy(src,dest);
			}
		catch (IOException e) {
			
			System.out.println("File not copied"+e.getMessage());
			
		}
		return System.getProperty("user.dir")+"/Screenshot/selenium"+getdate()+".png";
	}
	public static WebDriver waitandclick(WebDriver driver, By ele)
	{

		WebDriverWait wait= new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(ele)));
		driver.findElement(ele).click();
		return driver;
	}
}
