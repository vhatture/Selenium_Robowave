package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DWS_Register {
		public DWS_Register(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	private @FindBy(className = "ico-register")
	WebElement Reg_link;
	
	private @FindBy(id = "gender-male")
	WebElement gender;
	
	private@FindBy(name = "FirstName")
	WebElement firstname;
	
	private@FindBy(name = "LastName")
	WebElement lastname;
	
	private@FindBy(id = "Email")
	WebElement email;
	
	private@FindBy(name = "Password")
	WebElement password;
	
	private@FindBy(name = "ConfirmPassword")
	WebElement cpassword;
	
	private@FindBy(id = "register-button")
	WebElement register_button;
	
	
	public void Reg_link() {
		Reg_link.click();
	}
	public void gender() {
		gender.click();
	}
	public void firstname(String first) {
		firstname.sendKeys(first);
	}
	public void lastname(String last) {
		lastname.sendKeys(last);
	}
	public void emailid(String emailid) {
		email.sendKeys(emailid);
	}
	public void password(String pass) {
		password.sendKeys(pass);
	}
	public void cpassword(String cpass) {
		cpassword.sendKeys(cpass);
	}
	public void register_button() {
		register_button.click();;
	}

}
