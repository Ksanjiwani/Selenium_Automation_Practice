package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Facebopn {
	public static void main(String args[])
	{
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
		
		String Title = driver.getTitle();
		System.out.println("Current Title is: "+Title);
		System.out.println("Current Title Length is: "+Title.length());
		if(Title.equals("Facebook"))
		{
			System.out.println("Title validation pass");
		}
		
		String URL = driver.getCurrentUrl();
		System.out.println("Current URL is: " + URL);
		
		driver.findElement(By.id("_R_64qjbjb9pb6amH1_")).sendKeys("TestUser");
		driver.findElement(By.id("_R_66qjbjb9pb6amH1_")).sendKeys("Test@123");
		driver.findElement(By.id("")).click();
		
		
	}

}
