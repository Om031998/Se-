package WebElementMethodes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebshop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/akshay kad/eclipse-workspace/NewProject/New folder/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS );
		
		
		driver.get("http://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();//Log In Button
		
		System.out.println(driver.getTitle());
		
		//driver.findElement(By.xpath("//input[@value='Register']")).click();//register button
		
		//Registering
		/*
		 * driver.findElement(By.id("gender-male")).click();//gender radio button
		 * driver.findElement(By.id("FirstName")).sendKeys("Devil,s");
		 * driver.findElement(By.id("LastName")).sendKeys("Devil");
		 * driver.findElement(By.id("Email")).sendKeys("testprakash@gmail.com");
		 * driver.findElement(By.id("Password")).sendKeys("rox9999");
		 * driver.findElement(By.id("ConfirmPassword")).sendKeys("rox9999");
		 * driver.findElement(By.id("register-button")).click();
		 */
		
		driver.findElement(By.id("Email")).sendKeys("testprakash@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("rox9999",Keys.ENTER);
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).click();
		String element = driver.findElement(By.xpath("//h1[@itemprop='name']")).getText();
		
		driver.findElement(By.id("giftcard_2_RecipientName")).sendKeys("Tupperware bottle");
		driver.findElement(By.id("giftcard_2_RecipientEmail")).sendKeys("bottle@gmail.com");
		driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).click();
		
		
		driver.findElement(By.linkText("Shopping cart")).click();
		
		System.out.println(driver.getTitle());
		
		String element1 = driver.findElement(By.linkText("$25 Virtual Gift Card")).getText();
		
		if(element1.equals(element)) {
			System.out.println("The Product added to the Cart");
		}else {
			System.out.println("product is not added");
		}
		driver.findElement(By.linkText("Log out")).click();
		System.out.println(driver.getTitle());
		
		
		
		
		
		
		

	}

}
