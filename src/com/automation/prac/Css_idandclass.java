package com.automation.prac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_idandclass {
	public static void main(String args[]) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practice.qabrains.com/ecommerce/login");
		
		driver.findElement(By.cssSelector("#email")).sendKeys("test@qabrains.com");
		driver.findElement(By.cssSelector("input#password")).sendKeys("Password123");
		
		driver.findElement(By.cssSelector(".btn-submit")).click();
		
		Thread.sleep(3000);
		driver.quit();
	}

}
