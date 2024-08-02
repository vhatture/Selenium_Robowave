package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DWS_pom {
	@Test
	public void login() throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demowebshop.tricentis.com/");
	DWS_Login ref= new DWS_Login(driver);
	Thread.sleep(3000);
	ref.login_link();
	ref.username("hatturevaibhav199@gmail.com");
	ref.password("Hatture@123");
	ref.remember();
	ref.login_button();
	
	}

}
