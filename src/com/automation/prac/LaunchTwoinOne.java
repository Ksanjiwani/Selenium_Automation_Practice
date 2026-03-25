package com.automation.prac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchTwoinOne {
	public static void main(String args[])
	{
		WebDriver driver = new ChromeDriver();
		WebDriver driver1 = new EdgeDriver();
		
		driver.manage().window().maximize();
		driver1.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver1.get("https://www.amazon.in/");
		
		
		//driver.quit();
		//driver1.quit();
	}
	
	  

}
