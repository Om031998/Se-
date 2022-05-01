package genericPacage;
/**
 * OM
 */
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Base_Class implements FrameConstants{
	public static WebDriver driver;
	
	@BeforeClass(alwaysRun = true)
	public void launchBrowser() throws IOException {
		
		//if( browserName.equalsIgnoreCase("chrome")) {
			System.setProperty(Chrome_Key,Chrome_Path);
			driver=new ChromeDriver();
			Reporter.log("Launching Chrome Browser");
			
			/*
			 * }else if(browserName.equalsIgnoreCase("firefox")) {
			 * System.setProperty(Firefox_Key, Firefox_Path); driver=new FirefoxDriver();
			 * Reporter.log("Launching FireFox Browser"); }else {
			 * Reporter.log("Invalid Browser Name"); }
			 */
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		PropertyfileReader fileReader=new PropertyfileReader();
		String url=fileReader.getPropertyValue("url");
		driver.get(url);
	}
	@AfterClass(alwaysRun = true)
	public void closingBrowser() {
		driver.quit();
		Reporter.log("Browser Closed");
	}
	

}
