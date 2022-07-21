package com.testdemo.unittest;

import com.testdemo.DataProvider.ConfigDataReder;
import com.testdemo.DataProvider.ExcelDataProvider;

public class dataProvider {
	public static ExcelDataProvider ExcelDataprovidergetdata()
	{
		ExcelDataProvider excel= new ExcelDataProvider();
		return excel;
	}
	
	public static ConfigDataReder getConfigData()
	{
		ConfigDataReder obj= new ConfigDataReder();
		return obj;
	}

}
