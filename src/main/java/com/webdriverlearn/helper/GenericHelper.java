package com.webdriverlearn.helper;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class GenericHelper {

	private static GenericHelper genericHelp;
	private static WebDriver ddr;
	private GenericHelper(WebDriver dr)
	{
		ddr=dr;
	}
	
	
	
	public static GenericHelper getInstance(WebDriver dr)
	{
		
		if(genericHelp==null|| ddr.hashCode()!=dr.hashCode())
		{
			genericHelp=new GenericHelper(dr);
		}
		return genericHelp;
		
	}
	
	
	public void takeScreenshot(String fileDir,String fileName)
	{
		
		
		File directory=new File(fileDir);
		if(!directory.exists())
			directory.mkdirs();
		File file=((TakesScreenshot)ddr).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file,new File(directory.getAbsolutePath()+File.separator+fileName));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   
		
		
	}
	
	public byte[] takeScreenshot()
	{
		return ((TakesScreenshot)ddr).getScreenshotAs(OutputType.BYTES);
	}
	
}
