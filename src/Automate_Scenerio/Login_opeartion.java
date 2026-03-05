package Automate_Scenerio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_opeartion {
	public static void main(String args[]) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		String Url = "https://rahulshettyacademy.com/locatorspractice/";
		driver.get(Url);
		
		String username = "sanjiwani";
		driver.findElement(By.id("inputUsername")).sendKeys(username);
		
		String password = "pass@123";
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		
		driver.findElement(By.className("submit")).click();
		
//		WebElement errormsg = driver.findElement(By.xpath("//p[@class='error']"));
//		
//		String emsg = errormsg.getText();
//		System.out.println(emsg);
		
		String fpwd = "Forgot your password?";
		driver.findElement(By.linkText(fpwd)).click();
		Thread.sleep(4000);
		
		driver.findElement(By.className("reset-pwd-btn")).click();
		
		WebElement msg = driver.findElement(By.className("infoMsg"));
		String infomsg = msg.getText();
		System.out.println(infomsg);
		
		String PasswordBreak [] = infomsg.split("'");
		System.out.println(PasswordBreak[1]);
		
		driver.findElement(By.className("go-to-login-btn")).click();
		
		driver.findElement(By.id("inputUsername")).sendKeys(username);
		driver.findElement(By.name("inputPassword")).sendKeys(PasswordBreak[1]);
		driver.findElement(By.className("submit")).click();
		
		
		Thread.sleep(2000);

	}
	

}
