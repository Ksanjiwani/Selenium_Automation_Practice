package com.automation.prac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_opn2 {
	public static void main(String args[]) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		
		WebElement year = driver.findElement(By.id("yearbox"));
		Select s = new Select(year);
		
		s.selectByValue("1995");
		
		Thread.sleep(2000);
		
		
		WebElement month = driver.findElement(By.xpath("//select[@placeholder='Month']"));
		Select s1 = new Select(month);
		s1.selectByIndex(7);
		
		Thread.sleep(3000);
		
		WebElement date = driver.findElement(By.id("daybox"));
		Select s2 = new Select(date);
		s2.selectByVisibleText("16");
		
		
	}

}
