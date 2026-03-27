package com.automation.prac;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_opn1 {
	public static void main(String args[]) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(3000);
		
		WebElement dd = driver.findElement(By.id("Skills"));
		Select s = new Select(dd);
		
		List<WebElement> option = s.getOptions();
		Iterator<WebElement> itr = option.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next().getText());
		}
		System.out.println("Total no of options are: "+ option.size());
		System.out.println("THe DD is multiselcted or not: "+ s.isMultiple());
		
		WebElement dselect = s.getFirstSelectedOption();
		System.out.println("By default select option is: " + s.getFirstSelectedOption().getText());
		
		String eselect = "Select Skills";
		System.out.println("Default select option validate or not: "+(dselect).getText().equals(eselect));
		
		s.selectByValue("MySQL");
		
		Thread.sleep(3000);
	}

}
