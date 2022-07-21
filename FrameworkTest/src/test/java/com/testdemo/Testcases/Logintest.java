package com.testdemo.Testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.testdemo.DataProvider.ExcelDataProvider;
import com.testdemo.pages.BaseClass;
import com.testdemo.pages.Login;
import com.testdemo.DataProvider.dataProvider;

public class Logintest extends BaseClass {
	Login loginpage;
	@Test
	void test()
	{
		logger=reports.createTest("loginpage","loginto crm");
		loginpage=PageFactory.initElements(driver, Login.class);
		
		dataProvider.ExcelDataprovidergetdata();
		String username= ExcelDataProvider.ExcelDatavalue("crm", 0, 0);
		System.out.println(username);
		String password= ExcelDataProvider.ExcelDatavalue("crm", 0,1);
		System.out.println(password);
		loginpage.enterusername(username);
		loginpage.enterpassword(password);
		loginpage.submit();
	}
	
}
