package tayebaMamProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project7 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/akshay kad/eclipse-workspace/NewProject/New folder/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.google.com/intl/en-GB/gmail/about/");
		driver.findElement(By.linkText("Sign in")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("identifierId")).sendKeys("omprakashgope552@gmail.com",Keys.ENTER);
		
		
		
	
	}	
}
