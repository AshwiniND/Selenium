package com.utility;

import java.io.File;
import java.io.FileInputStream;
//import java.io.IOException;
//import java.util.ArrayList;

//import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//import com.excel.utility.Xls_Reader;

public class UtilityClass {
	//static Xls_Reader reader;
	static XSSFWorkbook wb;
	static XSSFSheet S1;
	public static Object[][] getDataFromExcel(String sheetname) throws Exception{
		
		//ArrayList<Object[]> myData = new ArrayList<Object[]>();
		
		File fl = new File("C:\\Users\\AshwiniND\\eclipse-workspace\\SeleniumAsh\\src\\DataProviderTestNG.xlsx");
		FileInputStream fis = new FileInputStream(fl);
		 wb = new XSSFWorkbook(fis);
		 S1 = wb.getSheetAt(0);
		 
		 Object[][] data =new Object[S1.getLastRowNum()][S1.getRow(0).getLastCellNum()];
		 
		 for(int i=0;i<S1.getLastRowNum();i++) {
			 for(int k=0;k<=S1.getRow(0).getLastCellNum();k++) {
				 data[i][k] = S1.getRow(i+1).getCell(k).toString();
			 }
		 }
		 
		/*//reader = new Xls_Reader("C:\\Users\\AshwiniND\\eclipse-workspace\\SeleniumAsh\\src\\DataProviderTestNG.xlsx"));
		for(int rowNum=2 ; rowNum<= S1.getLastRowNum(); rowNum++) {
			//XSSFRow name = S1.getRow(rowNum);
			for (int colNum=1;colNum<=S1.getLastRowNum();colNum++)
			{		
				String name= S1.getRow(rowNum).getCell(colNum).getStringCellValue();
			   //  String surname = reader.getCellData("Sheet1","surname", rowNum);
			//String mobile = reader.getCellData("Sheet1","mobile", rowNum);
			//String  password= reader.getCellData("Sheet1","password", rowNum);
			//String newpass = reader.getCellData("Sheet1","newpass", rowNum);
			//String ash = wb.get
			}
		Object[] name = null;
			//myData.add(new Object[] {name,surname,mobile,password,newpass});
			//Object ob[]= {name, surname,mobile,password,newpass};
			myData.add(name);
			}
			*/
		//String name = S1.getRow(1).getCell(0).getStringCellValue();
		//System.out.println(name);
		
		
		return data;
	}

}
