package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC01 {
	@Test(groups = "smoke")
public void webSite1() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./New folder/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	Thread.sleep(3000);
	driver.close();
}
}
