package webElementMethodes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindLinks {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./New folder/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		List<WebElement> element = driver.findElements(By.tagName("a"));
		for(WebElement e:element) {
			System.out.println(e.getAttribute("href"));
		}

	}

}
