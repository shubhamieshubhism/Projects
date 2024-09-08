package FrameWork;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class InsertDataToExcel {

	//public static void main(String[] args) throws Throwable 
	@Test
	public void dataToExcel() throws Throwable, IOException
	{

		
		
		
		FileInputStream fes = new FileInputStream("C:\\shubham\\Selenium\\excelfile.xlsx");
		Workbook book = WorkbookFactory.create(fes);
		Sheet sheet = book.getSheet("Sheet1");
		Row row = sheet.createRow(6);
		Cell cell = row.createCell(6);
		cell.setCellValue("high neck");
		
		FileOutputStream fes1 = new FileOutputStream("C:\\shubham\\Selenium\\excelfile.xlsx");
	    book.write(fes1);
	    book.close();
	}
	
}


