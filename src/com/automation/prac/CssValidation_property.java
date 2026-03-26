package com.automation.prac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssValidation_property {
	public static void main(String args[]) throws InterruptedException
	{
	
	WebDriver driver = new ChromeDriver();
	
    driver.manage().window().maximize();
    
    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    
    Thread.sleep(5000);
    
    WebElement uname1 = driver.findElement(By.xpath("//input[@name='username']"));
    uname1.clear();
    uname1.sendKeys("Admin");
    
    WebElement pwd1 = driver.findElement(By.xpath("//input[@type='password']"));
    pwd1.clear();
    pwd1.sendKeys("admin123");
    
    Thread.sleep(5000);
    
  
    WebElement LoginBtn = driver.findElement(By.xpath("//button[@type='submit']"));
    
    System.out.println("The color of Login Button is: "+ LoginBtn.getCssValue("color"));
    
    LoginBtn.click();
    
    
}
}
