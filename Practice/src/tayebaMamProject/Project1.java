package tayebaMamProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project1 {
public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:/Users/akshay kad/eclipse-workspace/NewProject/New folder/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.className("search-box-text")).sendKeys("Hi");
		driver.findElement(By.className("button-1")).click();
		Thread.sleep(3000);

	}

}
