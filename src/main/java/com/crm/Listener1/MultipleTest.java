package com.crm.Listener1;

import java.time.LocalDateTime;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class MultipleTest implements ITestListener {
	ExtentSparkReporter spark;
	ExtentReports report;
	ExtentTest test;

	@Override
	public void onTestStart(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		Reporter.log("onTestStart"+methodName,true);
		test=report.createTest(methodName) ; //will create report for every test cases
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		test.log(Status.PASS, methodName+" is Passed") ;
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		test.log(Status.FAIL, methodName+" is failed") ;
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		test.log(Status.SKIP, methodName+" is skipped") ;
	}

	@Override
	public void onStart(ITestContext context) {
		LocalDateTime ldt= LocalDateTime.now();
		String date = ldt.toString().replace(":", "-") ;
		 spark =new ExtentSparkReporter("./Reports/DWSassingment.html"+"-"+date+"-"+".html");
		//configuration
		spark.config().setDocumentTitle("sample");
		spark.config().setReportName("Vaibhav");
		spark.config().setTheme(Theme.DARK);
		
		//create extent report
		 report =new ExtentReports();
		report.setSystemInfo("os", "Window") ;
		report.setSystemInfo("browser", "Chrome") ;
		
		//attached spark report to the extent report
		report.attachReporter(spark);
		
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
		report.flush();
	}
	
	

}