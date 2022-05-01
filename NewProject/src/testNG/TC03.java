package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC03 {
	@Test(groups = "reg")
	public void webSite3() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./New folder/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mamaearth.in/");
		Thread.sleep(3000);
		driver.close();
	}
}
