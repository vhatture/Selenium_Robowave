package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DWS_HomePage_Main {
	@Test
	public void login() throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demowebshop.tricentis.com/");
	DWS_HomePage ref= new DWS_HomePage(driver);
	Thread.sleep(3000);
	ref.title();
	ref.register();
	ref.login();
	ref.cart();
	ref.wishlist();
	ref.search();
	ref.searchBtn();
	ref.books();
	ref.computers();
	ref.electronics();
	ref.apparel();
	ref.jewelry();
	ref.giftCard();
	ref.newsLetterEmail();
	ref.subscribe();
	ref.pollanswer1();
	ref.pollanswer2();
	ref.pollanswer3();
	ref.pollanswer4();

}
}