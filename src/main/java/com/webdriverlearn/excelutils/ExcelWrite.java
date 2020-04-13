package com.webdriverlearn.excelutils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {

	
	public static void main(String[] args) {
		
		
		XSSFWorkbook wb=null;
		FileOutputStream fos = null;
		
		File file=new File("D:\\Projects\\Write.xlsx");
		try {
			fos=new FileOutputStream(file);
			wb=new XSSFWorkbook();
			XSSFSheet sheet=wb.createSheet("DataSheet");
			XSSFRow row=sheet.createRow(0);
			XSSFCell cell=row.createCell(0, CellType.STRING);
			cell.setCellValue("Data123");
			wb.write(fos);
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				wb.close();
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
				
		
		
	}
	
	
}
