package com.webdriver.getutils;

import java.io.File;
import java.io.FileInputStream;

import java.util.Properties;

public class ReadConfig implements IReader {

	private Properties properties;

	private void initPropFile(String fileName) {

		if (IsDefaultFile(fileName)) {
			properties = ReadConfigFileData("config.properties");
		}

		else {
			properties = ReadConfigFileData(fileName);
		}

	}

	public ReadConfig(String fileName) {
		initPropFile(fileName);
	}

	public ReadConfig() {
		initPropFile("");
	}

	private Properties ReadConfigFileData(String fileName) {

		Properties prop = new Properties();
		try {
			String filePath = ResourcePath.getResourcePath(fileName);
			FileInputStream fis = new FileInputStream(new File(filePath));
			prop.load(fis);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e.getMessage());
		}
		return prop;

	}

	private boolean IsDefaultFile(String fileName) {
		if ("".equalsIgnoreCase(fileName))
			return true;
		return false;
	}

	@Override
	public String getApplicationUrl() {
		// TODO Auto-generated method stub
		return properties.getProperty("Url");
	}

	@Override
	public String getUserName() {
		// TODO Auto-generated method stub
		return properties.getProperty("UserName");
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return properties.getProperty("Password");
	}

	@Override
	public int getExplicitWait() {
		// TODO Auto-generated method stub
		return Integer.parseInt(properties.getProperty("ExplicitWait"));
	}

	@Override
	public String getBrowserType() {
		// TODO Auto-generated method stub
		return properties.getProperty("Browser");
	}

}
