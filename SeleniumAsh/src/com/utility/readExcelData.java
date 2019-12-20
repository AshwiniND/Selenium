package com.utility;

public class readExcelData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		readExcel exl = new readExcel("C:\\Users\\AshwiniND\\Desktop\\DataProviderTestNG.xlsx");
		
		for(int i=0;i<=2;i++) {
			for (int j=0;j<=4;j++) {
				System.out.println(exl.getData(0,i,j));
			}
		}
		

	}

}
