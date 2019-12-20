package com.utility;

import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readExcel {
	XSSFWorkbook wb;
	XSSFSheet Sheet1;

	public readExcel(String excelPath) {
		// TODO Auto-generated method stub
		try {
			File xlFile = new File(excelPath);
			FileInputStream fis = new FileInputStream(xlFile);
			wb = new XSSFWorkbook(fis);
			
				} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

	}
	public String getData(int sheetnum, int row , int col) {
		Sheet1 = wb.getSheetAt(0);
		String data = Sheet1.getRow(row).getCell(col).getStringCellValue();
		return data;
	}

}
