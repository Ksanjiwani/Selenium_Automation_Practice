package com.automation.prac;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTextList {
	
	public static void main(String args[])
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.cssSelector("#APjFqb")).sendKeys("chatgpt");
		
		List <WebElement> options = driver.findElements(By.cssSelector(".OBMEnb ul>li .wM6W7d.WggQGd>span"));
		System.out.println("Toltal no of elements are: "+ options.size());
		
		
	}

}
