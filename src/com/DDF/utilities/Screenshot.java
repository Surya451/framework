package com.DDF.utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.DDF.base.BaseTest;
import com.google.common.io.Files;

public class Screenshot {

	
	
	public static String takeScreenshot() throws IOException {
         
		String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot ts = (TakesScreenshot)BaseTest.driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String destination = "./target/" + dateName+ ".png";
		File finalDestination = new File(destination);
		FileUtils.copyFile(source, finalDestination);
		return destination;
	
		
	}
	
	
	
	
	
}
