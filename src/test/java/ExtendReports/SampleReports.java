package ExtendReports;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class SampleReports {
	@Test
	public void BasicReport() {
		ExtentSparkReporter spark= new ExtentSparkReporter("./Reports/sampleReport.html");
		spark.config().setDocumentTitle("Sample Report");
		spark.config().setReportName("Vaibhav");
		spark.config().setTheme(Theme.STANDARD);
		ExtentReports report=new ExtentReports();
		report.setSystemInfo("OS", "Window-11");
		report.setSystemInfo("Browser", "chrome-100");
		report.attachReporter(spark);
		ExtentTest test=report.createTest("BasicReport");
		test.log(Status.INFO,"report is successfully created");
		report.flush();
	}

}
