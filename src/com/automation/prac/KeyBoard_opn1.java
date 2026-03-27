package com.automation.prac;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyBoard_opn1 {
	public static void main(String args[]) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		
		WebElement fname = driver.findElement(By.cssSelector("input[placeholder='First Name']"));
		fname.sendKeys("JAVA");
		fname.sendKeys((Keys.chord(Keys.CONTROL,"a")),(Keys.chord(Keys.CONTROL,"c")));
		
		Thread.sleep(3000);
		WebElement sname = driver.findElement(By.cssSelector("input[placeholder='Last Name']"));
		sname.sendKeys(Keys.chord(Keys.CONTROL,"v"));
		
	
	}

}
