package alert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./New folder/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://licindia.in/?gclid=Cj0KCQjw3IqSBhCoARIsAMBkTb2wgHReG5LHwmXgF9x3ERTe35CkJU0gQj05KGZs6XC-LGBUlMC64BMaAvAzEALw_wcB");
		
		Thread.sleep(5000);
		driver.findElement(By.linkText("Calculator")).click();
		
		driver.switchTo().alert().accept();

	}

}
