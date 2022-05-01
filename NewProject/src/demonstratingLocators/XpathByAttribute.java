package demonstratingLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAttribute {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./New folder/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("(//input[@value='Add to cart'])[2]")).click();
	}

}
