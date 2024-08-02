package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DWS_Reg_Main {
	@Test
	public void login() throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demowebshop.tricentis.com/");
	DWS_Register ref=new DWS_Register(driver);
	Thread.sleep(3000);
	ref.Reg_link();
	ref.gender();
	ref.firstname("vaibhav");
	ref.lastname("hatture");
	ref.emailid("admin20@gmail.com");
	ref.password("admin@123");
	ref.cpassword("admin@123");
	ref.register_button();
	
	}
}
