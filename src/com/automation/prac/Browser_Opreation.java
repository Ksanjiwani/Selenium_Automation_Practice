package com.automation.prac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Opreation {
	public static void main(String args[]) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
            driver.get("https://www.amazon.in/");
            Thread.sleep(9000);
            
            WebElement prime = driver.findElement(By.cssSelector("div[id='nav-xshop'] div[id='nav-link-groceries'] span"));
            
        System.out.println("Amaon prime video Label Text Name is: "+ prime.getText());
        
        prime.click();
        
        Thread.sleep(5000);
        
        driver.navigate().back();
        Thread.sleep(5000);
        
        driver.navigate().forward();
        Thread.sleep(5000);
        
        driver.navigate().back();
        
        driver.navigate().refresh();
        Thread.sleep(5000);
        
        driver.navigate().to("https://www.google.com");
        
        
        
        
	}

}
