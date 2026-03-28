package com.automation.prac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Handle {
  public static void main(String args[])
  {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  driver.get("https://demoqa.com/browser-windows");
	  
	  driver.findElement(By.xpath("")).click();
  }
}
