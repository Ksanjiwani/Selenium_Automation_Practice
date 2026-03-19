package Selenium_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpiceJet_App_Opeartion {
	public static void main(String args[])
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String Url = "https://www.spicejet.com/";
		driver.get(Url);
		
		System.out.println("Current URL is: " + driver.getCurrentUrl());
		System.out.println("Current Title is: " + driver.getTitle());
		
		
		
		driver.quit();
		
	}

}
