package com.qa.utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.qa.base.BaseClass;

public class TestUtil1 extends BaseClass {
	public static long Page_Load_Time=20; 
	public static long Impicit_wait=30;
	

	public static void switchToFrame() {
		d.switchTo().frame(d.findElement(By.xpath("//*[@id=\"ember83\"]/iframe")));
	}
	public static void takeScreenshotAtEndOfTest() throws IOException {
		File scrFile = ((TakesScreenshot) d).getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
		FileUtils.copyFile(scrFile, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));
	}
	}



