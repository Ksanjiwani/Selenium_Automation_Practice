package com.automation.prac;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_Handling {
	public static void main(String args[]) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		WebElement fram1 = driver.findElement(By.xpath("//iframe[@id='singleframe']"));
		
		driver.switchTo().frame(fram1);
		
		WebElement text = driver.findElement(By.xpath("//input[@type='text']"));
		text.sendKeys("Selenium");
		
	    driver.switchTo().defaultContent();
	    
	    Thread.sleep(3000);
	    
	    driver.findElement(By.cssSelector("a[href='#Multiple']")).click();
	    Thread.sleep(2000);
	    
	    WebElement oframe = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
	    driver.switchTo().frame(oframe);
	    WebElement iframe = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
	    driver.switchTo().frame(iframe);
	    
	    WebElement text1 = driver.findElement(By.xpath("//input[@type='text']"));
		text1.sendKeys("Automation");
		Thread.sleep(3000);
		
		driver.switchTo().defaultContent();
		
		List<WebElement> tframe = driver.findElements(By.xpath("//iframe"));
		System.out.println("No of frame in webpage are: "+ tframe.size());
		List<WebElement> img = driver.findElements(By.xpath("//img"));
		System.out.println("No of images in webpage are: "+ img.size());
		
		
		
		
	}

}
