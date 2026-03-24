package com.automation.prac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browse_opn_flipkart {
	
	public static void main(String args[])
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com");
		
		String PageTitle = driver.getTitle();
		System.out.println("Current Web Page Title is: " + PageTitle);
		
		String Url = driver.getCurrentUrl();
		System.out.println("Current URL is: "+ Url);
		
		//Validation part
		
		if(PageTitle.equals("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!"))
		{
			System.out.println("The Title is Validated");
		}
		
		if(Url.equals("https://www.flipkart.com/"))
		{
			System.out.println("The URL is Validated");
		}
		
		driver.quit();
	}

}
