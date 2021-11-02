package com.auto.frmwrk;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserSetup {

	public static String cv_browser_nme = null;
	
	//Creating Singleton class for only one working instance 
	
	//Condition no1 : Have private constructor
	private BrowserSetup() {
		
	}

	// condition no 2 create private static object
	private static BrowserSetup insatnce = null;
	
	public static BrowserSetup getInstance() {
		
	// Return already created instance
	// or create new only when called for first time
		
		   if(insatnce == null) {
			   insatnce = new BrowserSetup(); 
		   }
		   
		   return insatnce;
	}
	
	public WebDriver initWebDriver(String pr_Browser) {
		
		cv_browser_nme = pr_Browser.toLowerCase();
		
		switch(cv_browser_nme) {
		case "crome":
			System.setProperty("webdriver.chrome.driver", "G:\\JAVASRC\\SileniumBDD\\DriverExes\\Chrome\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demoqa.com/");			   
			return driver;
		default:
			System.out.println("Invalid Browser Name !!!");			  
		
		}
		return null;
		
	}

}
