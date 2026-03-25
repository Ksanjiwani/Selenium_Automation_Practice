package com.automation.prac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector_MultiAttribute {
	public static void main(String args[]) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.cssSelector("a[href='/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles']")).click();
				//"a[data-csa-c-content-id='nav_cs_mobiles']"))
		
		Thread.sleep(5000);
		
		driver.findElement(By.cssSelector("a[class='nav-logo-link nav-progressive-attribute']")).click();
		Thread.sleep(5000);
		
		driver.quit();
		
		
	}

}
