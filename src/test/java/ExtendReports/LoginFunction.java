package ExtendReports;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class LoginFunction {
	@Test
	public void BasicReport() throws InterruptedException {
		ExtentSparkReporter spark= new ExtentSparkReporter("./Reports/LoginReport.html");
		spark.config().setDocumentTitle("Sample Report");
		spark.config().setReportName("Vaibhav");
		spark.config().setTheme(Theme.STANDARD);
		ExtentReports report=new ExtentReports();
		report.setSystemInfo("OS", "Window-11");
		report.setSystemInfo("Browser", "chrome-100");
		report.attachReporter(spark);
		ExtentTest test=report.createTest("CorrectCredential");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("Email")).sendKeys("hatturevaibhav199@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Hatture@123");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		WebElement community_poll = driver.findElement(By.xpath("//strong[text()='Community poll']"));
		if (community_poll.isDisplayed(){
			test.log(Status.INFO,"community_poll is displayed");
			
		} else {
			test.log(Status.INFO,"Community_poll is not displayed");
		}
		
		report.flush();
	}

}
