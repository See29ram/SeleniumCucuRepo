package com.webdriverlearn.classloader;

import java.net.URL;

public class AbsPath {

	
	
	public static void main(String[] args) {
		
		
		Class cls=AbsPath.class;
		ClassLoader cl=cls.getClassLoader();
		
		URL url=cl.getResource("./chromedriver.exe");
		System.out.println(url);
	}
	
	
}
