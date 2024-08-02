package com.crm.advance_selenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class BaseClass_oddeven {
public static class ExcelUtility {
		
		public static String getData(String sheetName,int row,int cell) throws EncryptedDocumentException, IOException
		{
			FileInputStream fis = new FileInputStream("‪C:\\Users\\hp\\Downloads\\ReadExcel.xlsx");
			Workbook w= WorkbookFactory.create(fis);
			Sheet exel = w.getSheet("Sheet3");
			return exel.getRow(row).getCell(cell).toString();
		}
		
	}

}
