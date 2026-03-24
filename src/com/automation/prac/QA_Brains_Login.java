package com.automation.prac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QA_Brains_Login {
	public static void main(String args[]) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://practice.qabrains.com/");
		
		driver.findElement(By.id("email")).sendKeys("qa_testers@qabrains.com");
		Thread.sleep(3000);
		
		driver.findElement(By.name("password")).sendKeys("Password123");
		Thread.sleep(3000);
		
		driver.findElement(By.className("btn-submit")).click();
		Thread.sleep(3000);
		
		String Title = driver.getTitle();
		System.out.println("The curent Page Title is: "+ Title);
		System.out.println("The Curent Page Title Length is: "+ Title.length());
		Thread.sleep(3000);
		
		
		driver.quit();
		
		
		
		
	}

}
