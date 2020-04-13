package com.webdriver.getutils;




public class ResourcePath {

	
	public static String getResourcePath(String strResourceName)
	{
		
		String path=getAbsPath()+strResourceName;
		return path;
	}
	
	
	public static String getAbsPath()
	{
		
		
		String strAbsPath=ResourcePath.class.getClassLoader().getResource(".").getPath();
		System.out.println(strAbsPath);
	    return strAbsPath;
		
	}
	
	
	
	
	
	
}
