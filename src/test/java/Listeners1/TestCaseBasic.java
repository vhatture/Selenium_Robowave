package Listeners1;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.advance_selenium.BaseClassDWS;
@Listeners(com.crm.Listener1.BasicLisener.class)

public class TestCaseBasic extends BaseClassDWS {
	@Test
	public void main() {
		String exp_result = "https://demowebshop.tricentis.com/";
		String actual_result = driver.getCurrentUrl();
		assertEquals(exp_result, actual_result);
	}
	@Test
	public void main2() {
		String exp_result = "https://demowebshop.tricentis.com";
		String actual_result = driver.getCurrentUrl();
		assertEquals(exp_result,actual_result);
	}

}
