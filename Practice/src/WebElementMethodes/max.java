package WebElementMethodes;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class max {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/akshay kad/eclipse-workspace/NewProject/New folder/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.maxfashion.in/in/en/");
		driver.findElement(By.id("js-site-search-input")).sendKeys("jeans",Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//img[@alt='MAX Solid Elasticated Jeggings'])[1]")).click();
		
		Set<String> window = driver.getWindowHandles();
		for(String s:window) {
			System.out.println(s);
			driver.switchTo().window(s);
		}
		
		driver.findElement(By.xpath("//span[@class='MuiButton-label' and text()='L']")).click();
		driver.findElement(By.xpath("//span[text()='ADD TO BASKET']")).click();
		driver.close();
		Actions ac= new Actions(driver);
		
		WebElement e = driver.findElement(By.id("js-site-search-input"));
		e.clear();
		Thread.sleep(3000);
		e.sendKeys("T-shirt in men",Keys.ENTER);
		WebElement tshirt = driver.findElement(By.xpath("//img[@alt='MAX Sequinned Crew Neck T-shirt']"));
		ac.moveToElement(tshirt);
		WebElement td = driver.findElement(By.xpath("(//img[@width='100%'])[1]"));
		
		Select sc= new Select(td);
		sc.selectByVisibleText("7-8 Y");
		driver.findElement(By.xpath("//span[text()='ADD TO BASKET']")).click();
		
		
		

	}

}
