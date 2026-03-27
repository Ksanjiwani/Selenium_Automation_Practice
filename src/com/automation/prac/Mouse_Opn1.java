package com.automation.prac;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Opn1 {
	public static void main(String args[]) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		WebElement body = driver.findElement(By.xpath("//body"));
		body.sendKeys(Keys.ESCAPE);
		
		//driver.findElement(By.xpath("//body")).sendKeys(Keys.ESCAPE);
		Actions act = new Actions(driver);
		
		
		WebElement login = driver.findElement(By.xpath("//div[div[div[div[a[span[text()='Login']]]]]]"));
		
		
		act.moveToElement(login).perform();
		
		Thread.sleep(5000);
		
		act.moveToElement(login, 100, 0);
		
	}

}
