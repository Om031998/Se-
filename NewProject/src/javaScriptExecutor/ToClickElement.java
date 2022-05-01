package javaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToClickElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./New folder/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		WebElement element= driver.findElement(By.xpath("(//input[@value='Add to cart'])[5]"));
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()",element);

	}

}
