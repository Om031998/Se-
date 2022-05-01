package tayebaMamProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project9 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/akshay kad/eclipse-workspace/NewProject/New folder/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("///C:/Users/akshay%20kad/Desktop/log.html");
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("bhai daru pilayga?");
	}

}
