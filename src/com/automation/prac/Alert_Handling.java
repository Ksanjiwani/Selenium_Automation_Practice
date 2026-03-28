package com.automation.prac;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alert_Handling {
	public static void main(String args[]) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
		driver.switchTo().alert().dismiss();
		
		driver.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		
		wait.until(ExpectedConditions.alertIsPresent());
		String msg = driver.switchTo().alert().getText();
		System.out.println(msg);
		driver.switchTo().alert().accept();
		
		
		
		
		driver.findElement(By.xpath("//button[@id='promtButton']")).click();
		driver.switchTo().alert().sendKeys("TESTER");
		
		driver.switchTo().alert().accept();
	
	}

}
