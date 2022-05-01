package webElementMethodes;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakingSsFromWE {

	public static void main(String[] args) throws InterruptedException, IOException {
		
			System.setProperty("webdriver.chrome.driver", "./New folder/chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://demowebshop.tricentis.com/");
			WebElement element = driver.findElement(By.linkText("$25 Virtual Gift Card")).findElement(By.xpath("//input[@value='Add to cart'][1]"));
			Thread.sleep(3000);		
			//element.click();
			File file= new File("./Ss/SS1.png");
			File srcfile=element.getScreenshotAs(OutputType.FILE);
			FileHandler.copy(srcfile, file);
			driver.close();

	}

}
