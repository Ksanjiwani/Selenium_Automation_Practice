package Selenium_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_opn {
	
	public static void main(String args[])
	{
		WebDriver driver =  new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		String Title = driver.getTitle();
		System.out.println(Title);
		
		
		
	}

}
