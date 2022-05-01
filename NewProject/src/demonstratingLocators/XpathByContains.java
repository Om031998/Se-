package demonstratingLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;

public class XpathByContains {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./New folder/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		/*
		 * String m =
		 * driver.findElement(By.xpath("//span[contains(text(),1800.00)]")).getText();
		 * double val = Double.parseDouble(m); double finl = val + 200;
		 * System.out.println(finl);
		 */
		driver.findElement(By.xpath("(//input[contains(@class,'button-2 product-box-add-to-cart-button')])[2]")).click();
	}

}
