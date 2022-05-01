package handleingDropDowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelectDD {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./New folder/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/akshay%20kad/Downloads/dropDown.html");
		WebElement element = driver.findElement(By.id("m1"));
		Select sc= new Select(element);
		int i=sc.getOptions().size();
		for(int j=0;j<i;j++) {
			   sc.selectByIndex(j);
		
		}
		
		/*
		 * System.out.println(sc.isMultiple()); System.out.println();
		 * sc.selectByValue("1"); sc.selectByVisibleText("Orange"); sc.selectByIndex(6);
		 * List<WebElement> elements = sc.getAllSelectedOptions();
		 * System.out.println(sc.getFirstSelectedOption()); System.out.println();
		 * for(WebElement e:elements) { System.out.println(e.getText()); }
		 * //sc.deselectAll(); Thread.sleep(3000);
		 * 
		 * sc.deselectByIndex(6); sc.deselectByValue("1");
		 * sc.deselectByVisibleText("Orange");
		 * 
		 * 
		 * 
		 * driver.close();
		 */
	}

}
