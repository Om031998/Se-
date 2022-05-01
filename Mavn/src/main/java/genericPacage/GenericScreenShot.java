package genericPacage;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.apache.poi.hpsf.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class GenericScreenShot {
public static void getScreenShot(WebDriver driver) throws IOException{
	String screenShotPath=FrameConstants.Screenshot_Path;
	Date date=new Date();
	String screenshotDate=date.toString().replace(":","-");
	TakesScreenshot takeScreenShot=(TakesScreenshot) driver;
	File source=takeScreenShot.getScreenshotAs(OutputType.FILE);
	File destination=new File(screenShotPath+screenshotDate+".png");
	org.openqa.selenium.io.FileHandler.copy(source, destination);
}
}
