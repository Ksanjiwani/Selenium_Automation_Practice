package com.automation.prac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetProperty_orangeHrm {
	public static void main()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		WebElement username = driver.findElement(By.cssSelector("input[name='username']"));
		System.out.println("Username placeholder value is: "+username.getAttribute("placeholder"));
		
		WebElement pwd = driver.findElement(By.cssSelector("input[type='password']"));
		System.out.println("Password field Tag Name is: "+ pwd.getTagName());
	}

}
