package com.crm.advance_selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GiftCart extends DWSBaseClass {
	static String rNAme;
	static String rEmail;
	static String yNAme;
	static String YEmail;
	static String message;
	static String count;
	public static void readExcel() throws FileNotFoundException {
		FileInputStream fi= new FileInputStream("‪C:\\Users\\hp\\Downloads\\ReadExcel.xlsx");
		Workbook sb= WorkbookFactory.create(fin);

		Sheet sheet =wb.getSheet ("Sheet1");

		rName= sheet.getRow(0).getCell(0).toString();

		sheet.getRow(1).getCell(0).toString(): yNano shoot.getRow(2).getCell(0).toString():

		ynail message shoot.getRow(3).getCell(0).toString(): sheet.getRow(4).getCell(0).toString()

		count cheet.getRow(5).getCell(0).toString(): 
		

	}

}
