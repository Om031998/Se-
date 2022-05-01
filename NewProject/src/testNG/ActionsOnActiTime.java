package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.seleniumhq.jetty9.util.log.Log;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class ActionsOnActiTime {
	WebDriver driver;
@BeforeClass
	public void LauchingBrowser() {
		System.setProperty("webdriver.chrome.driver", "./New folder/chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
@BeforeMethod
	public void LogIn() {
	driver.get("https://demo.actitime.com/login.do");
		WebElement username = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.name("pwd"));
		WebElement loginButton = driver.findElement(By.id("loginButton"));
		username.sendKeys("admin");
		password.sendKeys("manager");
		loginButton.click();
		
	}
@AfterMethod
      public void LogOut() {
	WebElement LogOutButton = driver.findElement(By.id("logoutLink"));
	LogOutButton.click();
}
@AfterClass
public void CloseTheBrowse() {
	driver.quit();
}










	
	

}
