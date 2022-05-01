package tayebaMamProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Project8 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:/Users/akshay kad/eclipse-workspace/NewProject/New folder/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		  driver.findElement(By.name("pwd")).sendKeys("manager");
		  driver.findElement(By.id("loginButton")).click();
		  
		  WebDriverWait wait= (WebDriverWait) driver;
		  wait.until(ExpectedConditions.attributeContains(By.linkText("Enter Time-Track"), "class", "item active"));
		  driver.findElement(By.linkText("Logout")).click();
		  

	}

}
