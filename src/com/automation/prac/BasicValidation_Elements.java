package com.automation.prac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicValidation_Elements {
	public static void main(String args[])
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		System.out.println("The Logo is Displayed or Not: "+ driver.findElement(By.cssSelector(".navbar-brand>img[alt ='image not displaying']")).isDisplayed());
	    WebElement uname = driver.findElement(By.cssSelector("input[placeholder='First Name']"));
	    System.out.println("The Uname is Enabled or not: "+ uname.isEnabled() );
	    
	    WebElement pwd = driver.findElement(By.cssSelector("input[placeholder='Last Name']"));
	    System.out.println("The password is Enabled or not: "+ pwd.isEnabled());
	    
	    WebElement cbox = driver.findElement(By.cssSelector("#checkbox1"));
	    System.out.println("The CheckBox is Selected or not: "+ cbox.isSelected());
	    
	    int ufield = uname.getLocation().getY();
	    int pfield = pwd.getLocation().getY();
	    System.out.println("Is a username is on up postion password field: "+ (ufield < pfield));
	   WebElement Logo = driver.findElement(By.cssSelector(".navbar-brand>img[alt ='image not displaying']"));
	    System.out.println("postion of LOGO x axis is: "+ Logo.getLocation().getX());
	    System.out.println("postion of LOGO Y axis is: "+ Logo.getLocation().getY());
	}
	}


