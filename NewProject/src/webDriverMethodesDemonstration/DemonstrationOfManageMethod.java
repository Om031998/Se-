package webDriverMethodesDemonstration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemonstrationOfManageMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./new folder/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/akshay%20kad/Desktop/LoginPage11.html");
		Thread.sleep(3000);
		driver.manage().window().fullscreen();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		Point p = new Point(100, 200);
		driver.manage().window().setPosition(p);

		System.out.println("The Position is" + driver.manage().window().getPosition());
		Thread.sleep(3000);
		Dimension d = new Dimension(100, 200);

		driver.manage().window().setSize(d);
		System.out.println("The Size is" + driver.manage().window().getPosition());
		Thread.sleep(4000);
		driver.close();

	}

}
