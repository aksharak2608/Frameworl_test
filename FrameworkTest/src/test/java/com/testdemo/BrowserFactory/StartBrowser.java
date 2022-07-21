package com.testdemo.BrowserFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StartBrowser {
	
	//public static WebDriver driver;
	
	
	public static WebDriver LaunchBrowser(String browser, String url)
	{
		System.out.println(browser+"   "+url);
		WebDriver driver=null;
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.out.println(browser+"   "+url);
			System.setProperty("webdriver.chrome.driver",
					"chromedriver.exe");
			 driver= new ChromeDriver();
			
		}
		else if(browser.equalsIgnoreCase("IE"))
		{
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Akshara\\Desktop\\selenium setup\\chromedriver.exe");
			 driver= new ChromeDriver();
			
		}
		
		
		
		driver.get(url);

		
		driver.manage().window().maximize();
		System.out.println(driver);
		return driver;
		
	}

}
