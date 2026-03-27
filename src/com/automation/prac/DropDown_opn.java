package com.automation.prac;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_opn {
	public static void main(String args[]) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://blazedemo.com/");
		
		WebElement dropdown = driver.findElement(By.name("fromPort"));
		
		Select s = new Select(dropdown);
		System.out.println("Is the DD is MultSelect Or Not: "+ s.isMultiple());
		//Select DD by index
		s.selectByIndex(3);
		Thread.sleep(5000);
		
		//Select DD by value attribute
		s.selectByValue("San Diego");
		Thread.sleep(5000);
		
		//Select DD by VisibleText
		s.selectByVisibleText("Mexico City");
		
		Thread.sleep(5000);
		
		//Print All OPtions in DD list
		
		List<WebElement> options = s.getOptions();
		
		for(WebElement element:options)
		{
			System.out.println(element.getText());
		}
		
		System.out.println("Total Elements in List are: "+ options.size());
		
		List<String> optstring = new ArrayList<String>();
		for(int i =0; i<options.size();i++)
		{
			optstring.add(options.get(i).getText());
		}
		
		List<String> options1 = new ArrayList<String>(optstring);
		Collections.sort(options1);
		System.out.println("The DD  is sorted or not: "+ (options1==optstring));
		
		System.out.println("Unsortred List is: "+ optstring);
		System.out.println("Sorted List is: "+options1);
		
	}

}
