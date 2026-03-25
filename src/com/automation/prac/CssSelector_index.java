package com.automation.prac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector_index {
	
	public static void main(String args[]) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		Thread.sleep(5000);
		
		driver.findElement(By.cssSelector("#nav-link-amazonprime>*:nth-child(1)")).click();
		driver.findElement(By.cssSelector("[id='nav-logo-sprites']")).click();
		driver.quit();
	}

}
