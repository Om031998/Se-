package WebElementMethodes;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class YehRistaKyaKehlataHai {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:/Users/akshay kad/eclipse-workspace/NewProject/New folder/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
				  driver.manage().window().maximize();
				  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				 
				  driver.get("file:///C:/Users/akshay%20kad/Downloads/MultipleWindow.html"); 
				  String k= "Welcome to Five Guys";
				  driver.findElement(By.tagName("input")).click();
				  Set<String> win = driver.getWindowHandles();
				 
					  for(String s:win) {
						  driver.switchTo().window(s);
						  String s1=driver.getTitle();
						  System.out.println(s1);
						 
						   if(k.equals(s1)) {
							  if(s1.equals("Multiple popups")) {
								  break;
							  }else {
								  driver.manage().window().maximize();
							  }
							 
						  }else {
							  driver.close();
							 
						  }
					  }
				  }

	}
	
