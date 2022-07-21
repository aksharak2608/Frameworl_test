package com.testdemo.unittest;

import org.testng.annotations.Test;

import com.testdemo.DataProvider.ExcelDataProvider;

public class login {
	@Test
	void login_home()
	{
	//ExcelDataProvider excel= new ExcelDataProvider();
		String username= ExcelDataProvider.ExcelDatavalue("crm", 0, 0);
		System.out.println(username);
		String password= ExcelDataProvider.ExcelDatavalue("crm", 0,1);
		System.out.println(password);
	}

}
