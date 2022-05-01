package WebElementMethodes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MamaEarth {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/akshay kad/eclipse-workspace/NewProject/New folder/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://mamaearth.in/");
		driver.findElement(By.id("wzrk-cancel-id")).click();
		driver.findElement(By.xpath("(//input[@placeholder='Search for products...'])[1]")).sendKeys("Onion oil");
	
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button/span[text()='Add To Cart'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button/span[text()='Add To Cart'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button/span[text()='Add To Cart'])[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button/span[text()='Add To Cart'])[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button/span[text()='Add To Cart'])[5]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Cart']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[@class='icon-holder'])[3]")).click();
		
		
		
		
		
		
		
		
		
	}
}
