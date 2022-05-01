package alert;


import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HDPopup {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		  System.setProperty("webdriver.chrome.driver","./New folder/chromedriver.exe"); 
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
			
			  driver.get("https://www.makemytrip.com/"); Actions ac= new Actions(driver);
			  ac.click().perform(); Thread.sleep(3000);
			  driver.findElement(By.xpath("//p[@data-cy=\"departureDate\"]")).click() ;
			 
		  
		   LocalDateTime month = LocalDateTime.now().plusMonths(6);
		   
		String date= "0"+(LocalDateTime.now().getDayOfMonth()+1);
		
		   
		String dy = month.getDayOfWeek().toString();
		String dy1= dy.substring(0,1).toUpperCase()+dy.substring(1,3).toLowerCase();
		System.out.println(dy1);
		
		 
		 String m = month.getMonth().toString();
		String s = m.substring(0, 1);
		String x = m.substring(1, 3);
		String mf=s.toUpperCase()+x.toLowerCase();
		System.out.println(mf);
		
		for( ; ;) {
		try {
			
		driver.findElement(By.xpath("//div[contains(@aria-label,'"+mf+" "+date+" "+"2022')]/div/p[text()='date']")).click();
		break;
		}
		catch(Exception e){
			driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
		}
		
		}
	}

}
