package com.testdemo.Testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.testdemo.DataProvider.ExcelDataProvider;
import com.testdemo.DataProvider.dataProvider;
import com.testdemo.pages.BaseClass;
import com.testdemo.pages.Login;
import com.testdemo.pages.Logout;

public class LogoutTest extends BaseClass {
	
	Logout logoutp;
	Login loginp;
	@Test
	void test()
	{
		logger=reports.createTest("loginpage","loginto crm");
		loginp=PageFactory.initElements(driver, Login.class);
		
		dataProvider.ExcelDataprovidergetdata();
		String username= ExcelDataProvider.ExcelDatavalue("crm", 0, 0);
		System.out.println(username);
		String password= ExcelDataProvider.ExcelDatavalue("crm", 0,1);
		System.out.println(password);
		loginp.enterusername(username);
		loginp.enterpassword(password);
		loginp.submit();
	
		logger= reports.createTest("logout","logout of crm");
		logoutp= PageFactory.initElements(driver, Logout.class);
		logoutp.Welcomelink();
		logoutp.logoutlink();
		
	}
}
