package com.testdemo.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.testdemo.BrowserFactory.EndBrowser;
import com.testdemo.BrowserFactory.StartBrowser;
import com.testdemo.DataProvider.ConfigDataReder;
import com.testdemo.DataProvider.dataProvider;
import com.testdemo.utility.Helper;


public class BaseClass {
	public static ExtentHtmlReporter html;
	public static ExtentReports reports;
	public static ExtentTest logger;
	public static WebDriver driver=null;
	
	@BeforeSuite
	public void StattusReport()
	{
	
		String datef=Helper.getdate();
		
		 html= new ExtentHtmlReporter(System.getProperty("user.dir")+"Reports/report_"+datef+".html");
		reports= new ExtentReports();
		reports.attachReporter(html);
		
	}
	
	@AfterMethod
	public void ResultReport(ITestResult result)
	{
		
		if(result.getStatus()==ITestResult.SUCCESS)
		{
			logger.log(Status.PASS, "Test Passed");
			try {
				MediaEntityBuilder.createScreenCaptureFromPath(Helper.Screenshoot(driver)).build();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		else if(result.getStatus()==ITestResult.FAILURE)
		{
			logger.log(Status.FAIL,"Test status is Failed");
			System.out.println(result.getThrowable().getMessage());
			try {
				MediaEntityBuilder.createScreenCaptureFromPath(Helper.Screenshoot(driver)).build();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else if(result.getStatus()==ITestResult.SKIP)
			logger.log(Status.SKIP,"Test status is skipped");
		
		reports.flush();
		
	}
	@BeforeClass
	public void StartSession()
	{
		//ConfigDataReder obj= new ConfigDataReder();
		dataProvider.getConfigData();
		String browser=ConfigDataReder.getProperty("Browser");
		
		String url=ConfigDataReder.getProperty("url");
		System.out.println(browser);
		
		driver=StartBrowser.LaunchBrowser(browser, url);
	}
	@AfterClass
	public void EndSession()
	{
		EndBrowser.closebrowser(driver);
		
	}
	
	
	
	
	
	
	

}
