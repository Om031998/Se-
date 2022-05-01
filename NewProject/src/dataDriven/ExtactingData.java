package dataDriven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import testNG.DataProviderAnnotation;

public class ExtactingData {
	@Test(dataProvider = "data" , dataProviderClass =DataProviderAnnotation.class)
	public void login(String info) {
		System.setProperty("webdriver.gecko.driver", "./New folder/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		  driver.get("https://demo.actitime.com/login.do"); WebElement UN =
		  driver.findElement(By.id("username")); UN.sendKeys(info);
		 
		
	}

}
