package com.automation.prac;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrM_ActiTimeEle {
	
	public static void main(String args[]) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		driver.switchTo().activeElement().sendKeys("Admin",Keys.TAB);
		driver.switchTo().activeElement().sendKeys("admin123",Keys.TAB,Keys.TAB);
		driver.switchTo().activeElement().click();
	}

}
