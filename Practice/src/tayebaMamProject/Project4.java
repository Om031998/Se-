package tayebaMamProject;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project4 {
	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver","C:/Users/akshay kad/eclipse-workspace/NewProject/New folder/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://demowebshop.tricentis.com/");
		List<WebElement> element = driver.findElements(By.tagName("a"));
		for(WebElement e:element) {
			System.out.println(e.getText().length());
			System.out.println(e.getText());
		}
		
	}
}
