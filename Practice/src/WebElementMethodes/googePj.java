package WebElementMethodes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class googePj {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/akshay kad/eclipse-workspace/NewProject/New folder/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("selenium");
		
		List<WebElement>element =  driver.findElements(By.xpath("//span[text()='seenium']"));
		
		
		for(WebElement e:element){
			
			 
			System.out.println(e.getText());
		}
		
		
		

	}

}
