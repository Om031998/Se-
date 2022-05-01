package projectFacebook;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SignUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./New folder/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		driver.findElement(By.partialLinkText("Create")).click();
		Thread.sleep(3000);

		/*
		 * driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Nemesis"
		 * ); driver.findElement(By.name("lastname")).sendKeys("Returns");
		 * driver.findElement(By.name("reg_email__")).sendKeys("testprakash@gmail.com");
		 * driver.findElement(By.xpath("(//input[@data-type='text'])[4]")).sendKeys(
		 * "testprakash@gmail.com");
		 * driver.findElement(By.id("password_step_input")).sendKeys("qwerty@123");
		 */
		WebElement date = driver.findElement(By.xpath("//select[@name='birthday_day']"));

		Select sc = new Select(date);
		System.out.println(sc.isMultiple());
		/*
		 * List<WebElement> option = sc.getOptions(); for(WebElement element:option) {
		 * System.out.println(element.getText()); }
		 */

		sc.selectByVisibleText("3");
		WebElement month = driver.findElement(By.id("month"));
		Select sc1 = new Select(month);
		sc1.selectByValue("12");
		WebElement year = driver.findElement(By.id("year"));
		Select sc2 = new Select(year);
		sc2.selectByIndex(24);
		Thread.sleep(3000);
		driver.close();

	}

}
