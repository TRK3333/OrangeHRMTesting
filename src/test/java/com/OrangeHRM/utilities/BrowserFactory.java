package com.OrangeHRM.utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserFactory {
	@SuppressWarnings("deprecation")
	public static WebDriver startApplication(WebDriver driver,String browserName,String appUrl) {
		
		if(browserName.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver","D:/Ramakrishna -eclipseworkspace/Automation_Testing/PracticingAutomationTesting/Drivers/chromedriver.exe" );
			ChromeOptions co=new ChromeOptions();
			co.addArguments("-- remote allow origin");
			driver = new ChromeDriver(co);
		}
		else if (browserName.equals("Edge")) {
			System.setProperty("webdriver.chrome.driver", "D:\\Ramakrishna -eclipseworkspace\\Automation_Testing\\OrangeHRMProject\\Drivers\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		else
		{
			System.out.println("Invalid Browser");
		}
		driver.manage().window().maximize();
		driver.get(appUrl);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		return driver;
	}
	public static void quitBrowser(WebDriver driver) {
		driver.quit();
	}
}
