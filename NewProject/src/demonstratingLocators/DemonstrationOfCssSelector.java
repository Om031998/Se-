package demonstratingLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemonstrationOfCssSelector {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./New folder/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("abd@reddifmail.com");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("rox99");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input#remember")).click();
		driver.findElement(By.cssSelector(".proceed")).click();
		
	}

}
