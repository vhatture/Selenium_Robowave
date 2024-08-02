package com.crm.advance_selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass_DWS_CLO {
	public WebDriver driver;
	@BeforeClass
	public void precondition() {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
	}
	@BeforeMethod
	public void login() throws InterruptedException {
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("Email")).sendKeys("hatturevaibhav199@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Hatture@123");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
	}
	@AfterMethod
	public void logout() {
		driver.findElement(By.xpath("//a[text()='Log out']")).click();
		
	}
	@AfterClass
	public void postcondition() {
		System.out.println("TASK COMPLETED");
		driver.quit();
	}
}
