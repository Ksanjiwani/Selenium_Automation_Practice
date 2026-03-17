package Selenium_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Facebopn {
	public static void main(String args[])
	{
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
		
		String Title = driver.getTitle();
		System.out.println(Title);
	}

}
