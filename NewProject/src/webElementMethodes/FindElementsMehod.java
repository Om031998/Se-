package webElementMethodes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsMehod {
	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "./New folder/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		List<WebElement> element  = driver.findElements(By.xpath("//input[@type='radio']"));
		int size=element.size();

		for(int i=size-1;i>0;i--) { 
			element.get(i).click();



		}


	}
}
