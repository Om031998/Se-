package takingScreenshot;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakingScreenShotOfWebPage {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./New folder/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File file=new File("./Ss/ss.png");
		File snap=ts.getScreenshotAs(OutputType.FILE);
		
		// snap.renameTo(file); driver.close();
	
		//FileUtils.copyFile(snap, file);
		
		org.openqa.selenium.io.FileHandler.copy(file, snap);
		driver.close();

	}

}
