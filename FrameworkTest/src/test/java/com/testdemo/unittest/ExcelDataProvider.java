package com.testdemo.unittest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelDataProvider {
	static XSSFWorkbook wb;
	
	ExcelDataProvider( )
	{	try {				
		File src= new File("C:\\Users\\SUHARIKA\\eclipse-workspace\\FrameworkTest\\TestData\\testdata.xlsx");
	
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
		wb.getSheet(sheetname).getRow(row).getCell(coll).getStringCellValue();
		return null;
		
	}


}
