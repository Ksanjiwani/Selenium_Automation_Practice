package Selenium_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Url_Opearation {
	public static void main(String args[])
	{
		WebDriver driver = new ChromeDriver();
		String URL ="https://www.Google.com";
		driver.get(URL);
		
		driver.quit();
	}

}
