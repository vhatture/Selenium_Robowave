package com.crm.Listener1;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.crm.advance_selenium.BaseClassDWS;

public class BasicLisener extends BaseClassDWS implements ITestListener {
	@Override
	public void onTestStart(ITestResult result) {
		
		String name = result.getMethod().getMethodName();
		Reporter.log(name, true);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		Reporter.log("onTestSuccess",true);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		LocalDateTime Date= LocalDateTime.now();
		String time=Date.toString().replace(":", "-");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File from =ts.getScreenshotAs(OutputType.FILE);
		File to =new File("./ScreenShot/DWSPage"+time+".png");
		try {
			FileHandler.copy(from, to);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

	
}
