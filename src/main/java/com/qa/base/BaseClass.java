package com.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.qa.utility.TestUtil1;

public class BaseClass {
	public static WebDriver d;
    public static Properties prop;
    public  static EventFiringWebDriver e_driver;
	//public static WebEventListener eventListener;
	public BaseClass() {
		try {
			prop = new Properties();
			FileInputStream fis=new FileInputStream("C:\\Users\\PARVEJ\\eclipse-workspace\\Com.qa.InsuranceProject\\src\\main\\java\\com\\qa\\config\\config.properties");
			prop.load(fis);
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void initialization() {
		String browser=prop.getProperty("browser");
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe\\");
	        d=new ChromeDriver();}
	        else if(browser.equals("Firefox")){
	        	System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
	            d=new FirefoxDriver();
	        }
		e_driver = new EventFiringWebDriver(d);
		// Now create object of EventListerHandler to register it with EventFiringWebDriver
		
		d = e_driver;
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.manage().timeouts().implicitlyWait(TestUtil1.Page_Load_Time,TimeUnit.SECONDS);
		d.manage().timeouts().pageLoadTimeout(TestUtil1.Impicit_wait,TimeUnit.SECONDS);
		d.get(prop.getProperty("url"));
		}
		
	}





