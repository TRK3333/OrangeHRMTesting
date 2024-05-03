package com.OrangeHRM.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider {
Properties pro;

public ConfigDataProvider() {
	File src = new File("D:\\Ramakrishna -eclipseworkspace\\Automation_Testing\\OrangeHRMProject\\Configuration\\config.properties");
	
	try {
		FileInputStream fis = new FileInputStream(src);
		pro = new Properties();
		pro.load(fis);
	}catch (Exception e) {
		System.out.println("Not able to load Properties file"+ e.getMessage());
	}
}
	public String getBrowser() {
		return pro.getProperty("browser");
	}
	public String getStringUrl() {
		return pro.getProperty("testurl");
	}
}

