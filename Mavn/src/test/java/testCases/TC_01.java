package testCases;
/**
 * OM
 */
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genericPacage.Base_Class;
import genericPacage.ExcelReader;
import pom_Scripts.Login;

public class TC_01 extends Base_Class {
	@Test
	public void login() throws EncryptedDocumentException, IOException {
		ExcelReader read=new ExcelReader();
		String name = read.getData("Sheet1", 0, 0);
		String pwd = read.getData("Sheet1", 0, 1);
		Login lg=new Login(driver);
		lg.entervalueIn_userNameTF(name);
		lg.entervalueIn_passwordTF(pwd);
		lg.clickLoginButton();
	}

}
