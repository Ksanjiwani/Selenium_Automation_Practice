package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemo_loc_prac {
	public static void main(String args[])
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		
		WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys("standard_user");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		
		driver.findElement(By.id("login-button")).click();
		
		String Hurl = driver.getCurrentUrl();
		System.out.println("Home page URL is : " + Hurl );
		
		String Htitle = driver.getTitle();
		System.out.println("Home page Title is: " + Htitle);
		
	}

}
