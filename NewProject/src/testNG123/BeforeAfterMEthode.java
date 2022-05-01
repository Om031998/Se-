package testNG123;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;

public class BeforeAfterMEthode extends AnnotationsBAF {
	
	@BeforeMethod
	public void login() {
	driver.get("https://demo.actitime.com/login.do");
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.id("loginButton")).click();
	}

}
