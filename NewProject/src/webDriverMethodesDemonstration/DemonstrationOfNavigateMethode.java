package webDriverMethodesDemonstration;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;

public class DemonstrationOfNavigateMethode {

	public static void main(String[] args) throws InterruptedException, MalformedURLException  {
		System.setProperty("webdriver.chrome.driver" , "./New folder/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");
		driver.navigate().to("https://en.wikipedia.org/wiki/Main_Page");
		driver.navigate().back();
		Thread.sleep(4000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		URL url= new URL("https://www.google.com/intl/en-GB/gmail/about/");
		driver.navigate().to("https://www.google.com/intl/en-GB/gmail/about/");
		
//navigate is navigation type object: navigate() method return type is navigation type object
	}

}
