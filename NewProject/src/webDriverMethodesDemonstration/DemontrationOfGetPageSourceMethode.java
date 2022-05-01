package webDriverMethodesDemonstration;

import org.openqa.selenium.chrome.ChromeDriver;

public class DemontrationOfGetPageSourceMethode {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./New folder/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getPageSource());

	}

}
