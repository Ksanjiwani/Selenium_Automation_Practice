package com.automation.prac;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GsmArena_List {
	public static void main(String args[]) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.gsmarena.com/");
		Thread.sleep(25000);
		
		List<WebElement> options = driver.findElements(By.cssSelector("div[class='brandmenu-v2 light l-box clearfix']>ul>li"));
				
		System.out.println("Total Number Of Options Are: "+ options.size());
		
		for(WebElement element: options)
		{
			System.out.println(element.getText());
		}
		
	}

}
