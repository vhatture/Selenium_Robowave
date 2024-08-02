package TestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.crm.advance_selenium.BaseClass_DWS_CLO;

public class DWS_Main extends BaseClass_DWS_CLO {
	String current_url="https://demowebshop.tricentis.com/news/rss/1";
	@Test
	public void test() throws InterruptedException {
		
		Actions ar= new Actions(driver);
		ar.keyDown(Keys.PAGE_DOWN).build().perform();
		ar.keyDown(Keys.PAGE_DOWN).build().perform();
		List<WebElement> links = driver.findElements(By.xpath("//div[@class='column follow-us']/ul/li/a"));
		for (WebElement web : links) {
			String url = driver.getCurrentUrl();
			if (url.equals(current_url)) {
						driver.navigate().back();
						Thread.sleep(3000);
			}
			web.click();
			
			
		}
	}

}
