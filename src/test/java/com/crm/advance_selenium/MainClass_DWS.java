package com.crm.advance_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MainClass_DWS extends BaseClass_DWS {

	public static void main(String[] args) throws InterruptedException {
		precondition("CHROME");
		Thread.sleep(2000);
		login();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).click();Thread.sleep(2000);
		driver.findElement(By.id("giftcard_2_RecipientName")).sendKeys("vaibhav");Thread.sleep(2000);
		driver.findElement(By.id("giftcard_2_RecipientEmail")).sendKeys("vaibhav@gmail.com");Thread.sleep(2000);
		WebElement SenderName = driver.findElement(By.id("giftcard_2_SenderName"));
		SenderName.clear();
		SenderName.sendKeys("vaibhav");Thread.sleep(2000);
		WebElement SenderEmail = driver.findElement(By.id("giftcard_2_SenderEmail"));
		SenderEmail.clear();
		SenderEmail.sendKeys("vaibhav123@gmail.com");Thread.sleep(2000);
		driver.findElement(By.id("giftcard_2_Message")).sendKeys("Hello from solapur");Thread.sleep(2000);
		WebElement qty = driver.findElement(By.id("addtocart_2_EnteredQuantity"));Thread.sleep(2000);
		qty.clear();
		qty.sendKeys("1");
		driver.findElement(By.xpath("//input[@id='add-to-cart-button-2']")).click();Thread.sleep(2000);
		WebElement product = driver.findElement(By.xpath("//h1[text()='$25 Virtual Gift Card']"));
		if (product.isDisplayed()) {
			System.out.println("Product is addedd sucessfully into Cart....");
		} else {
			System.out.println("Product is not addedd into cart ");
		}
		postcondition();

	}

}
