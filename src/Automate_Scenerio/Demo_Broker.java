package Automate_Scenerio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Broker {
	
	public static void main(String args[])
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://sampleapp.tricentis.com/");
	    
	    //
	    driver.findElement(By.id("nav_automobile")).click();
	    
	}

}
