package com.automation.prac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Resizeable {
	public static void main(String args[])
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/");
		
		driver.findElement(By.xpath("//a[text()='Resizable']")).click();
		Actions act = new Actions(driver);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		WebElement res = driver.findElement(By.xpath("//div[@id='resizable']//div[last()]"));
		
		act.clickAndHold(res).moveByOffset(200, 0).release().build().perform();
	}

}
