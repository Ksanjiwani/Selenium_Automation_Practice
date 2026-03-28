package com.automation.prac;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Property_Reading_practice {
	
	public static void main(String args[]) throws IOException, InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		FileInputStream fis = new FileInputStream("./src/com/automation/prac/orangehrm.properties");
		Properties prop = new Properties();
		prop.load(fis);
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(prop.getProperty("password"));
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}

}
