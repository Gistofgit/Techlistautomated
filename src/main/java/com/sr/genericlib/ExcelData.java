package com.sr.genericlib;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelData implements AutoConstant{
	
	/**
	 * To get data from excel file
	 * @param sheetname
	 * @param rownum
	 * @param cellnum
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	
	public String getexcelData(String sheetname, int rownum, int cellnum) throws EncryptedDocumentException, IOException {
		FileInputStream f = new FileInputStream(excelpath);
		Workbook wb = WorkbookFactory.create(f);
		return wb.getSheet(sheetname).getRow(rownum).getCell(cellnum).getStringCellValue();
	}
}
