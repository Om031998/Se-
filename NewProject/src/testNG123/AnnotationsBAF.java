package testNG123;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class AnnotationsBAF {
	 WebDriver driver;
 @BeforeClass
 public void launchBrowser() {
	 System.setProperty("webdriver.chrome.driver","./New folder/chromedriver.exe" );
	  driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
 }
 
@AfterClass
public void closeBrowser() {
	driver.quit();
}
	
}
