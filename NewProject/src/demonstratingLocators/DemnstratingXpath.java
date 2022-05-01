package demonstratingLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemnstratingXpath {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./New folder/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");		
		driver.findElement(By.xpath("html/body/div[4]/div/div[4]/div[3]/div/div/div[3]/div[2]/div/div[2]/div[3]/div[2]/input")).click();
		
		
		
	}

}
