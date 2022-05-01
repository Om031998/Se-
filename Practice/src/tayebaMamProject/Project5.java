package tayebaMamProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Project5 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/akshay kad/eclipse-workspace/NewProject/New folder/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.facebook.com/");
		driver.findElement(By.partialLinkText("Create")).click();
		Thread.sleep(3000);
		WebElement date = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select sc = new Select(date);
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		System.out.println(sc.isMultiple());
		sc.selectByVisibleText("3");
		sc.selectByIndex(2);
		sc.selectByValue("3");
		
		Select sc1 = new Select(month);
		sc1.selectByVisibleText("Dec");
		sc1.selectByIndex(11);
		sc1.selectByValue("12");
		
		Select sc2 = new Select(year);
		sc2.selectByValue("1998");
		sc2.selectByVisibleText("1998");
		sc2.selectByIndex(24);
		Thread.sleep(3000);

	}
}
