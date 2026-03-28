package com.automation.prac;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_opn_DoubleClick {
	public static void main(String args[])
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		Actions act = new Actions(driver);
		
		WebElement fname = driver.findElement(By.cssSelector("input[placeholder='First Name']"));
		WebElement lname = driver.findElement(By.cssSelector("input[placeholder='Last Name']"));
		
		act.moveToElement(fname).click().sendKeys("SDET").doubleClick().keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		
		act.moveToElement(lname).click().keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
	}

}
