package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DWS_GC_main {
	@Test
	public void login() throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demowebshop.tricentis.com/");
	DWS_GC ref = new DWS_GC(driver);
	Thread.sleep(3000);
	ref.GC();
	ref.orderby();
	ref.pagesize();
	ref.view();
	ref.product();
	ref.RecipientName("Ajay");
	ref.SenderName("Vijay");
	ref.Message("This gift from Ajay");
	ref.ATC();

}
}