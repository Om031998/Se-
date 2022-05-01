package synchronization;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplixitWait {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./New folder/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			//driver.switchTo().alert().
		driver.get("");
		
		  driver.findElement(By.id("username")).sendKeys("admin");
		  driver.findElement(By.name("pwd")).sendKeys("manager");
		  driver.findElement(By.id("loginButton")).click();
		  int count=0;
	
		  
		 while(count<=10000) {
			 try {
				 driver.findElement(By.linkText("Logout")).click();
				System.out.println("hi"+count);
				 break;
		 }
		 catch(Exception e){
			count++;
			
		 }
			 
		 }
			 
		 
		 
		 
		 
		 
		 //WebElement element = driver.findElement(By.linkText("Logout"));
			/*
			 * WebDriverWait wait= new WebDriverWait(driver, 10);
			 * wait.pollingEvery(Duration.ofSeconds(1));
			 * wait.until(ExpectedConditions.titleContains("actiIME"));
			 * System.out.println("done");
			 */
		//wait.until(ExpectedConditions.visibilityOf(element));
		//wait.until(ExpectedConditions.attributeContains(element, "id","logoutLink"));
		//wait.until(ExpectedConditions.attributeToBeNotEmpty(element, "id"));
		//wait.until(ExpectedConditions.numberOfElementsToBeLessThan(By.linkText("Logout"), 2));
		
		//driver.findElement(By.id("container_tasks")).click();
		
	}
}
