package com.automation.prac;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple_dd_handler {
	public static void main(String args[]) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		WebElement md = driver.findElement(By.id("multiselect1"));
		Select s = new Select(md);
		System.out.println("The DD is multdelec or not: "+ s.isMultiple());
		s.selectByIndex(1);
		Thread.sleep(2000);
		s.selectByValue("Hyundaix");
		Thread.sleep(2000);
		s.selectByVisibleText("Audi");
		Thread.sleep(2000);
		s.selectByIndex(2);
		Thread.sleep(5000);
		
		List<WebElement> soption = s.getAllSelectedOptions();
		for(int i=0;i<soption.size();i++)
		{
			System.out.println(soption.get(i).getText());
		}
		
		s.deselectByIndex(1);
		Thread.sleep(2000);
		s.deselectByValue("Hyundaix");
		Thread.sleep(2000);
		s.deselectByVisibleText("Audi");
		Thread.sleep(2000);
		
		s.deselectAll();
		
		List<WebElement> options = s.getOptions();
		for(int i=0;i<options.size();i++)
		{
			System.out.println(options.get(i).getText());
		}
		
		
		
	}

}
