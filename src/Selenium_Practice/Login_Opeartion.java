package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Opeartion {
	
	public static void main(String args[])
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url = "https://rahulshettyacademy.com/loginpagePractise/";
		driver.get(url);
		
		String UserName = "Sanjiwani";
		driver.findElement(By.id("username")).sendKeys(UserName);
		
		String Password = "Ksanjiwani@2025";
		driver.findElement(By.id("password")).sendKeys(Password);
		
		driver.findElement(By.id("signInBtn")).click();
	}

}
