package Assert;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssert1 {
	@Test
	public void main() {
		String expected_url="https://demowebshop.tricentis.com";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		String actual_url = driver.getCurrentUrl();
		//assertEquals(expected_url, actual_url);
		SoftAssert soft= new SoftAssert();
		assertNotEquals(expected_url,actual_url, "url is not matching");
		Reporter.log("I am in DWS Homepage",true);
		WebElement search_field = driver.findElement(By.id("small-searchterms"));
		search_field.sendKeys("mobile",Keys.ENTER);
		WebElement as = driver.findElement(By.id("As"));
		as.click();
		soft.assertTrue(as.isSelected(),"element is not selected");
		//assertFalse(as.isSelected());
		driver.findElement(By.id("Isc")).click();
		soft.assertAll();
		System.out.println("TASK COMPLETED");
	}

}
