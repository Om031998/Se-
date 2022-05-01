package flipKart;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Flipkart {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "./New folder/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		  String Parent= driver.getWindowHandle(); Thread.sleep(3000);
		  driver.findElement(By.xpath("//button[text()='✕']")).click();
		  
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//img[@alt='Electronics']")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//img[@alt='sss'][2]")).click();
		  driver.findElement(By.
		  partialLinkText("TP-Link Archer C5400X 5400 Mbps Gaming Router")).click();
		  System.out.println(driver.getWindowHandles());
		  
		  driver.findElement(By.xpath("//input[@type='text']")).sendKeys("trimmer",Keys
		  .ENTER); driver.navigate().refresh(); Thread.sleep(2000);
		  driver.findElement(By.partialLinkText("PHILIPS BT3231/15")).click();
		  
		  Set<String> Allwindow = driver.getWindowHandles(); Allwindow.remove(Parent);
		  for(String s:Allwindow) { driver.switchTo().window(s); } Thread.sleep(2000);
		 
		driver.close();

	}
}