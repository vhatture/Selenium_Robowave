package com.crm.advance_selenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	public static String getData(String sheetName,int row, int cell) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("C:\\New folder\\ReadExcel.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet= wb.getSheet(sheetName);
		return sheet.getRow(row).getCell(cell).toString();
	} 

}
