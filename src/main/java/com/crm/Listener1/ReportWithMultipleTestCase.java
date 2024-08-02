package com.crm.Listener1;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ReportWithMultipleTestCase implements ITestListener {
	ExtentReports report;
	ExtentSparkReporter spark;
	ExtentTest test;

	@Override
	public void onTestStart(ITestResult result) {
		String t_name=result.getMethod().getMethodName();
		Reporter.log(t_name +"Is exicuted");
		test=report.createTest(t_name);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String t_name=result.getMethod().getMethodName();
		test.log(Status.PASS,t_name +"Is Success");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String t_name=result.getMethod().getMethodName();
		test.log(Status.FAIL,t_name +"Is Failure");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String t_name=result.getMethod().getMethodName();
		test.log(Status.SKIP,t_name +"Is Skipped");
	}

	@Override
	public void onStart(ITestContext context) {
		spark= new ExtentSparkReporter("./Reports/multipleTestCase.html");
		spark.config().setDocumentTitle("Multiple Test Case");
		spark.config().setReportName("Vaibhav");
		spark.config().setTheme(Theme.DARK);
		report = new ExtentReports();
		report.setSystemInfo("OS","Window-11");
		report.setSystemInfo("Browser","chrome-100");
		report.attachReporter(spark);
	}

	@Override
	public void onFinish(ITestContext context) {
		report.flush();
	}

}
