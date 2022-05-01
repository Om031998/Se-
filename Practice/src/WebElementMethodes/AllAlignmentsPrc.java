package WebElementMethodes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AllAlignmentsPrc {

	public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver", "C:/Users/akshay kad/eclipse-workspace/NewProject/New folder/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	WebElement element1= driver.findElement(By.id("email"));
	int i1=element1.getRect().height;
	int i2=element1.getRect().getY();
	
	WebElement element2= driver.findElement(By.id("passContainer"));
	int j=element2.getRect().getY();
	
	if(j>i1+i2+10) {
		System.out.println("Alignment is OK");
	}
	else {
		System.out.println("OverLapped");
	}
		
	}

}
           