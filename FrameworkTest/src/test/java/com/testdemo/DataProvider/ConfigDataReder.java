package com.testdemo.DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigDataReder {
	static Properties pro;

	public ConfigDataReder() {
		try {
			File src = new File(System.getProperty("user.dir") + "\\Config\\config.properties");

			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static String getProperty(String key)
	{
	return pro.getProperty(key);
	}

}
