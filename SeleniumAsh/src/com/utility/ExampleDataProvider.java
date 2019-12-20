package com.utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExampleDataProvider {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File xlFile = new File("C:\\Users\\AshwiniND\\Desktop\\DataProviderTestNG.xlsx");
		FileInputStream fis = new FileInputStream(xlFile);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet Sheet1 = wb.getSheetAt(0);
		Iterator<Row> rowIt = Sheet1.iterator();
		
		while(rowIt.hasNext()) {
			Row row= rowIt.next();
			
			Iterator<Cell> cellIt = row.cellIterator();
			
			while(cellIt.hasNext()) {
				Cell cell = cellIt.next();
				System.out.println(cell.toString()+";");
			}
			System.out.println();
		}
		wb.close();
		fis.close();
	}

}
