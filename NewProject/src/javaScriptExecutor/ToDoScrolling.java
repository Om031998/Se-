package javaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToDoScrolling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./New folder/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		WebElement element= driver.findElement(By.xpath("(//input[@value='Add to cart'])[5]"));
		JavascriptExecutor js= (JavascriptExecutor) driver;
		/*
		 * js.executeScript("window.scrollTo(0,500)"); Thread.sleep(3000);
		 * js.executeScript("window.scrollBy(0,100)");
		 */
		/*
		 * js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		 * Thread.sleep(3000); js.executeScript("window.scrollTo(0,0)");
		 */
		js.executeScript("arguments[0].scrollIntoView(false)",element);
	}

}
