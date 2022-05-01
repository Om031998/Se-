package WebElementMethodes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReddifMail {
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver", "C:/Users/akshay kad/eclipse-workspace/NewProject/New folder/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	driver.findElement(By.id("login1")).sendKeys("mamatharangaswamaiah");
	driver.findElement(By.id("password")).sendKeys("Demo@143",Keys.ENTER);
	Thread.sleep(2000);
	driver.findElement(By.linkText("Write mail")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("TO_IDcmp2")).sendKeys("omprakashgope552@gmail.com",Keys.ENTER);
	driver.findElement(By.xpath("//input[@class='rd_inp_sub rd_subject_datacmp2']")).sendKeys("demo");
	Thread.sleep(1000);

	WebElement frame = driver.findElement(By.xpath("//iframe[@title='Rich Text Editor, rdMailEditorcmp2']"));
	driver.switchTo().frame(frame);
	
	driver.findElement(By.xpath("//body[@contenteditable='true']")).sendKeys("Hi Om");
	driver.switchTo().parentFrame();
	driver.findElement(By.xpath("//a[@class='send_ng_compo rd_btn_cmp_send']")).click();
	Thread.sleep(10000);
	
	driver.findElement(By.linkText("Inbox")).click();
	driver.findElement(By.xpath("(//cite[@title='Select mail'])[1]")).click();
	driver.findElement(By.className("rd_fil_del")).click();
	
	driver.findElement(By.xpath("//button[text()='Ok']")).click();
	/*
	 * driver.findElement(By.linkText("Sent")).click();
	 * driver.findElement(By.xpath("(//cite[@class='rd_mail_tickbox'])[1]")).click()
	 * ; driver.findElement(By.className("rd_fil_del")).click();
	 */
	
	
	
	
	
}
}