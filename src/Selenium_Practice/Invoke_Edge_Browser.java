package Selenium_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Invoke_Edge_Browser {
	public static void main(String args[])
	{
		WebDriver driver = new EdgeDriver();
		driver.close();
	}

}
