package com.testdemo.unittest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Configdatareder {
	@Test
	void readconfigfile()
	{	try {				
		File src= new File("C:\\Users\\SUHARIKA\\eclipse-workspace\\FrameworkTest\\Config\\config.properties");
	
			FileInputStream fis=new FileInputStream(src);
			Properties pro= new Properties();
			pro.load(fis);
			
			String browser=(String) pro.get("Browser");
			System.out.println(browser);
			String version=pro.getProperty("url");
			System.out.println(version);
			
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
