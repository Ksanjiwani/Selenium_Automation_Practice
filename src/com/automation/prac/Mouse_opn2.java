package com.automation.prac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_opn2 {
	public static void main(String args[])
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		
		Actions act = new Actions(driver);
		
		WebElement logo = driver.findElement(By.cssSelector("svg[class='lnXdpd']"));
		
		act.contextClick(logo).perform();
	}

}
