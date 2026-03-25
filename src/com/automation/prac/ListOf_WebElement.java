package com.automation.prac;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListOf_WebElement {
	public static void main(String args[])
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://www.flipkart.com/");
		
		List<WebElement> options = driver.findElements(By.cssSelector("div[class='css-g5y9jx r-18u37iz']>div"));
		System.out.println("Total No of Elements are: "+ options.size());
		
		for(int i =0; i<options.size(); i++)
		{
			System.out.println(options.get(i).getText());
		}
		
	}

}
