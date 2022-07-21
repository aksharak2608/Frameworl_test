package com.testdemo.DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelDataProvider {
	static XSSFWorkbook wb;
	
public	ExcelDataProvider( )
	{	try {			
		String sr=System.getProperty("user.dir");
		File src= new File(sr+"\\TestData\\testdata.xlsx");
	
			FileInputStream fis=new FileInputStream(src);
			wb=new XSSFWorkbook(fis);
			//wb.getSheet(sheetname).getRow(row).getCell(coll).getStringCellValue();
			
			
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static String ExcelDatavalue(String sheetname, int row, int coll)
	{
		
		return wb.getSheet(sheetname).getRow(row).getCell(coll).getStringCellValue();
		
	}


}
