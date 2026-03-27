package com.automation.prac;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyBoard_opn {
	public static void main(String args[]) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		WebElement body = driver.findElement(By.xpath("//body"));
		body.sendKeys(Keys.ESCAPE);
		
		Thread.sleep(3000);
		body.sendKeys(Keys.F5);
		Thread.sleep(2000);
		
		body.sendKeys(Keys.END);
		Thread.sleep(2000);
		
		body.sendKeys(Keys.HOME);
		Thread.sleep(2000);
		
		body.sendKeys(Keys.PAGE_DOWN);
		Thread.sleep(2000);
		
		body.sendKeys(Keys.PAGE_UP);
		Thread.sleep(2000);
		
	}

}
