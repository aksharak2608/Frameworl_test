package com.testdemo.unittest;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class extent_reports {
	
	@Test
	public void test()
	{ 

		 ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark.html");
		 
		 ExtentReports extent = new ExtentReports();
		 extent.attachReporter(spark);
		 extent.createTest("MyFirstTest")
		   .log(Status.PASS, "This is a logging event for MyFirstTest, and it passed!");
		 extent.flush();

		
	}

}
