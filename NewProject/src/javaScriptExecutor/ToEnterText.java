package javaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToEnterText {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./New folder/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		WebElement element= driver.findElement(By.id("small-searchterms"));
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='Hi SELENIUMs'",element);
		

	}}
