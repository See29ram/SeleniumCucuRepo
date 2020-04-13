package com.webdriverlearn.excelutils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReaderOld {

	
	public static void main(String[] args) {
		XSSFWorkbook wb = null;
		
		File file=new File("D:\\\\Projects\\\\TestData.xlsx");
		try {
			FileInputStream fis=new FileInputStream(file);
			wb=new XSSFWorkbook(fis);
			
			XSSFSheet sheet=wb.getSheet("Sheet1");
			
			for(int row=sheet.getFirstRowNum();row<=sheet.getLastRowNum();row++)
			{
				
				XSSFRow crow=sheet.getRow(row);
				for(int col=crow.getFirstCellNum();col<crow.getLastCellNum();col++)
				{
					XSSFCell ccell=crow.getCell(col);
					switch(ccell.getCellTypeEnum())
					{
					case BLANK:
						System.out.println("");
						break;
					case NUMERIC:	
						System.out.println(ccell.getNumericCellValue());
						break;
					case STRING:
						System.out.println(ccell.getStringCellValue());
						break;
					default:
						System.out.println("Nothing found");
						break;
					}
				}
				
				
			}
			
			
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
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
	}
	
	
}
