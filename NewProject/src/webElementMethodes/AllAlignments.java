package webElementMethodes;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllAlignments {
	
	public Rectangle toString(Rectangle r) {
		return r;
		
	}

	public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver", "./New folder/chromedriver.exe");
			ChromeDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("http://demowebshop.tricentis.com/");
			
			WebElement element1 = driver.findElement(By.xpath("(//div[@class='item-box'])[1]"));
			int i1=element1.getLocation().getX();
			
			
			String s=element1.getAttribute("value");//1
			System.out.println(s);
			
			System.out.println(element1.getTagName());//2
			
			System.out.println(element1.getText());//3
			
			System.out.println(element1.getCssValue("colour"));//4
			
			org.openqa.selenium.Point p=element1.getLocation();//5
			System.out.println(p);
			
			Dimension d=element1.getSize();//6
			System.out.println(d);
			
			Rectangle r=element1.getRect();//7
			System.out.println(r);
			
			System.out.println(element1.isDisplayed());//8
			 WebElement e = driver.findElement(By.id("pollanswers-2"));
			 System.out.println(e.isSelected());//9
			 Thread.sleep(3000);
			 e.click();
			 System.out.println(e.isSelected());
			 
			 
			
			
			
			/*
			 * WebElement element2 =
			 * driver.findElement(By.xpath("(//div[@class='item-box'])[4]")); int
			 * i2=element2.getLocation().getX();
			 * 
			 * int x1=element1.getRect().getHeight(); int x2=element1.getRect().getY();
			 * 
			 * int y1=element2.getRect().getHeight(); int y2=element2.getRect().getY();
			 * System.out.println(x1+x2); System.out.println(y2); if(x1+x2<=y2) {
			 * System.out.println("done"); }else { System.out.println("not matching"); }
			 */
			
			
			
			
			
			
			
	}

}
