package genericPacage;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Utility_Methods {
	public WebDriver driver;

	public void get_Title() {
		String title = driver.getTitle();
		System.out.println(title);
	}

	public void get_Url() {
		String pageurl = driver.getCurrentUrl();
		System.out.println(pageurl);
	}

	public void click_Action(WebElement element_To_Click) {
		element_To_Click.click();
	}

	public void enter_Value(WebElement text_Field, String text) {
		text_Field.sendKeys(text);
	}

	public Select select_classObject(WebElement dropdown) {
		Select select = new Select(dropdown);
		return select;
	}

	public Actions action_classObject(WebDriver driver) {
		Actions action = new Actions(driver);
		return action;
	}
	public void switch_toASpecificTitleWindow(String title) {
		String perentWindowID=driver.getWindowHandle();
		Set<String> allwindowID = driver.getWindowHandles();
		allwindowID.remove(perentWindowID);
		for(String id:allwindowID) {
			driver.switchTo().window(id);
			if(driver.getTitle().equalsIgnoreCase(title)) {
			break;	
			}
		}
	}
	public void switch_toASpecificWindow(WebElement element) {
		String parenID=driver.getWindowHandle();
		Set<String> all_ID = driver.getWindowHandles();
		all_ID.remove(parenID);
		for(String winId:all_ID) {
			driver.switchTo().window(winId);
			if(element.isDisplayed()) {
				break;
			}
		}
		
		
		
		
		
		
		
		
	}

}
