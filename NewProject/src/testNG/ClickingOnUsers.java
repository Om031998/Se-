package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ClickingOnUsers extends ActionsOnActiTime{
	@Test
	public void ClickingOnUsers() {
		WebElement usersButton = driver.findElement(By.id("container_users"));
		usersButton.click();
	}

}

