package com.automation.prac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Opn3 {
	public static void main(String args[])
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/");
	
		
		WebElement drag = driver.findElement(By.xpath("//a[text()='Draggable']"));
		drag.click();
		
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		Actions act = new Actions(driver);
		WebElement srcele = driver.findElement(By.xpath("//div[@id='draggable']"));
		
		act.dragAndDropBy(srcele, 100, 100).perform();
	}

}
