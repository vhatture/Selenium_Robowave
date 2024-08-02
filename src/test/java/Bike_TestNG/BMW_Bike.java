package Bike_TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BMW_Bike {
	@Test(groups = "smoke")
	public  void BMW() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.bmw-motorrad.in/en/models/modeloverview.html");
		Thread.sleep(3000);
		driver.close();

	}

}
